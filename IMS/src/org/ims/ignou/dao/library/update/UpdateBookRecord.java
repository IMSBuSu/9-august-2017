package org.ims.ignou.dao.library.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dao.library.delete.FeelSqlStmtDeleteBook;
import org.ims.ignou.dao.library.delete.SqlStmtDeleteBook;
import org.ims.ignou.dto.library.add.BookAddDto;

public class UpdateBookRecord extends CreateConnection{

	
	
	
	
	
	
	public Boolean updateBook(BookAddDto bookdetail){
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
			if(connection!=null){
				pre=connection.prepareStatement(SqlStmtUpdateBook.updateRecord());
						if(pre!=null){
							FeelSqlStmtUpdateBook setId=new FeelSqlStmtUpdateBook();
							setId.setDDetail(pre, bookdetail);
									
							int iSdelete=pre.executeUpdate();
							if(iSdelete==1){							
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
