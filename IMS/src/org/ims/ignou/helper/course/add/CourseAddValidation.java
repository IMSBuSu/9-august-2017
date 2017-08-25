package org.ims.ignou.helper.course.add;

import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.view.course.add.CourseAddView;

public class CourseAddValidation 
{
	private  CourseDto courseDetails;
		
	public void numberAllowed(CourseAddView courseView){
		
			courseDetails=new CourseDto();
			courseDetails.setCourseName(courseView.getTxtcouseName().getText());
			try{
				courseView.setLblerrorcoursefees("");						
				courseDetails.setCourseFees(Integer.parseInt(courseView.getTxtcouseFees().getText()));
				
				try{
					courseView.setLblerrorcourseduration("");				
					courseDetails.setCourseDuration(Integer.parseInt(courseView.getTxtCourseDuration().getText()));
					InserttoDb inserttoDb=new InserttoDb();
					inserttoDb.callDatabase(courseDetails,courseView);
				}
				catch(NumberFormatException e){
					courseView.setLblerrorcourseduration("* Only Number Allowed");

				}				
			}
			catch(NumberFormatException e){
				courseView.setLblerrorcoursefees("* Only Number Allowed");	
			}
			
	}
	
	

	public void cannotBlank(CourseAddView courseView){
		if(!courseView.getTxtcouseName().getText().equals("")){
				if(!courseView.getTxtcouseFees().getText().equals("")){
							if(!courseView.getTxtCourseDuration().getText().equals("")){	

								numberAllowed(courseView);								
							}
							else{			
								courseView.setLblerrorcourseduration("* Can Not Blank");
							}				
					}
				else{
						courseView.setLblerrorcoursefees("* Can Not Blank");					
				}
		}	
		else{
			courseView.setLblcoursename("* Can Not Blank");						
		}				


		
}
	
	
	
	
	
}
