package org.ims.ignou.helper.library.delete;

import org.ims.ignou.dao.library.delete.Deletebookdao;

public class DeleteBookRecordHelper {

	
	
	
	public Boolean deleteRecord(int bookid){
		
						
					Deletebookdao delete = new Deletebookdao();
					
					Boolean issuccestodelet=delete.deleterecord(bookid);
					if(issuccestodelet){
						
						return true;
					}
		
			return false;
		
	}
	
}
