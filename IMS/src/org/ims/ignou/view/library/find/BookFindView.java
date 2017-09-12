package org.ims.ignou.view.library.find;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.helper.library.find.BookfindValidation;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookFindView extends JFrame {

	private JPanel contentPane;
	private JTextField textBookId;

	
	
	public JTextField getTextBookId() {
		return textBookId;
	}

	public void setTextBookId(String textBookId) {
		this.textBookId.setText(textBookId);
	}
	
	private BookfindValidation bookfindValidation=new BookfindValidation();
	public void Validation(){
		
				if(bookfindValidation.cannotBlank(this)){	

					
								JOptionPane.showMessageDialog(this, "Fine");
				
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
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setBounds(326, 96, 46, 14);
		contentPane.add(lblBookId);
		
		textBookId = new JTextField();
		textBookId.setBounds(378, 93, 103, 20);
		contentPane.add(textBookId);
		textBookId.setColumns(10);
		
		JButton btnBookSearch = new JButton("Search Book");
		btnBookSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Validation();
				
			}
		});
		btnBookSearch.setBounds(360, 152, 102, 23);
		contentPane.add(btnBookSearch);
	
	
	}
}
