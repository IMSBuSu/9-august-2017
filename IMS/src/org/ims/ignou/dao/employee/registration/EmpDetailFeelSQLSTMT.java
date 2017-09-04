package org.ims.ignou.dao.employee.registration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.employee.registration.Employeedto;

public class EmpDetailFeelSQLSTMT {

	
	public PreparedStatement employee(PreparedStatement pre,Employeedto empdetail){
		
		try {
			pre.setInt(1,empdetail.getSalary());
			pre.setString(2, empdetail.getDob());
			pre.setString(3,empdetail.getJobTiming());
			pre.setString(4, empdetail.getEmployeeName());
			pre.setString(5, empdetail.getJobName());
			pre.setString(6, empdetail.getFathersName());
			pre.setString(7, empdetail.getMaritialStatus());
			pre.setString(8, empdetail.getContactNumber());
			pre.setString(9, empdetail.getEmailId());
			pre.setString(10, empdetail.getCateGory());
			pre.setString(11, empdetail.getGenDer());
			pre.setString(12, empdetail.getAddRess());
			pre.setInt(13,empdetail.getZipcode());
			pre.setString(14, empdetail.getState());
			pre.setString(15, empdetail.getCity());
			pre.setString(16, empdetail.getCounTry());
			pre.setString(17, empdetail.getImagesPath()); 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pre;
	}
	
	
}
