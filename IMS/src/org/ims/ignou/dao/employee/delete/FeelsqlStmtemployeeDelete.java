package org.ims.ignou.dao.employee.delete;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeelsqlStmtemployeeDelete {

	public PreparedStatement setEmployee(PreparedStatement pre,int empId){		
		try {
			pre.setInt(1, empId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}
	
	public PreparedStatement setemployeeBatchDetails(PreparedStatement pre,int empId){
		
		try {
			pre.setInt(1, empId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}

	public PreparedStatement setQalfictondtlsemployee(PreparedStatement pre,int empId){
		
		try {
			pre.setInt(1, empId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}

}
