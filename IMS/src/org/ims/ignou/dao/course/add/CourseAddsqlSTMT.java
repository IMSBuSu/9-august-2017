package org.ims.ignou.dao.course.add;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.course.CourseDto;

public class CourseAddsqlSTMT {

		public  String insertcourse(){
			return "insert into course(COURSE_DURATION,COURSE_FEES,COURSE_ID,COURSE_NAME) values(?,?,course_id.nextval,?)";			
		}

		public PreparedStatement insertStatement(Connection connection,CourseDto courseDto) throws SQLException{			
			PreparedStatement preparedStatement=connection.prepareStatement(insertcourse());
			preparedStatement.setInt(1,courseDto.getCourseDuration());
			preparedStatement.setInt(2,courseDto.getCourseFees());
			preparedStatement.setString(3,courseDto.getCourseName().toUpperCase());				
			return preparedStatement;
			
		}
		public String selectId(){
			return "select COURSE_ID from course where COURSE_NAME=? and COURSE_FEES=? and COURSE_DURATION=?";
		}
		
		public PreparedStatement getcourseId(Connection connection,CourseDto courseDto) throws SQLException{
			PreparedStatement getid=connection.prepareStatement(selectId());
			getid.setString(1, courseDto.getCourseName().toUpperCase());
			getid.setInt(2, courseDto.getCourseFees());
			getid.setInt(3, courseDto.getCourseDuration());			
			return getid;			
		}
		
}
