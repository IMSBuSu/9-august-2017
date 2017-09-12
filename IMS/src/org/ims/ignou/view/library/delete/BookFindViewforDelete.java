package org.ims.ignou.view.library.delete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.ims.ignou.helper.library.find.BookfindValidation;
import org.ims.ignou.view.library.find.BookFindView;

public class BookFindViewforDelete extends BookFindView
{

	BookfindValidation bookfindValidation=new BookfindValidation();
	
	public void Validation(){
		
		
				if(bookfindValidation.cannotBlank(this)){
						
					
							
					
					
					
					
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
