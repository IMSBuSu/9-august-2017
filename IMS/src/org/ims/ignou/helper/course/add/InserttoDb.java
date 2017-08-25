package org.ims.ignou.helper.course.add;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.course.add.InsertCourse;
import org.ims.ignou.dao.course.find.SearchCourse;
import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.view.course.add.CourseAddView;


public class InserttoDb {		
		public void callDatabase(CourseDto courseDetails,CourseAddView frame){
			CourseDetails.setCourseDetails(courseDetails);
			InsertCourse  SavetoDb=new InsertCourse();
			SearchCourse checkAvaiableCourseName=new SearchCourse();
			Boolean recordFound=checkAvaiableCourseName.searchUsingName(courseDetails);
			if(!recordFound){
					int courseid=SavetoDb.insert();		
					if(courseid>0){
								frame.setVisible(false);							
								JOptionPane.showMessageDialog(frame, "Your Course Id : "+courseid);
					}else{
							frame.setVisible(false);							
								JOptionPane.showMessageDialog(frame, "Failed to Add course !");	
					}
			}	
			else {
				
				JOptionPane.showMessageDialog(frame, "Course Name Already Exit !");				
			}				
	}		
}
