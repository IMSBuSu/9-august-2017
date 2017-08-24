package org.ims.ignou.helper.course.add;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.course.add.AddtoDB;
import org.ims.ignou.dto.course.add.AddDto;
import org.ims.ignou.view.course.add.CourseView;


public class InserttoDb {		
		public void callDatabase(AddDto courseDetails,CourseView frame){
			CourseDetails.setCourseDetails(courseDetails);
			AddtoDB  SavetoDb=new AddtoDB();
			int courseid=SavetoDb.insert();		
			if(courseid>0){
				frame.setVisible(false);							
				JOptionPane.showMessageDialog(null, "Your Course Id : "+courseid);
			}else{
				frame.setVisible(false);							
				JOptionPane.showMessageDialog(null, "Failed to Add course !");					
			}								
		}	
}
