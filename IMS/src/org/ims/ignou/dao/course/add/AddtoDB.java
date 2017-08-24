package org.ims.ignou.dao.course.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class AddtoDB extends CreateConnection
{
		public  int insert() 
		{
					try {
								Connection connection = createconnection();
								if(connection!=null){				
										
										Statement statement=new Statement();										
											PreparedStatement insertCoursestatment=statement.insertStatement(connection);
											if(insertCoursestatment!=null){
												int isSucess=insertCoursestatment.executeUpdate();
												if(isSucess==1){	
													 ResultSet   id=
														statement.getcourseId(connection).executeQuery();																							
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
