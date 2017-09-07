package org.ims.ignou.dao.employee.find;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;

public class SearchInDb extends CreateConnection{

				private EmployeeFinddto employeeFinddto;
				
				public EmployeeFinddto getEmployeeFinddto() {
					return employeeFinddto;
				}
				
				private void setFoundemployeeDetail(ResultSet set){
					 employeeFinddto=new EmployeeFinddto();
						try {
							employeeFinddto.setEmployeeName(set.getString("NAME"));
							employeeFinddto.setDob(set.getString("DOB"));
							employeeFinddto.setEmailId(set.getString("EMAIL_ID"));
							employeeFinddto.setEmployeeid(set.getString("ID"));
							employeeFinddto.setFatherName(set.getString("FATHER_NAME"));
							employeeFinddto.setImage(set.getString("IMAGE_PATH"));
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}					 
			}
				public Boolean search(int id){
					Connection connection=null;
					PreparedStatement pre=null;
					ResultSet resultSet=null;
								try {
										 connection=createconnection();
										 if(connection!=null)
										 {	
												FeelFindsqlStmt feelFindsqlStmt=new FeelFindsqlStmt();
											 		pre=connection.prepareStatement(EmployeeFindSqlStmt.searchEmployee());													
					 								pre=feelFindsqlStmt.setId(id, pre);	
											 					if(pre!=null){
											 								resultSet=pre.executeQuery();
											 								if(resultSet.next()){
											 											setFoundemployeeDetail(resultSet);
											 											return true;
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

								finally {
										try {
												if(connection!=null)
													{
															connection.close();
													}
												if(pre!=null){													
													pre.close();
												}
											
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
				
									return false;
				}
	
}
