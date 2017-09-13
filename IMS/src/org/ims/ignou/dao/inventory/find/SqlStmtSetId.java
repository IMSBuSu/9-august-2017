package org.ims.ignou.dao.inventory.find;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlStmtSetId {

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
