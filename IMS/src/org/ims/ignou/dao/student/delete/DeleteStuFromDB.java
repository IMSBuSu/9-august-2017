package org.ims.ignou.dao.student.delete;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.helper.student.delete.DeleteStuRecord;

public class DeleteStuFromDB extends CreateConnection{

	
				
			private Boolean DeleteStuRecord(int id){
				Connection connection=null;
				PreparedStatement preparedStatement=null;
				try {
					connection=createconnection();
						if(connection!=null){
							FeelsqlStmStuDelete feelsqlStmStuDelete=new FeelsqlStmStuDelete();
								preparedStatement=connection.prepareStatement(SqlStmtDeleteStudent.studentdeletsqlstmt());
								preparedStatement=feelsqlStmStuDelete.setId(preparedStatement, id);
								if(preparedStatement!=null){
										preparedStatement.executeUpdate();
										return true;
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
			
			public Boolean Deletequalifcation(int id){
					Connection connection=null;
					PreparedStatement preparedStatement=null;
					try {
						connection=createconnection();
							if(connection!=null){
								FeelsqlStmStuDelete feelsqlStmStuDelete=new FeelsqlStmStuDelete();
									preparedStatement=connection.prepareStatement(SqlStmtDeleteStudent.studentQufalicationstmt());
									preparedStatement=feelsqlStmStuDelete.setId(preparedStatement, id);
									if(preparedStatement!=null){
											preparedStatement.executeUpdate();
											if(DeleteStuRecord(id)){
													if(deletestuImage(Integer.toString(id))){
															return true;
													}
											}
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
	
	
	
	
	
	
	
				
				
				private Boolean deletestuImage(String stuid)
				{
					String imagePath=LoadBundelImageLocation.getImagepath("imgStud")+stuid+".JPG";
				        File file = new File(imagePath);
				        if(file.delete())
				        {
				           return true;
				        }
				        System.out.println(imagePath);
				        return false;
				}
	
}
