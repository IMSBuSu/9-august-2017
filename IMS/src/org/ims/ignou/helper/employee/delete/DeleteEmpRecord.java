package org.ims.ignou.helper.employee.delete;

import org.ims.ignou.dao.employee.delete.DeleteEmpFromDB;

public class DeleteEmpRecord {

	
			public Boolean DeleteRecord(String emailId,int id){
				DeleteEmpFromDB deleteEmpFromDB=new DeleteEmpFromDB();
							Boolean isRecord=deleteEmpFromDB.deleteEmployeeRecord(emailId,id);
			
								if(isRecord){
									
									return true;
								}
								
							return false;	
			}
	
}
