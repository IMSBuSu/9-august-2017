package org.ims.ignou.dao.employee.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import org.ims.ignou.dao.Extendable.CreateConnection;

public class ChkEmailExist extends CreateConnection
{	

	
	
	private ResultSet emailSet=null;
private	ArrayList<String> emailList=null;
	
	public ArrayList<String> getEmaillist() {
	return emailList;
}

	public Boolean getEmail(){	
		Connection connection=null;
		Statement preparedStatement=null;
				try {
					connection=createconnection();
							if(connection!=null)
							{
								preparedStatement=connection.createStatement();
								if(preparedStatement!=null){
										emailSet=preparedStatement.executeQuery(new RegistrationStatement().getGetEmailId());
										if(emailSet!=null){
													emailList=new ArrayList<String>();
													while(emailSet.next()){										
																emailList.add(emailSet.getString("EMAIL_ID"));																				
													}
														if(emailList.size()>0){
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
				
				finally {
					if(connection!=null){
						try {
							connection.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(preparedStatement!=null){
						try {
							preparedStatement.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(emailSet!=null){
						try {
							emailSet.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
		return false;
	}	
}
