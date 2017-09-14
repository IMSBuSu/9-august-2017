package org.ims.ignou.dao.admin.UpdatePassword;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.admin.AdminDto;

public class FeelSqlStmtUpdatePassword {

	
	
	
	public PreparedStatement setDetail(PreparedStatement pre,AdminDto adminDetail){
		
		try {
			pre.setString(1, adminDetail.getPassword());			
			pre.setString(2, adminDetail.getEmailID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return pre;
	}
}
