package org.ims.ignou.helper.course.add;

import org.ims.ignou.dto.course.CourseDto;

public abstract class CourseDetails 
{	
		private	static CourseDto courseDetails;
		public static CourseDto getCourseDetails() {
			return courseDetails;
		}
		public static void setCourseDetails(CourseDto courseDetails) {
			CourseDetails.courseDetails = courseDetails;			
		}			
}
