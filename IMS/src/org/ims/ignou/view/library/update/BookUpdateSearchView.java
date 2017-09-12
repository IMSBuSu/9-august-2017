package org.ims.ignou.view.library.update;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.helper.library.find.BookfindValidation;
import org.ims.ignou.helper.library.find.SearchBookHelper;
import org.ims.ignou.helper.library.update.ShowBookDetailUpdatehelper;
import org.ims.ignou.view.library.find.BookFindView;

public class BookUpdateSearchView extends BookFindView
{
	private BookfindValidation bookfindValidation=new BookfindValidation();
	
	
	public void validation(){
		
		if(bookfindValidation.cannotBlank(this)){
		
			int bookId=Integer.parseInt(textBookId.getText().toString().trim());
			SearchBookHelper searchBookHelper=new SearchBookHelper();
			Boolean isRecodFound=searchBookHelper.searchBookRecord(bookId);
			BookAddDto bookDetail=new BookAddDto();
			bookDetail=searchBookHelper.getBookFinddetail();
			if(isRecodFound){
				this.setVisible(false);
			
					ShowBookDetailUpdatehelper showDetail=new ShowBookDetailUpdatehelper();
					showDetail.showDetail(bookDetail);
				
			}
			else{
				JOptionPane.showMessageDialog(this, "No Book Detail Found");
			}
			
			
			
		}
		
	}
	
	public BookUpdateSearchView() {
	
	
	this.remove(btnBookSearch);
	
	JButton btnSearchBook = new JButton("Search Book");
	btnSearchBook.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			validation();
		}
	});
	btnSearchBook.setBounds(360, 152, 101, 23);
	getContentPane().add(btnSearchBook);
	
	
	
	
	
	
	
	
	
	}
}
