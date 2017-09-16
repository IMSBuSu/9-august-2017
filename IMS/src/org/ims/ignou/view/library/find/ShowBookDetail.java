package org.ims.ignou.view.library.find;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.ims.ignou.view.library.add.BooksAddView;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ShowBookDetail extends BooksAddView
{
	private ShowBookDetail bookDetail;
	protected JTextField textbookpurchasingDate;
	protected JTextField textFieldbookid;
	protected JTextField textFieldCategorycmbx;
	protected JButton btnSearchAnother;
	
	
	
	
	public JTextField getTextFieldbookid() {
		return textFieldbookid;
	}



	public void setTextFieldCategorycmbx(String textFieldCategorycmbx) {
		this.textFieldCategorycmbx.setText(textFieldCategorycmbx);
	}



	public void setTextFieldbookid(String textFieldbookid) {
		this.textFieldbookid.setText(textFieldbookid);
	}



	public JTextField getTextbookpurchasingDate() {
		return textbookpurchasingDate;
	}



	public void setTextbookpurchasingDate(String textbookpurchasingDate) {
		this.textbookpurchasingDate.setText(textbookpurchasingDate);
	}

protected void searchanother(){
	bookDetail.setVisible(false);
	BookFindView bookFindview=new BookFindView();
	bookFindview.setVisible(true);
}

	public ShowBookDetail() {
		bookCategorycmbx.setLocation(20, 270);
		purchasingYearcmbx.setLocation(314, 240);
		purchasingmonthcmbx.setLocation(249, 240);
		purchasingDaycmbx.setLocation(195, 240);
		btnAddnewbook.setLocation(10, 237);
		
		bookDetail=this;
		this.remove(btnAddnewbook);
		this.remove(purchasingYearcmbx);
		this.remove(purchasingDaycmbx);
		this.remove(purchasingmonthcmbx);
		this.remove(bookCategorycmbx);
		
		
		setTitle("Book Detail");
		 btnSearchAnother = new JButton("Search Another");
		btnSearchAnother.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				searchanother();
			}
		});
		btnSearchAnother.setBounds(195, 226, 122, 23);
		getContentPane().add(btnSearchAnother);
		
		textbookpurchasingDate = new JTextField();
		textbookpurchasingDate.setBounds(165, 123, 226, 20);
		getContentPane().add(textbookpurchasingDate);
		textbookpurchasingDate.setColumns(10);
		
		JLabel labelbookid = new JLabel("Book Id");
		labelbookid.setBounds(56, 193, 46, 14);
		getContentPane().add(labelbookid);
		
		textFieldbookid = new JTextField();
		textFieldbookid.setBounds(165, 185, 226, 20);
		getContentPane().add(textFieldbookid);
		textFieldbookid.setColumns(10);
		
		textFieldCategorycmbx = new JTextField();
		textFieldCategorycmbx.setBounds(165, 92, 226, 20);
		getContentPane().add(textFieldCategorycmbx);
		textFieldCategorycmbx.setColumns(10);
		
		
		
	}

	
	
}



