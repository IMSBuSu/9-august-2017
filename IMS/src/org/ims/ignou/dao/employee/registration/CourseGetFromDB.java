package org.ims.ignou.dao.employee.registration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class CourseGetFromDB extends CreateConnection
{
	
	
	
	private static String stmt="select COURSE_NAME from course";
	private ArrayList<String> courseList;
	
	public ArrayList<String> getCourseList() {
		return courseList;
	}


	public Boolean courseResultset(Connection connection) throws SQLException{
		Statement statement=connection.createStatement();		
		if(statement!=null){
					ResultSet courseSet=statement.executeQuery(stmt);
					if(courseSet.next()){
							getCourseList(courseSet);
							return true;
					}
					
		}
		return false;		
	}

	
	public void getCourseList(ResultSet courseset) throws SQLException{
		
		String course;
		courseList=new ArrayList<String>();
		while(courseset.next())
		{			
			 course=courseset.getString("COURSE_NAME");
			 courseList.add(course);						
		}
		
	}
	
	public void getcourse(){
		try {
			Connection connection=createconnection();
					if(connection!=null){						
							courseResultset(connection);						
							connection.close();
					}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
