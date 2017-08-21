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
										PreparedStatement insertUpdate=statement.insertStatement(connection);
										if(insertUpdate.executeUpdate()==1){	
										ResultSet   id=
										statement.getcourseId(connection).executeQuery();										
										if(id.next()){
										return id.getInt("COURSE_ID");
										}
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
