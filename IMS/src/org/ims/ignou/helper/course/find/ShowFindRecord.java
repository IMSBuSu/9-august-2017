package org.ims.ignou.helper.course.find;


import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.view.course.find.PrintFindRecord;

public class ShowFindRecord 
{

	public void setDetails(CourseDto courseDetails){

		PrintFindRecord findRecord=new PrintFindRecord();
		findRecord.setTextCourseDuration(courseDetails.getCourseDuration());
		findRecord.setTextCourseFess(courseDetails.getCourseFees());
		findRecord.setTextCourseName(courseDetails.getCourseName());
		findRecord.setTextCourseId(courseDetails.getCourseId());
		
		findRecord.setVisible(true);
	
	}
	
}
