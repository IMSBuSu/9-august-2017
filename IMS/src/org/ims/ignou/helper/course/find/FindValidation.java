package org.ims.ignou.helper.course.find;

import org.ims.ignou.view.course.find.FindView;
public class FindValidation 
{
	private static int courseId;
	private static String courseName;
	public void onlyNumberAllowed(FindView findView){
		
		 CourseFindDto CourseFind = new CourseFindDto();
		 
		try{
			 
			Integer.parseInt(findView.getTxtCourseId().getText());
			courseName=findView.getTextCourseName().getText();
			if(!(courseName.equals(""))){
				System.out.println(courseId);
				
			}else
			{		
				if(!(Integer.toString(courseId).equals("")))
				{
					System.out.println(courseName);					
				}
			}
			
		}
		catch(NumberFormatException e)
		{
			
			findView.getLblerrormessagecourseid().setText("* Only Number Allowed");
			
		}
		
		
		
	}
	
	
		public void cannotBlank(FindView findView){
			if(!(findView.getTxtCourseId().getText().equals("")))
			{
				onlyNumberAllowed(findView);				
				
			}else{

				if(!(findView.getTextCourseName().getText().equals(""))){
					
					onlyNumberAllowed(findView);				
						
					
				}
				else{
					findView.getLblCannotBlank().setText("* Input Course Name or Course Id");							
				}									
			}
			
			
			
			
			
			
		}
}
