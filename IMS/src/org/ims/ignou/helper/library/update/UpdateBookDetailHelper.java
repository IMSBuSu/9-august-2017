package org.ims.ignou.helper.library.update;

import org.ims.ignou.dao.library.update.UpdateBookRecord;
import org.ims.ignou.dto.library.add.BookAddDto;

public class UpdateBookDetailHelper {


		public Boolean updateBook(BookAddDto bookdetail){
			UpdateBookRecord bookRecord=new UpdateBookRecord();
			Boolean isRecordUpdate=bookRecord.updateBook(bookdetail);
					if(isRecordUpdate){
						return true;
					}
					
			return false;
		}


}


