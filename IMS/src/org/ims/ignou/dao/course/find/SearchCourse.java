package org.ims.ignou.dao.course.find;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.course.CourseDto;


public class SearchCourse extends CreateConnection
{
	private static CourseDto courseDetails;
	
	public static CourseDto getCourseDetails() {
		return courseDetails;
	}
	public Boolean searchUsingName(CourseDto courseSerachDetails){
		courseDetails=new CourseDto();
		CourseFindSqlstmt findStatment=new CourseFindSqlstmt();
		ResultSet resultSet;
		PreparedStatement searchRecord;
		Connection connection;
		try {
			 		connection=createconnection();
			if(connection!=null){
						 searchRecord=findStatment.rsUsingName(connection,courseSerachDetails);
						if(searchRecord!=null){						
								resultSet=searchRecord.executeQuery();
								if(resultSet.next())
								{
									
									courseDetails.setCourseDuration(resultSet.getInt("COURSE_DURATION"));	
									courseDetails.setCourseFees(resultSet.getInt("COURSE_FEES"));
									courseDetails.setCourseId(resultSet.getInt("COURSE_ID"));
									courseDetails.setCourseName(resultSet.getString("COURSE_NAME"));
									
									connection.close();
										return true;
									
								}
								resultSet.close();
								
						}
						
						else{
							searchRecord.close();
							JOptionPane.showMessageDialog(null, "DataBase Connection Failed");		
							return false;
						}
						
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

	
	
	public Boolean searchUsingId(CourseDto courseSerachDetails){


		courseDetails=new CourseDto();
		CourseFindSqlstmt findStatment=new CourseFindSqlstmt();
		ResultSet resultSet;
		PreparedStatement searchRecord;
		Connection connection;
		try {
			 		connection=createconnection();
			if(connection!=null){
						 searchRecord=findStatment.rsUsingCourseId(connection,courseSerachDetails);
						if(searchRecord!=null){						
								resultSet=searchRecord.executeQuery();
								if(resultSet.next())
								{
									
									courseDetails.setCourseDuration(resultSet.getInt("COURSE_DURATION"));	
									courseDetails.setCourseFees(resultSet.getInt("COURSE_FEES"));
									courseDetails.setCourseId(resultSet.getInt("COURSE_ID"));
									courseDetails.setCourseName(resultSet.getString("COURSE_NAME"));
									
									connection.close();
										return true;
									
								}
								resultSet.close();
								
						}
						
						else{
							searchRecord.close();
							JOptionPane.showMessageDialog(null, "DataBase Connection Failed");		
							return false;
						}
						
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
