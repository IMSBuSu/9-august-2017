package org.ims.ignou.dao.admin.add;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.admin.AdminDto;

public class SqlStmtFeelAdminDetail {

	
	public PreparedStatement setDetail(PreparedStatement pre,AdminDto adminDetail){
		
		
		try {
			pre.setString(1, adminDetail.getName().toUpperCase());
			pre.setString(2, adminDetail.getEmailID().toUpperCase());
			pre.setString(3, adminDetail.getPassword().toUpperCase());
			pre.setString(4, adminDetail.getDob().toUpperCase());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return pre;
	}
	
}
