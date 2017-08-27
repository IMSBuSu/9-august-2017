package org.ims.ignou.dao.course.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.course.CourseDto;

public class CourseUpdateSqlstmt {

	private static String stmt="update course set COURSE_DURATION=?,COURSE_FEES=?,COURSE_NAME=? where COURSE_ID=?";

	public PreparedStatement updateCoursePSMT(Connection connection,CourseDto courseDto) throws SQLException
	{
		PreparedStatement preparedStatement=connection.prepareStatement(stmt);
		preparedStatement.setInt(1, courseDto.getCourseDuration());
		preparedStatement.setInt(2, courseDto.getCourseFees());
		preparedStatement.setString(3, courseDto.getCourseName().toUpperCase());
		preparedStatement.setInt(4, courseDto.getCourseId());
		return preparedStatement;
		
	}
	
}

