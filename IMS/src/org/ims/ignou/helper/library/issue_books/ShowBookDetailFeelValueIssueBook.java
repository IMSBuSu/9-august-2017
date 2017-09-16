package org.ims.ignou.helper.library.issue_books;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.helper.library.find.ShowBookDetailFeelValue;
import org.ims.ignou.view.library.issuebook.ShowBookDetailIssueBook;

public class ShowBookDetailFeelValueIssueBook extends ShowBookDetailFeelValue
{

	@Override
	public void showDetail(BookAddDto bookdetail) {
		
		ShowBookDetailIssueBook book=new ShowBookDetailIssueBook();
		feelValue(bookdetail,book);
		book.setVisible(true);
		
	}
	
}
