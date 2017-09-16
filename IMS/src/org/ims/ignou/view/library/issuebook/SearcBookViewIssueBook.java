package org.ims.ignou.view.library.issuebook;

import javax.swing.JOptionPane;

import org.ims.ignou.helper.library.find.SearchBookHelper;
import org.ims.ignou.helper.library.issue_books.ShowBookDetailFeelValueIssueBook;
import org.ims.ignou.view.library.find.BookFindView;

public class SearcBookViewIssueBook extends BookFindView
{
	
	
	
	@Override
	public void Validation() {
	
		if(bookfindValidation.cannotBlank(this)){	
			int bookId=Integer.parseInt(textBookId.getText().toString().trim());
			SearchBookHelper searchBookHelper=new SearchBookHelper();
			Boolean isRecodFound=searchBookHelper.searchBookRecord(bookId);
				if(isRecodFound){
						this.setVisible(false);
						ShowBookDetailFeelValueIssueBook bookDetailIssueBook=new ShowBookDetailFeelValueIssueBook();
						bookDetailIssueBook.showDetail(searchBookHelper.getBookFinddetail());
						
				}
				else{
					JOptionPane.showMessageDialog(this, "Book Detail not found !");
				}
	}	
		
	
	
	}
	
	

}
