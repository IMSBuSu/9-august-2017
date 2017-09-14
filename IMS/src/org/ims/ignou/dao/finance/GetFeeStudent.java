package org.ims.ignou.dao.finance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.ims.ignou.dto.course.CourseDto;

public class GetFeeStudent {

	
	private double fees=0;
	private ArrayList<CourseDto> courselist;
	
	
	public double getFees() {
		return fees;
	}
	
	
	
	private Boolean getCourseFee(Connection connection)
	{
		 courselist=new ArrayList<>();
		PreparedStatement pre=null;		
		ResultSet courseSet=null;
		try {
			pre=connection.prepareStatement(SqlStmtgetfinane.getcourseFee());
				if(pre!=null){
					
						courseSet=pre.executeQuery();
						while(courseSet.next()){
							CourseDto courseDto=new CourseDto();
							courseDto.setCourseFees(courseSet.getInt("COURSE_FEES"));
							courseDto.setCourseName(courseSet.getString("COURSE_NAME"));
							courselist.add(courseDto);
						}
					
				return true;
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(pre!=null){
				pre.close();
				}
				if(courseSet!=null){
					courseSet.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
private void setFee(ArrayList<String> courseName){

	
	for(String course:courseName)
	{
					for(CourseDto coursDtail:courselist){
						if(course.equals(coursDtail.getCourseName()))
						{
							fees=fees+coursDtail.getCourseFees();
						}
					}
	}
	
	
}
	
	public Boolean getfee(Connection connection)
	{
		ResultSet set=null;
		PreparedStatement pre=null;
		try {
			pre=connection.prepareStatement(SqlStmtgetfinane.getCourse());
			if(pre!=null){
				set=pre.executeQuery();
				ArrayList<String> courseName=new ArrayList<>();
				while(set.next()){					
					courseName.add(set.getString("COURSENAME"));
				}
				if(getCourseFee(connection)){					
					setFee(courseName);
					return true;
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
finally {
			
			try {
				if(pre!=null){
				pre.close();
				}
				if(set!=null){
					set.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	return false;
	}
}
