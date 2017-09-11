package org.ims.ignou.dao.student.fees.submit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;
import org.ims.ignou.dto.student.fees.submit.StudentFeesSubmitDto;

public class UpdateStudentFeesInDB extends CreateConnection{

	
	
	
	
	
	
	
	
	
	
	public Boolean insertFees(StudentFeesSubmitDto feesSubmitDto){
		Connection connection=null;
		PreparedStatement pre=null;
		try {
			connection=createconnection();
								if(connection!=null){
									
												pre=connection.prepareStatement(SqlStmtUpdateStudentFees.updateStudentFees());
												if(pre!=null){
													
												pre=new FeelsqlStmStuFeesUpdate().setId(pre, feesSubmitDto);
												
														System.out.println(pre.executeUpdate());
												
													return true;
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
			
			
		}
		
		
		
		return false;
	}
	
	
	
	
	
}
