package org.ims.ignou.view.student.delete;

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

import org.ims.ignou.helper.student.delete.DeleteStuRecord;

public class DeleteShowStudentView extends JFrame{
	private JPanel contentPane;
	private JTextField textStudentname;
	private JTextField textStudob;
	private JTextField textStuid;
	private JTextField textEmailidstu;
	private JTextField textfatherName;
	private JLabel labelstuimage;
	private DeleteShowStudentView frame;
	private JTextField textcourseNAme;

	public void setTextstudob(String dob) {
		this.textStudob.setText(dob);
	}
	public void setTextcoursename(String textcursename) {
		this.textcourseNAme.setText(textcursename);
	}

	public void setempImage(ImageIcon img){
		 labelstuimage.setIcon(img);

	}
	public void setTextEMPname(String textEMPname) {
		this.textStudentname.setText(textEMPname);
	}

	public void setTextempdob(String textempdob) {
		this.textStudob.setText(textempdob);
	}

	public void setTextempid(String textempid) {
		setTitle("Employee Id :- "+textempid);
		this.textStuid.setText(textempid);
	}

	public void setTextEmailid(String textEmailid) {
		this.textEmailidstu.setText(textEmailid);
	}

	public void setTextfatherName(String textfatherName) {
		this.textfatherName.setText(textfatherName);
	}

	
	 public DeleteShowStudentView() {
	 	setTitle("Delete Student");
	 
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
		setBounds(100, 100, 607, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Student Name");
		lblEmployeeName.setBounds(39, 39, 88, 14);
		contentPane.add(lblEmployeeName);
		
		textStudentname = new JTextField();
		textStudentname.setBounds(137, 36, 263, 20);
		contentPane.add(textStudentname);
		textStudentname.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("DOB");
		lblDateOfBirth.setBounds(39, 67, 26, 14);
		contentPane.add(lblDateOfBirth);
		
		textStudob = new JTextField();
		textStudob.setColumns(10);
		textStudob.setBounds(137, 64, 263, 20);
		contentPane.add(textStudob);
		
		JLabel lblstudentId = new JLabel("Student Id");
		lblstudentId.setBounds(39, 95, 88, 14);
		contentPane.add(lblstudentId);
		
		textStuid = new JTextField();
		textStuid.setColumns(10);
		textStuid.setBounds(137, 92, 263, 20);
		contentPane.add(textStuid);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(39, 123, 88, 14);
		contentPane.add(lblEmailId);
		
		textEmailidstu = new JTextField();
		textEmailidstu.setColumns(10);
		textEmailidstu.setBounds(137, 120, 263, 20);
		contentPane.add(textEmailidstu);
		
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
		
		
		
		JButton btndeleteEmpRecord = new JButton("Delete Student");
		btndeleteEmpRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				int askDeleterecrd=JOptionPane.showConfirmDialog(frame, "Do You Want To Delete Student Record ?");
				if(askDeleterecrd==0){
							frame.setVisible(false);
							DeleteStuRecord deleteStuRecord=new DeleteStuRecord();
							Boolean isRecord=deleteStuRecord.DeleteRecord(Integer.parseInt(textStuid.getText()));
								if(isRecord){
									JOptionPane.showMessageDialog(frame, "Success To Delete Record");				
								}		
								else{
									JOptionPane.showMessageDialog(frame, "Failed To Delete Reocrd");
								}				
				}
				
			}	
		});
		btndeleteEmpRecord.setBounds(229, 217, 133, 23);
		contentPane.add(btndeleteEmpRecord);
		
		textcourseNAme = new JTextField();
		textcourseNAme.setColumns(10);
		textcourseNAme.setBounds(137, 176, 263, 20);
		contentPane.add(textcourseNAme);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(39, 179, 88, 14);
		contentPane.add(lblCourseName);
		setLocationRelativeTo(null);

	
	 }

	
	
}	 
