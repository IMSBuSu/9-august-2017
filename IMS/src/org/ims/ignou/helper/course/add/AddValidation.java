package org.ims.ignou.helper.course.add;

import org.ims.ignou.dto.course.add.AddDto;
import org.ims.ignou.view.course.add.CourseView;

public class AddValidation 
{
	private  AddDto courseDetails;
		
	public void numberAllowed(CourseView courseView){
		
			courseDetails=new AddDto();
			courseDetails.setCourseName(courseView.getTxtcouseName().getText());
			try{
				courseView.setLblerrorcoursefees("");						
				courseDetails.setCourseFees(Integer.parseInt(courseView.getTxtcouseFees().getText()));
				InserttoDb inserttoDb=new InserttoDb();
				inserttoDb.callDatabase(courseDetails,courseView);
				try{
					courseView.setLblerrorcourseduration("");				
					courseDetails.setCourseDuration(Integer.parseInt(courseView.getTxtCourseDuration().getText()));
				}
				catch(NumberFormatException e){
					courseView.setLblerrorcourseduration("* Only Number Allowed");

				}				
			}
			catch(NumberFormatException e){
				courseView.setLblerrorcoursefees("* Only Number Allowed");	
			}
			
	}
	
	

	public void cannotBlank(CourseView courseView){
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
