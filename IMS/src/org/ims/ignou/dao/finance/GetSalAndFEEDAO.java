package org.ims.ignou.dao.finance;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.finance.ExpVsprDto;

public class GetSalAndFEEDAO extends CreateConnection{

	

	private ExpVsprDto dto=new ExpVsprDto();

	public ExpVsprDto getDto() {
		return dto;
	}
	public void setFeesSalary(ResultSet salaryset){
		
			double salary = 0;	
			try {
				while(salaryset.next()){
				salary=salary+((salaryset.getInt("SALARY")));	
				}
				dto.setEmployeeSalary(salary);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	
	public Boolean getsalfee(){
		Connection connection=null;
		ResultSet set=null;
		PreparedStatement pre=null;
	try {
		connection=createconnection();
				if(connection!=null){
						pre=connection.prepareStatement(SqlStmtgetfinane.getsalary());
						if(pre!=null)
						{
										set=pre.executeQuery();
										setFeesSalary(set);									
										GetFeeStudent feeStudent=new GetFeeStudent();
										if(feeStudent.getfee(connection))
										{
											dto.setStudentFees(feeStudent.getFees());
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
		try {
			if(connection!=null){
			connection.close();
			}
			if(set!=null){
				set.close();
			}
			if(pre!=null){
				pre.close();
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
		return false;
	}
	
	
}
