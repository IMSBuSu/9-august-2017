package org.ims.ignou.dao.course.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.ims.ignou.dto.course.add.AddDto;
import org.ims.ignou.helper.course.add.Addhelper;

public class Statement {

		public  String insert(){
			return "insert into course(COURSE_DURATION,COURSE_FEES,COURSE_ID,COURSE_NAME) values(?,?,course_id.nextval,?)";			
		}

		public PreparedStatement insertStatement(Connection connection) throws SQLException{			
			AddDto courseDetails=Addhelper.getCourseDetails();
			PreparedStatement preparedStatement=connection.prepareStatement(insert());
			preparedStatement.setInt(1,Integer.parseInt(courseDetails.getCourseDuration()));
			preparedStatement.setInt(2,Integer.parseInt(courseDetails.getCourseFees()));
			preparedStatement.setString(3,courseDetails.getCourseName());				
			return preparedStatement;
			
		}
		public String selectId(){
			return "select COURSE_ID from course where COURSE_NAME=?";
		}
		
		public PreparedStatement getcourseId(Connection connection) throws SQLException{
			PreparedStatement getid=connection.prepareStatement(selectId());
			getid.setString(1, Addhelper.getCourseDetails().getCourseName());
			return getid;
			
		}
		
}
