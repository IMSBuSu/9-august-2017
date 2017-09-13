package org.ims.ignou.view.library.find;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.helper.library.find.BookfindValidation;
import org.ims.ignou.helper.library.find.SearchBookHelper;
import org.ims.ignou.helper.library.find.ShowBookDetailFeelValue;

public class BookFindView extends JFrame {

	protected JPanel contentPane;
	protected JTextField textBookId;
	protected JButton btnBookSearch;
	protected JLabel lblBookId;
	
	public JTextField getTextBookId() {
		return textBookId;
	}

	public void setTextBookId(String textBookId) {
		this.textBookId.setText(textBookId);
	}
	
	private BookfindValidation bookfindValidation=new BookfindValidation();
	public void Validation(){
		
				if(bookfindValidation.cannotBlank(this)){	
						int bookId=Integer.parseInt(textBookId.getText().toString().trim());
						SearchBookHelper searchBookHelper=new SearchBookHelper();
						Boolean isRecodFound=searchBookHelper.searchBookRecord(bookId);
							if(isRecodFound){
									this.setVisible(false);
									ShowBookDetailFeelValue showDetail = new ShowBookDetailFeelValue();
									showDetail.showDetail(searchBookHelper.getBookFinddetail());
							}
							else{
								JOptionPane.showMessageDialog(this, "Book Detail not found !");
							}
				}
	}
	public BookFindView() {
		
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

		setResizable(false);
		setTitle("Find Book Detail");
		setBounds(100, 100, 497, 289);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelIMage = new JLabel("New label");
		lblNewLabelIMage.setIcon(new ImageIcon(BookFindView.class.getResource("/org/ims/ignou/view/employee/find/Search.jpg")));
		lblNewLabelIMage.setBounds(0, 0, 316, 261);
		contentPane.add(lblNewLabelIMage);
		
		lblBookId = new JLabel("Book Id");
		lblBookId.setBounds(326, 96, 46, 14);
		contentPane.add(lblBookId);
		
		textBookId = new JTextField();
		textBookId.setBounds(378, 93, 103, 20);
		contentPane.add(textBookId);
		textBookId.setColumns(10);
		
		 btnBookSearch = new JButton("Search Book");
		btnBookSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Validation();
				
			}
		});
		btnBookSearch.setBounds(360, 152, 102, 23);
		contentPane.add(btnBookSearch);
	
	
	}
}
