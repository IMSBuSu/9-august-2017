package org.ims.ignou.helper.library.add;

import javax.swing.JOptionPane;

import org.ims.ignou.view.library.add.BooksAddView;

public class ValidationAddBookView {

	public Boolean canNotBlank(BooksAddView bookView){
		
		if((bookView.getTextFieldBooksName().getText().trim()).equals(""))
		{
			
			JOptionPane.showMessageDialog(bookView, "Book Name Can Not Blank !");
			return false;
		}
		if((bookView.getBookCategorycmbx().getSelectedItem().equals(bookView.getBookCategorycmbx().getItemAt(0))))
		{
			
			JOptionPane.showMessageDialog(bookView, "Select Book Category");
			return false;
		}
		if((bookView.getPurchasingDaycmbx().getSelectedItem().equals(bookView.getPurchasingDaycmbx().getItemAt(0))))
		{
			
			JOptionPane.showMessageDialog(bookView, "Select Book purchasing Day !");
			return false;
		}
		if((bookView.getPurchasingmonthcmbx().getSelectedItem().equals(bookView.getPurchasingmonthcmbx().getItemAt(0))))
		{
			JOptionPane.showMessageDialog(bookView, "Select Book purchasing Month !");
			return false;
		}
		if((bookView.getPurchasingYearcmbx().getSelectedItem().equals(bookView.getPurchasingYearcmbx().getItemAt(0))))
		{
			
			JOptionPane.showMessageDialog(bookView, "Select Book purchasing Year !");
			return false;
		}
		if((bookView.getTextFieldBookLanGuage().getText().trim()).equals(""))
		{
			JOptionPane.showMessageDialog(bookView, "Book LanGuage Can Not Blank !");
			return false;
		}
			
			return true;
}
}
