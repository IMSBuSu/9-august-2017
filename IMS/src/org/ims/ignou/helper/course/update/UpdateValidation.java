package org.ims.ignou.helper.course.update;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.course.update.UpdateCourseinDB;
import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.view.course.update.PrintFindforupdateRecord;

public class UpdateValidation 
{
	private  CourseDto courseDetails;
		
	public void numberAllowed(PrintFindforupdateRecord courseView){
		
			courseDetails=new CourseDto();
			courseDetails.setCourseName(courseView.getTextCourseName().getText());
			try{
				courseView.setLblerrorcoursefees("");						
				courseDetails.setCourseFees(Integer.parseInt(courseView.getTextCourseFess().getText()));
				
				try{
					courseView.setLblerrorcourseduration("");
					courseDetails.setCourseDuration(Integer.parseInt(courseView.getTextCourseDuration().getText()));
					courseDetails.setCourseId(courseView.getTextcourseid());
					int yes_no=JOptionPane.showConfirmDialog(courseView, "Do you want to Update Couser ? ");
					if(yes_no==0){
						
						UpdateCourseinDB courseinDB=new UpdateCourseinDB();
							if(courseinDB.updateCourse(courseDetails)){
									
								JOptionPane.showMessageDialog(courseView, "Course Updated Sucessfully");	
								courseView.setVisible(false);
								
							}
							else{
								JOptionPane.showMessageDialog(courseView, "Failed   to Updated Course");	

								
							}
						
					
					
					}
				}
				catch(NumberFormatException e){
					courseView.setLblerrorcourseduration("* Only Number Allowed");

				}				
			}
			catch(NumberFormatException e){
				courseView.setLblerrorcoursefees("* Only Number Allowed");	
			}
			
		
			
	}
	
	

	public void cannotBlank(PrintFindforupdateRecord courseView){
		if(!courseView.getTextCourseName().getText().equals("")){
				if(!courseView.getTextCourseFess().getText().equals("")){
							if(!courseView.getTextCourseDuration().getText().equals("")){	
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
