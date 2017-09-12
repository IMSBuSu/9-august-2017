package org.ims.ignou.dao.library.add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.library.add.BookAddDto;

public class InsertBookRecordDao extends CreateConnection{

	
	
	private int book_id;
	
	
	
	public int getBook_id() {
		return book_id;
	}



	private Boolean setBookId(ResultSet idSet){
			
		try {
			if(idSet.next()){
					book_id=idSet.getInt("BOOK_ID");
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	private Boolean getBookId(BookAddDto bookDetail){
		
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
			if(connection!=null){
							pre=connection.prepareStatement(SqlStmtBookAdd.getBookId(pre));
							if(pre!=null){
								FeelDetailsqlStmtAdd feelDetailsqlStmtAdd=new FeelDetailsqlStmtAdd();
								pre=feelDetailsqlStmtAdd.setBookDetail(pre, bookDetail);
							    ResultSet idset=pre.executeQuery();
							    			if(setBookId(idset)){
							    				idset.close();
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

	public Boolean addrecordbook(BookAddDto bookDetail){
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
			if(connection!=null){
							pre=connection.prepareStatement(SqlStmtBookAdd.insertBook(pre));
							if(pre!=null){
								FeelDetailsqlStmtAdd feelDetailsqlStmtAdd=new FeelDetailsqlStmtAdd();
								pre=feelDetailsqlStmtAdd.setBookDetail(pre, bookDetail);
							    int issuccess=pre.executeUpdate();
							    if(issuccess==1){
							    			if(getBookId(bookDetail)){
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
