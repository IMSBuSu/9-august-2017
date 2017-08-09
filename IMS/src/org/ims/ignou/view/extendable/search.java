package org.ims.ignou.view.extendable;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class search extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtIdentificationNumber;
	private JLabel image;
	protected JButton btnsearch;
	public search() {
	
		try
	    {			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
	    	try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} 
	    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
		    	JOptionPane.showMessageDialog(null, "GUI of IMS Are not Compatable with your opeating system");		
			}	   
	    	
	    }
		setBackground(Color.ORANGE);
		setTitle("                                              Search Employee");
		setResizable(false);

		setBounds(100, 100, 494, 276);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdentificationNumber = new JTextField();
		txtIdentificationNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(txtIdentificationNumber.getText().equals("Identification Number"))
				{
					txtIdentificationNumber.setText("");
				}		
			}
			
		});
		txtIdentificationNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtIdentificationNumber.getText().equals("Identification Number"))
				{
					txtIdentificationNumber.setText("");
				}
		
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(txtIdentificationNumber.getText().equals(""))
				{
					txtIdentificationNumber.setText("Identification Number");
				}		
			}
		});
		
		txtIdentificationNumber.addMouseMotionListener(new MouseMotionAdapter() {			
			@Override
			public void mouseMoved(MouseEvent e) {
				if(txtIdentificationNumber.getText().equals("Identification Number"))
				{
					txtIdentificationNumber.setText("");
				}
			}
		});
	
		txtIdentificationNumber.setText("Identification Number");
		txtIdentificationNumber.setBounds(308, 89, 138, 23);
		contentPane.add(txtIdentificationNumber);
		txtIdentificationNumber.setColumns(10);
		
		btnsearch = new JButton("Search");
				
		btnsearch.setBounds(335, 137, 89, 23);
		contentPane.add(btnsearch);
		
		image = new JLabel("");
		image.setIcon(new ImageIcon(search.class.getResource("/org/ims/ignou/view/extendable/Search.jpg")));
		image.setBounds(0, 0, 271, 247);
		contentPane.add(image);
		
	}
}
