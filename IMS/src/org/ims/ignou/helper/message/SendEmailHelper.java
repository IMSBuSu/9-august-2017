package org.ims.ignou.helper.message;

public class SendEmailHelper {

	
	
	public Boolean send(String reciver,String sender,String password,String message,String textSubject){
		
		
		EmailSent email=new EmailSent(password,reciver,sender,textSubject,message);
		CheckInternetConnection checkInternetConnection=new CheckInternetConnection();
		if(checkInternetConnection.checkinternet()){
			if(email.send()){
				return true;
			}
		}

		
		
		return false;
	}
	
	
	
	
	
}
