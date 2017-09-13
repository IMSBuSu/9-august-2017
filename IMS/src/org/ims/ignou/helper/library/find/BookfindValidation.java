package org.ims.ignou.helper.library.find;

import javax.swing.JOptionPane;

import org.ims.ignou.view.library.find.BookFindView;

public class BookfindValidation {

	private Boolean onlyNumberAllowed(BookFindView bookFindView){		
	
		try{
				Integer.parseInt(bookFindView.getTextBookId().getText().toString().trim());
				return true;
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(bookFindView, "Only Number Allowed");
		}
		return false;	

	}	
	public Boolean cannotBlank(BookFindView bookFindView){
		
		if(!bookFindView.getTextBookId().getText().toString().trim().equals(""))
		{
					if(onlyNumberAllowed(bookFindView))
					{
						return true;
					}
		}	
		else{
				JOptionPane.showMessageDialog(bookFindView, "Please Enter  Id !");
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
