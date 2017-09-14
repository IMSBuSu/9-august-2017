package org.ims.ignou.helper.message;

import java.util.Properties;

import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//Activate gmail for less secure app (turn on) https://www.google.com/settings/u/0/security/lesssecureapps?pageId=none
//https://www.youtube.com/watch?v=F51dZmaMCQc
public class EmailSent 
{ 
	
	 String senderEmailID=null;
	 String senderPassword =null;
	final String emailSMTPserver = "smtp.gmail.com";
	final String emailServerPort = "465";
	String receiverEmailID = null;
	 String emailSubject = "Institute Message ";
	 String emailBody = ":)";
	EmailSent( String senderPassword ,String receiverEmailID,String senderEmailID,String Subject,String Body)
	{ // Receiver Email Address
		this.senderEmailID=senderEmailID;
		this.receiverEmailID=receiverEmailID;
		this.senderPassword=senderPassword;
		// Subject
		this.emailSubject=Subject;
		// Body
		this.emailBody=Body;
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

	}
	public Boolean send(){
		
		Properties props = new Properties();
		props.put("mail.smtp.user",senderEmailID);
		props.put("mail.smtp.host", emailSMTPserver);
		props.put("mail.smtp.port", emailServerPort);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.port", emailServerPort);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		try{ 			
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);			
			msg.setText(emailBody);
			msg.setSubject(emailSubject);
			msg.setFrom(new InternetAddress(senderEmailID));
			msg.addRecipient(Message.RecipientType.TO,
					new InternetAddress(receiverEmailID));			
			Transport.send(msg);
			return true;
		} 
		catch(AuthenticationFailedException e)
		{
					JOptionPane.showMessageDialog(null, "Wrong User Name And Password ");		
		}
		catch (MessagingException e) 
		{
			
		}
		return false;
	}
	private class SMTPAuthenticator extends javax.mail.Authenticator
	{
		public PasswordAuthentication getPasswordAuthentication()
		{
			return new PasswordAuthentication(senderEmailID, senderPassword);
		}
	}
		
}
