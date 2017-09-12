package org.ims.ignou.dao.library.find;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeelBookIdsqlStmt {

	
	public PreparedStatement setID(PreparedStatement pre,int bookId){
		
		try {
			pre.setInt(1, bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}
	
	
}
