package org.ims.ignou.helper.course.delete;

import javax.swing.JOptionPane;


import org.ims.ignou.dao.course.find.SearchCourse;
import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.view.course.delete.CourseDeleteView;

public class DeleteValidation {

	
	private static CourseDto courseFindDto;
	
	public  void onlyNumberAllowed(CourseDeleteView findView){
	
		courseFindDto=new CourseDto();
		if(!(findView.getTextCourseName().getText().equals(""))){
			courseFindDto.setCourseName(findView.getTextCourseName().getText());
			SearchCourse course=new SearchCourse();
			if(course.searchUsingName(courseFindDto)){
				
				findView.setVisible(false);
				ShowFindRecorddelete showFindRecordhelper=new ShowFindRecorddelete();
				showFindRecordhelper.setDetails(SearchCourse.getCourseDetails());
				
			}
			else{
				JOptionPane.showMessageDialog(findView, "No Course Found !");
			}
		}
		else{						
			try{
				courseFindDto.setCourseId(Integer.parseInt(findView.getTxtCourseId().getText()));

				SearchCourse course=new SearchCourse();
				if(course.searchUsingId(courseFindDto)){
					
					findView.setVisible(false);
					ShowFindRecorddelete showFindRecordhelper=new ShowFindRecorddelete();
					showFindRecordhelper.setDetails(SearchCourse.getCourseDetails());
					
				}
				else{
					JOptionPane.showMessageDialog(findView, "No Course Found !");
				}
				
			}				
			catch(NumberFormatException e)
			{				
				findView.getLblerrormessagecourseid().setText("* Only Number Allowed");				
			}	
		}
	
	}

	
	public  void cannotBlank(CourseDeleteView findView){
		
		
		
		if(!(findView.getTextCourseName().getText().equals(""))){					
			onlyNumberAllowed(findView);															

		}
		else{
			if(!(findView.getTxtCourseId().getText().equals("")))
			{
				onlyNumberAllowed(findView);				
				
			}else{

				findView.getLblCannotBlank().setText("* Input Course Name or Course Id");							

			}

			
		}			
	
	}
}
