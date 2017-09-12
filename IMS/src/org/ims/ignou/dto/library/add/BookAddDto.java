package org.ims.ignou.dto.library.add;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.ims.ignou.view.library.add.BooksAddView;

public class BookAddDto {

	private String bookName;
	private String isbn;
	private String booklanguage;
	private	String bookpurchasingDate;
	private String bookCategory;
	private int bookid;
	
	
	
			public int getBookid() {
		return bookid;
	}







	public void setBookid(int bookid) {
		this.bookid = bookid;
	}






			public String getBookName() {
		return bookName;
	}







	@Override
			public String toString() {
				return "BookAddDto [bookName=" + bookName + ", isbn=" + isbn + ", booklanguage=" + booklanguage
						+ ", bookpurchasingDate=" + bookpurchasingDate + ", bookCategory=" + bookCategory + ", bookid="
						+ bookid + "]";
			}







	public void setBookName(String bookName) {
		this.bookName = bookName;
	}







	public String getIsbn() {
		return isbn;
	}







	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}







	public String getBooklanguage() {
		return booklanguage;
	}







	public void setBooklanguage(String booklanguage) {
		this.booklanguage = booklanguage;
	}







	public String getBookpurchasingDate() {
		return bookpurchasingDate;
	}







	public void setBookpurchasingDate(String bookpurchasingDate) {
		this.bookpurchasingDate = bookpurchasingDate;
	}







	public String getBookCategory() {
		return bookCategory;
	}







	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}







			
	
	
}
