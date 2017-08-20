package org.ims.ignou.view.course.add;

import java.awt.Color;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;


public class CourseView extends JFrame {

	private JPanel contentPane;
	private JTextField couseName;
	private JTextField couseFees;
	public CourseView() 
	{

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
		setBackground(Color.ORANGE);
		setTitle("New Course");
		setResizable(false);
		setBounds(100, 100, 451, 297);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(10, 11, 69, 14);
		contentPane.add(lblCourseName);
		
		couseName = new JTextField();
		couseName.setBounds(89, 8, 147, 20);
		contentPane.add(couseName);
		couseName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Course Fees");
		lblNewLabel.setBounds(10, 36, 69, 14);
		contentPane.add(lblNewLabel);
		
		couseFees = new JTextField();
		couseFees.setBounds(89, 33, 69, 20);
		contentPane.add(couseFees);
		couseFees.setColumns(10);
//		
//		1:22:58
//		1:26:14
		
	
		 
		
		
	}
}
