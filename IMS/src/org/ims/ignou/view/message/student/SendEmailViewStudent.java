package org.ims.ignou.view.message.student;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.helper.message.SendEmailHelper;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SendEmailViewStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldReciveEmail;
	private JLabel lblSendEmailId;
	private JTextField textFieldSenderEmail;
	private TextArea textAreaMessage;
	private String 	senderPassword;
	private JTextField textSubject;
	public void validation(){		
			if(!textSubject.getText().trim().equals(""))
			{	if(!textAreaMessage.getText().trim().equals(""))
				{
					 SendEmailHelper sendemail = new SendEmailHelper();					
					 Boolean isSuccs=sendemail.send(textFieldReciveEmail.getText().toString().trim(), textFieldSenderEmail.getText().trim(),senderPassword,textAreaMessage.getText().trim(),textSubject.getText().trim());
					 if(isSuccs){
						 this.setVisible(false);
						 JOptionPane.showMessageDialog(this, "Email Sent Succeessfully ! ");
					 }else{
						 this.setVisible(false);
						 JOptionPane.showMessageDialog(this, "Failed to Send Email !");
					 }
				}else{
					JOptionPane.showMessageDialog(this, "Message Can not Blank");
				}
			}
			else{
				JOptionPane.showMessageDialog(this, "Subject Can not Be Blank");
			}
	}
	
	public SendEmailViewStudent(String senderPassword,String senderEmailId,String receiverEmailId) {
		this.senderPassword=senderPassword;
		setTitle("Send Email");
		setBackground(Color.ORANGE);
		setResizable(false);
		setBounds(100, 100, 566, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldReciveEmail = new JTextField();
		textFieldReciveEmail.setEditable(false);
		textFieldReciveEmail.setBounds(221, 61, 277, 20);
		contentPane.add(textFieldReciveEmail);
		textFieldReciveEmail.setColumns(10);
		textFieldReciveEmail.setText(receiverEmailId);
		
		JLabel lblReciverEmailId = new JLabel("Reciver Email Id");
		lblReciverEmailId.setBounds(52, 64, 91, 14);
		contentPane.add(lblReciverEmailId);
		
		lblSendEmailId = new JLabel("Send Email ID");
		lblSendEmailId.setBounds(52, 28, 91, 14);
		contentPane.add(lblSendEmailId);
		
		textFieldSenderEmail = new JTextField();
		textFieldSenderEmail.setEditable(false);
		textFieldSenderEmail.setColumns(10);
		textFieldSenderEmail.setBounds(221, 30, 277, 20);
		contentPane.add(textFieldSenderEmail);
		textFieldSenderEmail.setText(senderEmailId);
		
		textAreaMessage = new TextArea();
		textAreaMessage.setBounds(70, 199, 439, 185);
		contentPane.add(textAreaMessage);
		
		Label label = new Label("Message");
		label.setBounds(6, 199, 58, 22);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Send Email");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validation();
			}
		});
		btnNewButton.setBounds(272, 416, 89, 23);
		contentPane.add(btnNewButton);
		
		textSubject = new JTextField();
		textSubject.setBounds(70, 134, 439, 20);
		contentPane.add(textSubject);
		textSubject.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(6, 137, 46, 14);
		contentPane.add(lblSubject);
		setLocationRelativeTo(null);
		
	}
}
