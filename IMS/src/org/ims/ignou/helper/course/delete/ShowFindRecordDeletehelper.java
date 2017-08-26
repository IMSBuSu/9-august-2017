package org.ims.ignou.helper.course.delete;

import org.ims.ignou.dto.course.CourseDto;
import org.ims.ignou.view.employee.delete.DeleteFindRecord;

public class ShowFindRecordDeletehelper {

	 
public void setDetails(CourseDto courseDetails){
		
		
	DeleteFindRecord findRecord=new DeleteFindRecord();
		findRecord.setTextCourseDuration(courseDetails.getCourseDuration());
		findRecord.setTextCourseFess(courseDetails.getCourseFees());
		findRecord.setTextCourseId(courseDetails.getCourseId());
		findRecord.setTextCourseName(courseDetails.getCourseName());
		findRecord.setVisible(true);
		
	}










}
