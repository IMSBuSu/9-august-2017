package org.ims.ignou.dao.employee.delete;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;

public class DeleteEmpFromDB extends CreateConnection{

			private Boolean deleteEmployeeQualification(int empId,Connection connection,FeelsqlStmtemployeeDelete feelsqlStmtemployeeDelete){
				PreparedStatement ps=null;
							try {
								 ps=connection.prepareStatement(SqlStmtemployeedelete.deleteqalfictondtlsemployee());
								 if(ps!=null){
									 		ps=feelsqlStmtemployeeDelete.setQalfictondtlsemployee(ps, empId);
									 		int deleteRecord=ps.executeUpdate(); //execute update retrun number of rows effected.
									 		if(deleteRecord>=0)	
									 		{
									 			return true;
									 		}
								 }
							
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						finally {
							if(ps!=null){
								try {
									ps.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
						}			
					return false;
			}
			private Boolean deleteEmployee(int empId,Connection connection,FeelsqlStmtemployeeDelete feelsqlStmtemployeeDelete){
				
				PreparedStatement ps=null;
				try {
					 ps=connection.prepareStatement(SqlStmtemployeedelete.deleteEmployee());
					 if(ps!=null){
						 		ps=feelsqlStmtemployeeDelete.setEmployee(ps, empId);
						 		int deleteRecord=ps.executeUpdate();
						 		if(deleteRecord>=0)	
						 		{
						 			return true;
						 		}
					 }
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			finally {
				if(ps!=null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
				return false;
			}
			private Boolean deleteBatchdetail(int empId,Connection connection,FeelsqlStmtemployeeDelete feelsqlStmtemployeeDelete){
				
				PreparedStatement ps=null;
				try {
					 ps=connection.prepareStatement(SqlStmtemployeedelete.deleteemployeeBatchDetails());
					 if(ps!=null){
						 		ps=feelsqlStmtemployeeDelete.setemployeeBatchDetails(ps, empId);
						 		int deleteRecord=ps.executeUpdate();
						 		if(deleteRecord>=0)	
						 		{
						 			return true;
						 		}
					 }
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			finally {
				if(ps!=null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
				
				return false;
			}
			public Boolean deleteEmployeeRecord(String emailId,int id){

				FeelsqlStmtemployeeDelete feelsqlStmtemployeeDelete=new FeelsqlStmtemployeeDelete();
				Connection connection=null;
					try {
						connection=createconnection();
						if(connection!=null){
							if(deleteEmployeeQualification(id,connection,feelsqlStmtemployeeDelete)) //delete Qualification Detail
							{	
								if(deleteBatchdetail(id,connection,feelsqlStmtemployeeDelete)) //delete Batch Detail
								{
									if(deleteEmployee(id,connection,feelsqlStmtemployeeDelete))	//Delete employee detail
									{
										if(deleteImage(emailId)){		//delete image
													return true;
										}			
									}
							
								}
							}
							
						}
						else{
							JOptionPane.showMessageDialog(null, "Could Not Establish connection");
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
					}
				return false;
			}		
	
			
			
		
			 
			private Boolean deleteImage(String emailId)
			{
				String imagePath=LoadBundelImageLocation.getImagepath("imgPath")+emailId+".JPG";
			        File file = new File(imagePath);
			         
			        if(file.delete())
			        {
			           return true;
			        }
			        
			        return false;
			}
			
			
			
}
