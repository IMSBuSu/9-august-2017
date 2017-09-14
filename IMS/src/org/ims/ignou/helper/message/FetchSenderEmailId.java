package org.ims.ignou.helper.message;

import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.ims.ignou.helper.extendable.EmailValidation;

public class FetchSenderEmailId 
{

	private String senderEmail;
	private String senderPassword;
	public String getsenderPassword(){
		return senderPassword;
	}
	public String getReciverEmail() {
		return senderEmail;
	}

	private static ResourceBundle databasebundle;
	static{
		databasebundle=ResourceBundle.getBundle("SenderEmail");
		
	}

	
	private static String getEmail(){
		return 	databasebundle.getString("senderEmailId");
		
	}

	private static String getPassword(){
		
		return databasebundle.getString("senderEmailPassword");
	}
	private  Boolean checkValied(String reciverEmail){
		
		EmailValidation name = new EmailValidation();
		if(name.isValidEmailAddress(reciverEmail)){
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "Sender email Id Not Valid");
			return false;
		}
		
	}
	
	public Boolean  senderEmail(){
			String senderEmail=getEmail();
			String senderPassword=getPassword();
			if(checkValied(senderEmail)){
				this.senderEmail=senderEmail;
				this.senderPassword=senderPassword;
				return true;
			}
			
			return false;
	}
	
	
	
}
