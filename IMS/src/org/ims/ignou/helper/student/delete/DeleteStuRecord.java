package org.ims.ignou.helper.student.delete;

import org.ims.ignou.dao.student.delete.DeleteStuFromDB;

public class DeleteStuRecord {

	
			public Boolean DeleteRecord(int id){
				DeleteStuFromDB deleteStuFromDB=new DeleteStuFromDB();
							Boolean isRecord=deleteStuFromDB.Deletequalifcation(id);
								if(isRecord){
									
									return true;
								}
								
							return false;	
			}
	
}
