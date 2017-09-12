package org.ims.ignou.helper.library.update;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.view.library.update.ShowBookDetailUpdate;

public class FeelValueBookDetailUpdate {

	
	public BookAddDto setDetail(ShowBookDetailUpdate bookdetl,BookAddDto addDto){
		
		addDto.setBookName(bookdetl.getTextFieldBooksName().getText().toString().trim());
		addDto.setIsbn(bookdetl.getTextFieldisbn().getText().toString().trim());
		addDto.setBooklanguage(bookdetl.getTextFieldBookLanGuage().getText().toString().trim());
		addDto.setBookid(Integer.parseInt(bookdetl.getTextFieldbookid().getText().toString().trim()));
		return addDto;
	}
	
}
