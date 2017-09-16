package org.ims.ignou.helper.library.find;

import javax.swing.JComboBox;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.view.library.find.ShowBookDetail;

public class ShowBookDetailFeelValue {

	protected void feelValue(BookAddDto bookdetail,ShowBookDetail viewBookDetail){
		viewBookDetail.setTextFieldBookLanGuage(bookdetail.getBooklanguage());
		viewBookDetail.setTextFieldCategorycmbx(bookdetail.getBookCategory());
		viewBookDetail.setTextFieldisbn(bookdetail.getIsbn());
		viewBookDetail.setTextFieldBooksName(bookdetail.getBookName());
		viewBookDetail.setTextbookpurchasingDate(bookdetail.getBookpurchasingDate());
		viewBookDetail.setTextFieldbookid(Integer.toString(bookdetail.getBookid()));
		
	}
	public void showDetail(BookAddDto bookdetail){
		
		ShowBookDetail book=new ShowBookDetail();
		feelValue(bookdetail,book);
		book.setVisible(true);
		
	}
	
	
}
