package org.ims.ignou.helper.course.update;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.course.find.SearchCourse;
import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.helper.course.find.ShowFindRecord;
import org.ims.ignou.view.course.update.CourseUpdateView;

public class SearchValidation 
{

private static CourseDto courseFindDto;
	
	public  void onlyNumberAllowed(CourseUpdateView findView){


		courseFindDto=new CourseDto();
		if(!(findView.getTextCourseName().getText().equals(""))){
			courseFindDto.setCourseName(findView.getTextCourseName().getText());
			SearchCourse course=new SearchCourse();
			if(course.searchUsingName(courseFindDto)){
				
				findView.setVisible(false);
				ShowFindRecordupdate showFindRecordhelper=new ShowFindRecordupdate();
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
					ShowFindRecordupdate showFindRecordhelper=new ShowFindRecordupdate();
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
	
	
		public  void cannotBlank(CourseUpdateView findView){
			
			
			
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
