package org.ims.ignou.view.student.find;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowStudentDetailView extends JFrame {

	private JPanel contentPane;

	private JTextField textteachername;
	private JTextField textstudob;
	private JTextField textstudenid;
	private JTextField textEmailid;
	private JTextField textfatherName;
	private JLabel labelstuimage;
	private ShowStudentDetailView frame;
	private JTextField textStudentName;
	private JTextField textBatchTimeing;
	private JTextField textFieldCourseName;
	private JTextField textremainFees;





	public void setTextteachername(String textteachername) {
		this.textteachername.setText(textteachername);
	}





	public void setTextstudob(String textstudob) {
		this.textstudob.setText(textstudob);
	}





	public void setTextstudenid(String textstudenid) {
		this.textstudenid.setText(textstudenid);
	}





	public void setTextEmailid(String textEmailid) {
		this.textEmailid.setText(textEmailid);
	}





	public void setTextfatherName(String textfatherName) {
		this.textfatherName.setText(textfatherName);
	}





	public void setLabelstuimage(ImageIcon labelstuimage) {
		this.labelstuimage.setIcon(labelstuimage);
	}





	public void setTextStudentName(String textStudentName) {
		this.textStudentName.setText(textStudentName);
	}





	public void setTextBatchTimeing(String textBatchTimeing) {
		this.textBatchTimeing.setText(textBatchTimeing);
	}





	public void setTextFieldCourseName(String textFieldCourseName) {
		this.textFieldCourseName.setText(textFieldCourseName);
	}





	public void setTextremainFees(String textremainFees) {
		this.textremainFees.setText(textremainFees);
	}





	public ShowStudentDetailView() {
		setTitle("Student Detail");
		setResizable(false);
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
		   frame=this;
		setBounds(100, 100, 607, 379);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblteacherName = new JLabel("Teacher Name");
		lblteacherName.setBounds(39, 179, 88, 14);
		contentPane.add(lblteacherName);
		
		textteachername = new JTextField();
		textteachername.setBounds(137, 176, 263, 20);
		contentPane.add(textteachername);
		textteachername.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("DOB");
		lblDateOfBirth.setBounds(39, 67, 26, 14);
		contentPane.add(lblDateOfBirth);
		
		textstudob = new JTextField();
		textstudob.setColumns(10);
		textstudob.setBounds(137, 64, 263, 20);
		contentPane.add(textstudob);
		
		JLabel lblStudentId = new JLabel("Student Id");
		lblStudentId.setBounds(39, 95, 88, 14);
		contentPane.add(lblStudentId);
		
		textstudenid = new JTextField();
		textstudenid.setColumns(10);
		textstudenid.setBounds(137, 92, 263, 20);
		contentPane.add(textstudenid);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(39, 123, 88, 14);
		contentPane.add(lblEmailId);
		
		textEmailid = new JTextField();
		textEmailid.setColumns(10);
		textEmailid.setBounds(137, 120, 263, 20);
		contentPane.add(textEmailid);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(39, 151, 88, 14);
		contentPane.add(lblFathersName);
		
		textfatherName = new JTextField();
		textfatherName.setColumns(10);
		textfatherName.setBounds(137, 148, 263, 20);
		contentPane.add(textfatherName);
		
		 labelstuimage = new JLabel("Image Not Found");
		labelstuimage.setBackground(Color.CYAN);
		labelstuimage.setBounds(453, 60, 103, 105);
		contentPane.add(labelstuimage);
		
		
		
		JButton btnSearchAnother = new JButton("Search Another");
		btnSearchAnother.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				StudentSearchView employeeSearchView=new StudentSearchView();
				employeeSearchView.setVisible(true);
			}	
		});
		btnSearchAnother.setBounds(228, 305, 133, 23);
		contentPane.add(btnSearchAnother);
		
		JLabel lblstudentname = new JLabel("Student Name");
		lblstudentname.setBounds(39, 39, 88, 14);
		contentPane.add(lblstudentname);
		
		textStudentName = new JTextField();
		textStudentName.setColumns(10);
		textStudentName.setBounds(137, 36, 263, 20);
		contentPane.add(textStudentName);
		
		JLabel lblBatchTimeing = new JLabel("Batch Timeing");
		lblBatchTimeing.setBounds(39, 207, 88, 14);
		contentPane.add(lblBatchTimeing);
		
		textBatchTimeing = new JTextField();
		textBatchTimeing.setColumns(10);
		textBatchTimeing.setBounds(137, 204, 263, 20);
		contentPane.add(textBatchTimeing);
		
		JLabel labelcoursename = new JLabel("Course Name");
		labelcoursename.setBounds(39, 235, 88, 14);
		contentPane.add(labelcoursename);
		
		textFieldCourseName = new JTextField();
		textFieldCourseName.setColumns(10);
		textFieldCourseName.setBounds(137, 232, 263, 20);
		contentPane.add(textFieldCourseName);
		
		textremainFees = new JTextField();
		textremainFees.setColumns(10);
		textremainFees.setBounds(137, 260, 263, 20);
		contentPane.add(textremainFees);
		
		JLabel labelremainFees = new JLabel("Remain Fees");
		labelremainFees.setBounds(39, 263, 88, 14);
		contentPane.add(labelremainFees);
		setLocationRelativeTo(null);
	}
}
