package org.ims.ignou.dao.course.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.course.add.AddDto;
import org.ims.ignou.helper.course.add.Addhelper;

public class AddtoDB extends CreateConnection
{
		public  void insert() 
		{
		AddDto courseDetails=Addhelper.getCourseDetails();
		Connection connection;
		try {
			connection = createconnection();
			if(connection!=null){
				PreparedStatement preparedStatement=connection.prepareStatement(Statement.insertStatement());
				
				preparedStatement.setInt(1,Integer.parseInt(courseDetails.getCourseDuration()));
				preparedStatement.setInt(2,Integer.parseInt(courseDetails.getCourseFees()));
				preparedStatement.setString(3,courseDetails.getCourseName());
				
				preparedStatement.executeUpdate();
				preparedStatement=connection.prepareStatement("commit");
				preparedStatement.executeUpdate();
				connection.close();
			}else{
				System.out.println("Unable to Create DataBase Connection !");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("class not found exception");
			e.printStackTrace();
		} catch (SQLException e) {

				System.out.println("Wrong Sql query");
			e.printStackTrace();
		}	
			
			
			
		}
	
		
}
