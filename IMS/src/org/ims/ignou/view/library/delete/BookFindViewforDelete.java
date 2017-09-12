package org.ims.ignou.view.library.delete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.helper.library.delete.ShowBookDeleteFeelValue;
import org.ims.ignou.helper.library.find.BookfindValidation;
import org.ims.ignou.helper.library.find.SearchBookHelper;
import org.ims.ignou.view.library.find.BookFindView;

public class BookFindViewforDelete extends BookFindView
{

	BookfindValidation bookfindValidation=new BookfindValidation();
	
	public void Validation(){
		
		
				if(bookfindValidation.cannotBlank(this)){
					int bookId=Integer.parseInt(textBookId.getText().toString().trim());
					SearchBookHelper searchBookdetail=new  SearchBookHelper();
					Boolean isrecordFound=searchBookdetail.searchBookRecord(bookId);
							if(isrecordFound){
									this.setVisible(false);
									BookAddDto bookDetail=searchBookdetail.getBookFinddetail();
									ShowBookDeleteFeelValue showdetail = new ShowBookDeleteFeelValue();	
									showdetail.showDetail(bookDetail);
							}
							else{
								JOptionPane.showMessageDialog(this, "Book Detail Not Found !");
							}
							
						
				}
	}
	public BookFindViewforDelete() {
		btnBookSearch.setLocation(311, 237);
		
		
		this.remove(btnBookSearch);
		
		JButton btnNewButton = new JButton("Search Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Validation();
			}
		});
		btnNewButton.setBounds(359, 149, 103, 23);
		getContentPane().add(btnNewButton);
		
		
		
		
		
	}
	
}
