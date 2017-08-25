package org.ims.ignou.dao.course.find;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.course.CourseDto;


public class CourseFindSqlstmt {
	private static  PreparedStatement ps;
	private static String stmtCourseId="select COURSE_DURATION,COURSE_FEES,COURSE_ID,COURSE_NAME from course where COURSE_ID=?";
	private static String stmtCourseName="select COURSE_DURATION,COURSE_FEES,COURSE_ID,COURSE_NAME from course where COURSE_NAME=?";
	public String stmtUsingCourseId(){
								return stmtCourseId;	
	}
		
	public String stmtUsingCourseName(){
		return stmtCourseName;
	}
	public PreparedStatement rsUsingCourseId(Connection connection,CourseDto courseSearch) throws SQLException{
		ps=connection.prepareStatement(stmtUsingCourseId());		
		ps.setInt(1,courseSearch.getCourseId());
		return ps;		
	}
	public PreparedStatement rsUsingName(Connection connection,CourseDto courseSearch) throws SQLException{
		ps=connection.prepareStatement(stmtUsingCourseName());
		ps.setString(1,courseSearch.getCourseName().toUpperCase());
		return ps;
	}
}