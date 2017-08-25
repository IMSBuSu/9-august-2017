package org.ims.ignou.view.course.add;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.helper.course.add.CourseAddValidation;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CourseAddView extends JFrame {

	private JPanel contentPane;
	private CourseAddView frame;
	private JTextField txtcouseName;
	private JTextField txtcouseFees;
	private JTextField txtCourseDuration;	 
	private JLabel lblerrorcourseduration;
	private JLabel lblerrorcoursefees ;
	private JLabel lblcoursename;
	
	
	

	public void setLblerrorcourseduration(String errormessage) {
		lblerrorcourseduration.setText(errormessage);
	}

	public void setLblerrorcoursefees(String errormessage) {
		lblerrorcoursefees.setText(errormessage);
	}

	public void setLblcoursename(String errormessage) {
		lblcoursename.setText(errormessage);;
	}

	public JTextField getTxtcouseName() {
		return txtcouseName;
	}

	public JTextField getTxtcouseFees() {
		return txtcouseFees;
	}

	public JTextField getTxtCourseDuration() {
		return txtCourseDuration;
	}

	public CourseAddView() 
	{
		frame=this;
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
		
		txtcouseName = new JTextField("");
		txtcouseName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblcoursename.setText("");
			}
		});
		txtcouseName.setBounds(89, 8, 173, 20);
		contentPane.add(txtcouseName);
		txtcouseName.setColumns(10);
		
		
		
		JLabel lblcoursefees = new JLabel("Course Fees");
		lblcoursefees.setBounds(10, 36, 69, 14);
		contentPane.add(lblcoursefees);
		
		txtcouseFees = new JTextField("");
		txtcouseFees.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblerrorcoursefees.setText("");
			}
		});
		txtcouseFees.setBounds(89, 33, 147, 20);
		contentPane.add(txtcouseFees);
		txtcouseFees.setColumns(10);
		
		JLabel lblCourseDuration = new JLabel("Course Duration( In Months)");
		lblCourseDuration.setBounds(10, 67, 140, 14);
		contentPane.add(lblCourseDuration);
		
		txtCourseDuration = new JTextField("");
		txtCourseDuration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblerrorcourseduration.setText("");
			}
		});
		txtCourseDuration.setColumns(10);
		txtCourseDuration.setBounds(160, 64, 147, 20);
		contentPane.add(txtCourseDuration);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(160, 107, 89, 23);
		contentPane.add(btnAdd);		
		
		
		 lblerrorcourseduration = new JLabel("");
		lblerrorcourseduration.setForeground(Color.RED);
		lblerrorcourseduration.setBounds(317, 67, 118, 14);
		contentPane.add(lblerrorcourseduration);
		
		 lblerrorcoursefees = new JLabel("");
		lblerrorcoursefees.setForeground(Color.RED);
		lblerrorcoursefees.setBounds(246, 36, 118, 14);
		contentPane.add(lblerrorcoursefees);
	
		
		 lblcoursename = new JLabel("");
		lblcoursename.setForeground(Color.RED);
		lblcoursename.setBounds(270, 11, 94, 14);
		
		contentPane.add(lblcoursename);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CourseAddValidation validation=new CourseAddValidation();
				validation.cannotBlank(frame);			
			
			}
					
		});
		
	
	}
	
	
}
