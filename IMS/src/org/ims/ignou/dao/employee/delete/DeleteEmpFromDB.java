package org.ims.ignou.dao.employee.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.ims.ignou.dao.Extendable.CreateConnection;

public class DeleteEmpFromDB extends CreateConnection{

			
	
			private Boolean deleteEmployeeQualification(int empId,Connection connection,FeelsqlStmtemployeeDelete feelsqlStmtemployeeDelete){
				PreparedStatement ps=null;
							try {
								 ps=connection.prepareStatement(SqlStmtemployeedelete.deleteqalfictondtlsemployee());
								 if(ps!=null){
									 		ps=feelsqlStmtemployeeDelete.setQalfictondtlsemployee(ps, empId);
									 		if(ps.executeUpdate()==1)	
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
						 		if(ps.executeUpdate()==1)	
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
						 		if(ps.executeUpdate()==1)	
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
	
			public Boolean delete(int id){
				FeelsqlStmtemployeeDelete feelsqlStmtemployeeDelete=new FeelsqlStmtemployeeDelete();
				Connection connection=null;
					try {
						connection=createconnection();
						if(connection!=null){
							if(deleteEmployeeQualification(id,connection,feelsqlStmtemployeeDelete))
							{
										System.out.println("qualification delete");
								if(deleteBatchdetail(id,connection,feelsqlStmtemployeeDelete))
								{
										System.out.println("batch details");
									if(deleteEmployee(id,connection,feelsqlStmtemployeeDelete))
									{
										
										System.out.println("employee delete");
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
					}
				return false;
			}		
	
}
