package org.ims.ignou.helper.library.find;

import org.ims.ignou.dao.library.find.SearchBookDetailInDBDao;
import org.ims.ignou.dto.library.add.BookAddDto;

public class SearchBookHelper {

	private BookAddDto bookFinddetail;

	public BookAddDto getBookFinddetail() {
		return bookFinddetail;
	}

	public Boolean searchBookRecord(int bookId){
		
		SearchBookDetailInDBDao bookDetailInDBDao=new SearchBookDetailInDBDao();
					Boolean isRecodFound=bookDetailInDBDao.searchRecord(bookId);
		
						if(isRecodFound){
									bookFinddetail=bookDetailInDBDao.getBookFinddetail();
										return true;
						}
				
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
