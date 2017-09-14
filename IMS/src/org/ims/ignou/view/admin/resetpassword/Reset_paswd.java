package org.ims.ignou.view.admin.resetpassword;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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

import org.ims.ignou.dto.admin.AdminDto;
import org.ims.ignou.helper.admin.login.GetAdminDetail;
import org.ims.ignou.helper.admin.resetpassword.CompareDetailResetPAsswordAdmin;
import org.ims.ignou.helper.admin.resetpassword.PasswordResetValidation;
import org.ims.ignou.helper.admin.resetpassword.UpdatePasswordHelper;
import org.ims.ignou.view.admin.login.Login;
/*
 * Note Reset_passwd class help admin to reset it's password.
 * Reset_passwd class take input:
 * 1) First name
 * 2) Email id
 * 3) contact no
 * 4) Last Name
 * 5) Date of Birth
 * then it match the data in database
 * if record match in database 
 * then it send verfication code to admin registered email addresss.
 * then admin need to input verfication code.
 * if verfication code match 
 * then admin can enter it's new password.
 * 
 */
import org.ims.ignou.view.admin.signup.Signup;

import com.toedter.calendar.JDateChooser;
import java.awt.Panel;
public class Reset_paswd extends JFrame 
{
	private JPanel contentPane;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	private JTextField textFieldusername;
	private JTextField textemailid;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	
	
	
	public JTextField getTextFieldusername() {
		return textFieldusername;
	}

	public JTextField getTextemailid() {
		return textemailid;
	}


	PasswordResetValidation passwordResetValidation=new PasswordResetValidation();
	private JTextField textFieldpassword;
	private  Panel pane2;

	private void login(){
		GetAdminDetail adminDetail=new GetAdminDetail();
		if(adminDetail.get()){
			Login login=new Login(adminDetail.getAdmindto());
			login.setVisible(true);			
		}
		else{
			Signup signuup=new Signup();
			signuup.setVisible(true);
		}
		
	}
	private void reset(){
		if(!textFieldpassword.getText().trim().equals("")){
		
		String newpassword=textFieldpassword.getText().trim();
		admindetail.setPassword(newpassword.toUpperCase());
		UpdatePasswordHelper helper=new UpdatePasswordHelper();
		Boolean isUpdated=helper.resetPassword(admindetail);
		if(isUpdated){
			this.setVisible(false);
			JOptionPane.showMessageDialog(this, "Password Updated Successfully !");		
			login();
		}
		else{
			this.setVisible(false);
			JOptionPane.showMessageDialog(this, "Failed to Reset password !");
		}
		}
		else{
			JOptionPane.showMessageDialog(this," Enter New Password ");
		}
	}
	private AdminDto admindetail;
	public void validation(AdminDto admindetail){
	
	this.admindetail=admindetail;
			if(passwordResetValidation.cannotBlank(this)){
				CompareDetailResetPAsswordAdmin compare=new CompareDetailResetPAsswordAdmin();
				Boolean isFound=compare.compare(this, admindetail);
					if(isFound){
						
						pane2.setVisible(true);
						btnLogin.setVisible(false);
						textFieldusername.setVisible(false);
						textemailid.setVisible(false);
						
						lblNewLabel_1.setVisible(false);
						lblNewLabel_2.setVisible(false);							
					}
			}
	}
	
	public Reset_paswd(AdminDto admindetail) 
	{
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Reset_paswd.class.getResource("Reset_Usernme_paswd.jpeg")));
		setResizable(false);
		setTitle("Change Password");
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		setBounds(100, 100, 736, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLogin = new JButton("Reset Password");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				validation(admindetail);
			}
		});
		btnLogin.setBounds(526, 199, 119, 23);
		contentPane.add(btnLogin);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Reset_paswd.class.getResource("/org/ims/ignou/view/admin/resetpassword/Reset_Usernme_paswd.jpeg")));
		lblNewLabel.setBounds(-13, 0, 460, 271);
		contentPane.add(lblNewLabel);
		
		textFieldusername = new JTextField();
		textFieldusername.setBounds(526, 58, 166, 20);
		contentPane.add(textFieldusername);
		textFieldusername.setColumns(10);
		
		textemailid = new JTextField();
		textemailid.setColumns(10);
		textemailid.setBounds(526, 96, 166, 20);
		contentPane.add(textemailid);
		
		lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(460, 61, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Email Id");
		lblNewLabel_2.setBounds(460, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
				 
				  pane2 = new Panel();
				 pane2.setBounds(449, 0, 281, 271);
				 contentPane.add(pane2);
				 pane2.setLayout(null);
				 
				 textFieldpassword = new JTextField();
				 textFieldpassword.setBounds(90, 85, 164, 20);
				 pane2.add(textFieldpassword);
				 textFieldpassword.setColumns(10);
				 
				 JLabel lblNewPassword = new JLabel("New Password");
				 lblNewPassword.setBounds(10, 88, 70, 14);
				 pane2.add(lblNewPassword);
				 
				 JButton btnResetNow = new JButton("Reset Now");
				 btnResetNow.addActionListener(new ActionListener() {
				 	public void actionPerformed(ActionEvent e) {
				 		
				 		reset();
				 	}
				 });
				 btnResetNow.setBounds(105, 166, 89, 23);
				 pane2.add(btnResetNow);
				 pane2.setVisible(false);
		
	}
}
