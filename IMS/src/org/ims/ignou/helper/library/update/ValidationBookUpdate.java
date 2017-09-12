package org.ims.ignou.helper.library.update;

import javax.swing.JOptionPane;

import org.ims.ignou.view.library.update.ShowBookDetailUpdate;

public class ValidationBookUpdate {

	
	public Boolean updateVali(ShowBookDetailUpdate bookDetail){
		
		if(bookDetail.getTextFieldBooksName().getText().toString().trim().equals("")){
			JOptionPane.showMessageDialog(bookDetail, "Book Name Can not Blank!");
			return false;
		}
		if(bookDetail.getTextFieldBookLanGuage().getText().toString().trim().equals(""))
		{
			JOptionPane.showMessageDialog(bookDetail, "Book language Can not blank!");
			return false;
		}
		
		
	return true;	
	}
	
}
