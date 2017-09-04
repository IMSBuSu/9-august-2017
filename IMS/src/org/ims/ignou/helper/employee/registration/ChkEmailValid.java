package org.ims.ignou.helper.employee.registration;

import org.ims.ignou.helper.extendable.EmailValidation;

public class ChkEmailValid  
{

			public Boolean checkMail(String email){
				EmailValidation emailValidation=new EmailValidation();
				return emailValidation.isValidEmailAddress(email);
			}
	
}
