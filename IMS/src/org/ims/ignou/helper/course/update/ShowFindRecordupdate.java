package org.ims.ignou.helper.course.update;


import org.ims.ignou.dto.course.CourseDto;

import org.ims.ignou.view.course.update.PrintFindforupdateRecord;

public class ShowFindRecordupdate 
{

	public void setDetails(CourseDto courseDetails){
		
		
		PrintFindforupdateRecord findRecord=new PrintFindforupdateRecord();
		findRecord.setTextCourseDuration(courseDetails.getCourseDuration());
		findRecord.setTextCourseFess(courseDetails.getCourseFees());
		findRecord.setTextCourseName(courseDetails.getCourseName());
		findRecord.setTextcourseid(courseDetails.getCourseId());
		System.out.println(courseDetails.getCourseId());

		findRecord.setVisible(true);
		
		
	}
	
}
