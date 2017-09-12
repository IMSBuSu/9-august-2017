package org.ims.ignou.helper.library.delete;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.view.library.delete.ShowBookDetailDelete;
import org.ims.ignou.view.library.find.ShowBookDetail;

public class ShowBookDeleteFeelValue {

	private void feelValue(BookAddDto bookdetail,ShowBookDetailDelete viewBookDetail){
		viewBookDetail.setTextFieldBookLanGuage(bookdetail.getBooklanguage());
		viewBookDetail.setTextFieldCategorycmbx(bookdetail.getBookCategory());
		viewBookDetail.setTextFieldisbn(bookdetail.getIsbn());
		viewBookDetail.setTextFieldBooksName(bookdetail.getBookName());
		viewBookDetail.setTextbookpurchasingDate(bookdetail.getBookpurchasingDate());
		viewBookDetail.setTextFieldbookid(Integer.toString(bookdetail.getBookid()));
		
	}
	public void showDetail(BookAddDto bookdetail){
		
		ShowBookDetailDelete book=new ShowBookDetailDelete();
		feelValue(bookdetail,book);
		book.setVisible(true);
		
	}
	
}
