package org.ims.ignou.dao.library.delete;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeelSqlStmtDeleteBook {

	public PreparedStatement setId(PreparedStatement pre,int id){
		try {
			pre.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pre;
	}
	
	
}
