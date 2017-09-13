package org.ims.ignou.dao.inventory.delete;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.proxy.annotation.Pre;

public class FeelSqlstmtDeleteGoods {

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
