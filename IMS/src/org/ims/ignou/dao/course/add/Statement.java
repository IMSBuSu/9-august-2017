package org.ims.ignou.dao.course.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.course.add.AddDto;
import org.ims.ignou.helper.course.add.CourseDetails;

public class Statement {

		public  String insertcourse(){
			return "insert into course(COURSE_DURATION,COURSE_FEES,COURSE_ID,COURSE_NAME) values(?,?,course_id.nextval,?)";			
		}

		public PreparedStatement insertStatement(Connection connection) throws SQLException{			
			AddDto courseDetails=CourseDetails.getCourseDetails();
			PreparedStatement preparedStatement=connection.prepareStatement(insertcourse());
			preparedStatement.setInt(1,courseDetails.getCourseDuration());
			preparedStatement.setInt(2,courseDetails.getCourseFees());
			preparedStatement.setString(3,courseDetails.getCourseName());				
			return preparedStatement;
			
		}
		public String selectId(){
			return "select COURSE_ID from course where COURSE_NAME=? and COURSE_FEES=? and COURSE_DURATION=?";
		}
		
		public PreparedStatement getcourseId(Connection connection) throws SQLException{
			PreparedStatement getid=connection.prepareStatement(selectId());
			getid.setString(1, CourseDetails.getCourseDetails().getCourseName());
			getid.setInt(2, CourseDetails.getCourseDetails().getCourseFees());
			getid.setInt(3, CourseDetails.getCourseDetails().getCourseDuration());			
			return getid;			
		}
		
}
