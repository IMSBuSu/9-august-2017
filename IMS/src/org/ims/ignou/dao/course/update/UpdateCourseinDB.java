package org.ims.ignou.dao.course.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.course.CourseDto;

public class UpdateCourseinDB extends CreateConnection
{

	public boolean updateCourse(CourseDto courseDto){
		
		try {
			Connection connection=createconnection();
			if(connection!=null)
			{
				CourseUpdateSqlstmt courseDeleteSqlstmt=new CourseUpdateSqlstmt();
					PreparedStatement preparedStatement=courseDeleteSqlstmt.updateCoursePSMT(connection, courseDto);
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
