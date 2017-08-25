package org.ims.ignou.dao.course.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.course.CourseDto;

public class InsertCourse extends CreateConnection
{
		public  int insert(CourseDto courseDto) 
		{
					try {
								Connection connection = createconnection();
								if(connection!=null){				
										
										CourseAddsqlSTMT statement=new CourseAddsqlSTMT();										
											PreparedStatement insertCoursestatment=statement.insertStatement(connection,courseDto);
											if(insertCoursestatment!=null){
												int isSucess=insertCoursestatment.executeUpdate();
												if(isSucess==1){	
													 ResultSet   id=
														statement.getcourseId(connection,courseDto).executeQuery();																							
													 if(id.next()){	
														 	int courseid=id.getInt("COURSE_ID");
													 		id.close();
														 	return courseid;
													 	}
												 		
												}
												insertCoursestatment.close();
											}
										connection.close();			
								}	
								return 0;
					} catch (ClassNotFoundException e) {
						
							e.printStackTrace();
							return 0;
					} catch (SQLException e) {
							e.printStackTrace();
							return 0;
					}
					
							
		}
	
		
}
