package org.ims.ignou.dao.library.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class Deletebookdao  extends CreateConnection{

	
	
	
	
	
	public Boolean deleterecord(int bookid){
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
			if(connection!=null){
				pre=connection.prepareStatement(SqlStmtDeleteBook.deleteRecord());
						if(pre!=null){
							FeelSqlStmtDeleteBook setId=new FeelSqlStmtDeleteBook();
							setId.setId(pre, bookid);
									
							int iSdelete=pre.executeUpdate();
							if(iSdelete==1){							
									return true;
							}
						}
				
				
			}			
		} 
		catch (SQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(null, "Soory,Book Is Issued to someone, We are unable to delete detail!");
		}
		catch (ClassNotFoundException e) {
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
			
			if(pre!=null){
				
				try {
					pre.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
				
		}
		
		return false;
	}
	
	
	
	
	
	
}
