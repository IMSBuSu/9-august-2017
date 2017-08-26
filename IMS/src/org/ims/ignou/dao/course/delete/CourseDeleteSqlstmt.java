package org.ims.ignou.dao.course.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.course.CourseDto;

public class CourseDeleteSqlstmt {

	private static   String stmt="delete from course where COURSE_ID=?";
	
	
	public PreparedStatement deletePrepareStmt(Connection connection,int courseid) throws SQLException{
		PreparedStatement ps=connection.prepareStatement(stmt);
		ps.setInt(1, courseid);			
		return ps;
	}
	
	
	
	
	
	
	
}
