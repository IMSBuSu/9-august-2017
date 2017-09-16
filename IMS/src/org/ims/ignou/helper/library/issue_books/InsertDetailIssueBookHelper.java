package org.ims.ignou.helper.library.issue_books;

import org.ims.ignou.dao.library.issueBook.InsertIssueBookDao;

public class InsertDetailIssueBookHelper {

	public boolean isue(int reciverId, int bookid) {
	
		InsertIssueBookDao  bookReciveDetailset=new InsertIssueBookDao();
				if(bookReciveDetailset.issueBook(reciverId,bookid)){
					return true;
				}
		
		return false;
	}

}



