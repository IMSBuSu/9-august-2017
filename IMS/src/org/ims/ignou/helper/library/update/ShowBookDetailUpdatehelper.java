package org.ims.ignou.helper.library.update;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.view.library.find.ShowBookDetail;
import org.ims.ignou.view.library.update.ShowBookDetailUpdate;

public class ShowBookDetailUpdatehelper {

	
	private void feelValue(BookAddDto bookdetail,ShowBookDetailUpdate viewBookDetail){
		viewBookDetail.setTextFieldBookLanGuage(bookdetail.getBooklanguage());
		viewBookDetail.setTextFieldCategorycmbx(bookdetail.getBookCategory());
		viewBookDetail.setTextFieldisbn(bookdetail.getIsbn());
		viewBookDetail.setTextFieldBooksName(bookdetail.getBookName());
		viewBookDetail.setTextbookpurchasingDate(bookdetail.getBookpurchasingDate());
		viewBookDetail.setTextFieldbookid(Integer.toString(bookdetail.getBookid()));
		
	}
	public void showDetail(BookAddDto bookdetail){
		
		ShowBookDetailUpdate book=new ShowBookDetailUpdate();
		feelValue(bookdetail,book);
		book.setVisible(true);
		
	}
	

}
