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

import org.ims.ignou.dao.course.add.AddtoDB;
import org.ims.ignou.dto.course.add.AddDto;
import org.ims.ignou.helper.course.add.Addhelper;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class CourseView extends JFrame {

	private JPanel contentPane;
	private JTextField txtcouseName;
	private JTextField txtcouseFees;
	private JTextField txtCourseDuration;
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
		setTitle("                                                     New Course");
		setResizable(false);
		setBounds(100, 100, 451, 179);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(10, 11, 69, 14);
		contentPane.add(lblCourseName);
		
		txtcouseName = new JTextField();
		txtcouseName.setBounds(89, 8, 327, 20);
		contentPane.add(txtcouseName);
		txtcouseName.setColumns(10);
		
		JLabel lblcoursefees = new JLabel("Course Fees");
		lblcoursefees.setBounds(10, 36, 69, 14);
		contentPane.add(lblcoursefees);
		
		txtcouseFees = new JTextField();
		txtcouseFees.setBounds(89, 33, 147, 20);
		contentPane.add(txtcouseFees);
		txtcouseFees.setColumns(10);
		
		JLabel lblCourseDuration = new JLabel("Course Duration( In Months)");
		lblCourseDuration.setBounds(10, 67, 140, 14);
		contentPane.add(lblCourseDuration);
		
		txtCourseDuration = new JTextField();
		txtCourseDuration.setColumns(10);
		txtCourseDuration.setBounds(160, 64, 147, 20);
		contentPane.add(txtCourseDuration);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddDto courseDetails=new AddDto();
				courseDetails.setCourseDuration(txtCourseDuration.getText());
				courseDetails.setCourseFees(txtcouseFees.getText());
				courseDetails.setCourseName(txtcouseName.getText());
				Addhelper.setCourseDetails(courseDetails);
				AddtoDB  SavetoDb=new AddtoDB();
				SavetoDb.insert();
				
			}
		});
		btnAdd.setBounds(160, 107, 89, 23);
		contentPane.add(btnAdd);
//		
//		1:22:58
//		1:26:14
		
	
		 
		
		
	}
}
