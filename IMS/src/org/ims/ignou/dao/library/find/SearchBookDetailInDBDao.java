package org.ims.ignou.dao.library.find;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.library.add.BookAddDto;

public class SearchBookDetailInDBDao extends CreateConnection{

	
	private BookAddDto bookFinddetail;

	public BookAddDto getBookFinddetail() {
		return bookFinddetail;
	}
	
	
	private Boolean setDetail(ResultSet idset){
		
		bookFinddetail=new BookAddDto();
		try {
			if(idset.next())
			{
				bookFinddetail.setBookCategory(idset.getString("BOOK_CATEGORY"));
				bookFinddetail.setBookid(idset.getInt("BOOK_ID"));
				bookFinddetail.setBooklanguage(idset.getString("BOOK_LANGUAGE"));
				bookFinddetail.setBookName(idset.getString("BOOK_NAME"));
				bookFinddetail.setBookpurchasingDate(idset.getString("PURCHASING_DATE"));
				bookFinddetail.setIsbn(idset.getString("ISBN"));
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public Boolean searchRecord(int id){
		
		Connection connection=null;
		PreparedStatement pre=null;
		ResultSet bookDetail=null;
		try {
			connection=createconnection();
										
									if(connection!=null){
										
												pre=connection.prepareStatement(SqlStmtBookfind.findbook());
												if(pre!=null){
													FeelBookIdsqlStmt bookIdsqlStmt=new FeelBookIdsqlStmt();
													pre=bookIdsqlStmt.setID(pre, id);
													
													bookDetail=pre.executeQuery();
													if(bookDetail!=null){
														
														if(setDetail(bookDetail)){
														return true;
														}
														else{
															return false;
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
			if(bookDetail!=null)
			{
				try {
					bookDetail.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	
		
		
		
		
		
		
			return false;
	}
	
	
	
	
}
