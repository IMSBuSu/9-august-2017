package org.ims.ignou.view.library.add;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.dto.library.add.BookAddDto;
import org.ims.ignou.helper.library.add.InsertBookhelper;
import org.ims.ignou.helper.library.add.ValidationAddBookView;

public class BooksAddView extends JFrame {

	private JPanel contentPane;
	protected JTextField textFieldBooksName;
	protected JTextField textFieldisbn;
	protected JTextField textFieldBookLanGuage;
	protected	JComboBox<String> purchasingDaycmbx;
	protected	JComboBox<String> purchasingYearcmbx;
	protected JComboBox<String> purchasingmonthcmbx;
	protected JComboBox<String> bookCategorycmbx;
	protected JButton btnAddnewbook;
 	
	
	
	
	
	public void setTextFieldBooksName(String textFieldBooksName) {
		this.textFieldBooksName.setText(textFieldBooksName);
	}
	public void setTextFieldisbn(String textFieldisbn) {
		this.textFieldisbn.setText(textFieldisbn);
	}
	public void setTextFieldBookLanGuage(String textFieldBookLanGuage) {
		this.textFieldBookLanGuage.setText(textFieldBookLanGuage);
	}
	public JTextField getTextFieldBooksName() {
		return textFieldBooksName;
	}
	public JTextField getTextFieldisbn() {
		return textFieldisbn;
	}
	public JTextField getTextFieldBookLanGuage() {
		return textFieldBookLanGuage;
	}
	public JComboBox<String> getPurchasingDaycmbx() {
		return purchasingDaycmbx;
	}
	public JComboBox<String> getPurchasingYearcmbx() {
		return purchasingYearcmbx;
	}
	public JComboBox<String> getPurchasingmonthcmbx() {
		return purchasingmonthcmbx;
	}
	public JComboBox<String> getBookCategorycmbx() {
		return bookCategorycmbx;
	}
	private ValidationAddBookView addBookView=new ValidationAddBookView();

	public BookAddDto feelBookDetail(){
	BookAddDto addDto=new BookAddDto();
		addDto.setBookName(textFieldBooksName.getText());
		addDto.setIsbn(textFieldisbn.getText().trim());
		addDto.setBookCategory(bookCategorycmbx.getSelectedItem().toString());
		addDto.setBookpurchasingDate(purchasingDaycmbx.getSelectedItem().toString()+"/"+
		purchasingmonthcmbx.getSelectedItem().toString()+"/"+purchasingYearcmbx.getSelectedItem().toString());
		addDto.setBooklanguage(textFieldBookLanGuage.getText());
		return addDto;
	}
	
	public void validation(){
		
					if(addBookView.canNotBlank(this)){
						InsertBookhelper addbook=new InsertBookhelper();
						if(addbook.insert(feelBookDetail())){
							this.setVisible(false);
								JOptionPane.showMessageDialog(this,"Book Add successfully  , Book id :-"+addbook.getBookId());
						}
						else{
							this.setVisible(false);
							JOptionPane.showMessageDialog(this, "FAiled to Add Book");
						}
					}
	}
	public BooksAddView() {
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
	    	try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} 
	    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
						    	//theme not supported	
			}	    
	    	
		}
		
		
		
		
		setTitle("Add New Book");
		setResizable(false);
		setBounds(100, 100, 460, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(53, 39, 70, 14);
		contentPane.add(lblBookName);
		
		textFieldBooksName = new JTextField();
		textFieldBooksName.setBounds(165, 33, 226, 20);
		contentPane.add(textFieldBooksName);
		textFieldBooksName.setColumns(10);
		
		textFieldisbn = new JTextField();
		textFieldisbn.setColumns(10);
		textFieldisbn.setBounds(165, 61, 226, 20);
		contentPane.add(textFieldisbn);
		
		JLabel labelisbn = new JLabel("ISBN");
		labelisbn.setBounds(53, 67, 70, 14);
		contentPane.add(labelisbn);
		
		JLabel lblBookCategory = new JLabel("CateGory");
		lblBookCategory.setBounds(53, 98, 70, 14);
		contentPane.add(lblBookCategory);
		
		JLabel lblPurchasingDate = new JLabel("Purchasing Date");
		lblPurchasingDate.setBounds(53, 129, 88, 14);
		contentPane.add(lblPurchasingDate);
		
		textFieldBookLanGuage = new JTextField();
		textFieldBookLanGuage.setColumns(10);
		textFieldBookLanGuage.setBounds(165, 154, 226, 20);
		contentPane.add(textFieldBookLanGuage);
		
		JLabel lblBookLanguage = new JLabel("Book LanGuage");
		lblBookLanguage.setBounds(53, 160, 88, 14);
		contentPane.add(lblBookLanguage);
		
		 bookCategorycmbx = new JComboBox();
		bookCategorycmbx.setMaximumRowCount(10);
		bookCategorycmbx.setModel(new DefaultComboBoxModel(new String[] {"Select", "Science fiction", "Satire", "Drama", "Action and Adventure", "Romance", "Mystery", "Horror", "Health", "Travel", "Children's", "Religion, Spirituality & New Age", "Science", "History", "Math", "Anthology", "Poetry", "Encyclopedias", "Dictionaries", "Comics", "Art", "Cookbooks", "Diaries", "Journals", "Prayer books", "Series", "Trilogy", "Biographies", "Autobiographies", "Fantasy"}));
		bookCategorycmbx.setBounds(165, 92, 226, 20);
		contentPane.add(bookCategorycmbx);
		
		
		
		 purchasingDaycmbx = new JComboBox();
		purchasingDaycmbx.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		purchasingDaycmbx.setBounds(165, 123, 44, 20);
		contentPane.add(purchasingDaycmbx);
		
		 purchasingYearcmbx = new JComboBox();
		purchasingYearcmbx.setModel(new DefaultComboBoxModel(new String[] {"Year", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		purchasingYearcmbx.setBounds(284, 123, 55, 20);
		contentPane.add(purchasingYearcmbx);
		
		 purchasingmonthcmbx = new JComboBox();
		purchasingmonthcmbx.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		purchasingmonthcmbx.setBounds(219, 123, 55, 20);
		contentPane.add(purchasingmonthcmbx);
		
		 btnAddnewbook = new JButton("Add New Book");
		btnAddnewbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				validation();
			}
		});
		btnAddnewbook.setBounds(168, 205, 128, 23);
		contentPane.add(btnAddnewbook);
		setLocationRelativeTo(null);
		
	}


}
