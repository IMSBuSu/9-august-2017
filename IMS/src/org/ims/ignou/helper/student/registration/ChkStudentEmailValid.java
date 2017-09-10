package org.ims.ignou.helper.student.registration;

import org.ims.ignou.helper.extendable.EmailValidation;

public class ChkStudentEmailValid {

		public Boolean isValidemail(String email){
			EmailValidation emailValidation=new EmailValidation();
			return emailValidation.isValidEmailAddress(email);
		}
	
}
