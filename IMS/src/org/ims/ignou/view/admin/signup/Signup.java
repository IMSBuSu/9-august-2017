package org.ims.ignou.view.admin.signup;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.dto.admin.AdminDto;
import org.ims.ignou.helper.admin.signup.AddAdminhelper;
import org.ims.ignou.helper.admin.signup.SignupValidation;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JLabel labelEmailId;
	private JTextField textFieldemailid;
	private JLabel labelPassword;
	private JTextField textField_password;
	private JDateChooser dateChooser;
	private JLabel lblDob;
	
	
	public JTextField getTextFieldUsername() {
		return textFieldUsername;
	}


	public JTextField getTextFieldemailid() {
		return textFieldemailid;
	}


	public JTextField getTextField_password() {
		return textField_password;
	}


	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	private AdminDto feelDtail(){
		AdminDto adminDto=new AdminDto();
		adminDto.setDob(dateChooser.getDate().toString());
		adminDto.setEmailID(textFieldemailid.getText().trim());
		adminDto.setName(textFieldUsername.getText().trim());
		adminDto.setPassword(textField_password.getText().trim());
		return adminDto;
	}
	
	
	
private SignupValidation signup=new SignupValidation();
	public void validation(){
		if(signup.cannotblank(this))
		{
			
			AdminDto adminDto=feelDtail();
			 AddAdminhelper addadmin = new AddAdminhelper();
			 Boolean isAdminAdd=addadmin.add(adminDto);
			 if(isAdminAdd)
			 {
				 this.setVisible(false);
				 JOptionPane.showMessageDialog(this, "Admin Added Success!");
				 
			 }
			 else{
				 this.setVisible(false);
				 JOptionPane.showMessageDialog(this, "Failed to Add Admin!");
			 
			 }
			
			
			
			
		}
		
	}
	
	
	public Signup() {
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
		
		
		setTitle("Admin Registration");
		setBounds(100, 100, 388, 259);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(10, 29, 61, 14);
		contentPane.add(lblUserName);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(86, 26, 260, 20);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		labelEmailId = new JLabel("Email Id");
		labelEmailId.setBounds(10, 57, 61, 14);
		contentPane.add(labelEmailId);
		
		textFieldemailid = new JTextField();
		textFieldemailid.setColumns(10);
		textFieldemailid.setBounds(86, 54, 260, 20);
		contentPane.add(textFieldemailid);
		
		labelPassword = new JLabel("Password");
		labelPassword.setBounds(10, 85, 61, 14);
		contentPane.add(labelPassword);
		
		textField_password = new JTextField();
		textField_password.setColumns(10);
		textField_password.setBounds(86, 82, 260, 20);
		contentPane.add(textField_password);
		setLocationRelativeTo(null);
		
		
		 dateChooser=new JDateChooser();
			dateChooser.setDateFormatString("d/MMM/yyyy");
			dateChooser.setToolTipText("Choose Date");
			dateChooser.setBounds(85, 113, 134, 24);
			contentPane.add(dateChooser);
			
			lblDob = new JLabel("DOB");
			lblDob.setBounds(10, 120, 61, 14);
			contentPane.add(lblDob);
			
			JButton btnAddAdmin = new JButton("Add Admin");
			btnAddAdmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					validation();
				}
			});
			btnAddAdmin.setBounds(150, 167, 89, 23);
			contentPane.add(btnAddAdmin);
			
			
	
	}
}
