package org.ims.ignou.dao.library.issueBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class InsertIssueBookDao extends CreateConnection {

	
	
	
	public Boolean issueBook(int reciver,int bookid){
		Connection connection=null;
		PreparedStatement pre=null;
		
		try {
			connection=createconnection();
				if(connection!=null){
						pre=connection.prepareStatement(SqlstmtIssueBook.insert());
						if(pre!=null){
							SqlstmtIssueBookFeelDetail bookFeelDetail=new SqlstmtIssueBookFeelDetail();
							pre=bookFeelDetail.setDetail(bookid, reciver, pre);
							if(pre.executeUpdate()==1){
								return true;
							}	
						}		
				}
				
		} 
		catch (SQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(null, "Soory,Book Is already Issue!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(connection!=null){
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
