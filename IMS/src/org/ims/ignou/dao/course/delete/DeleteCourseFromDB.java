package org.ims.ignou.dao.course.delete;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class DeleteCourseFromDB extends CreateConnection{

		
	
	public Boolean DeleteCourse(int courseid){
		
			try {
				Connection connection=createconnection();
				if(connection!=null)
				{
						CourseDeleteSqlstmt courseDeleteSqlstmt=new CourseDeleteSqlstmt();
						PreparedStatement preparedStatement=courseDeleteSqlstmt.deletePrepareStmt(connection, courseid);
						if(preparedStatement!=null){
								if(preparedStatement.executeUpdate()==1){
										return true;
								}
								preparedStatement.close();
						}
					connection.close();
				}
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		
	}
	
	
	
	
	
	
	
}
