package org.ims.ignou.helper.course.add;

import org.ims.ignou.dto.course.add.AddDto;

public abstract class CourseDetails 
{	
		private	static AddDto courseDetails;
		public static AddDto getCourseDetails() {
			return courseDetails;
		}
		public static void setCourseDetails(AddDto courseDetails) {
			CourseDetails.courseDetails = courseDetails;			
		}			
}
