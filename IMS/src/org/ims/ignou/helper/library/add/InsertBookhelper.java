package org.ims.ignou.helper.library.add;

import org.ims.ignou.dao.library.add.InsertBookRecordDao;
import org.ims.ignou.dto.library.add.BookAddDto;

public class InsertBookhelper {

	private int BookId;
	
	
	
	public int getBookId() {
		return BookId;
	}




	public Boolean insert(BookAddDto bookDetail){
		
		InsertBookRecordDao bookhelper=new InsertBookRecordDao();
		if(bookhelper.addrecordbook(bookDetail)){
			BookId=bookhelper.getBook_id();
			return true;
			
		}
		
		
		
		return false;
	}
	
	
}
