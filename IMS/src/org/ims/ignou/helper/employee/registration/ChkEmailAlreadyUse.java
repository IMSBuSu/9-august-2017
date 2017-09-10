package org.ims.ignou.helper.employee.registration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.ims.ignou.dao.employee.registration.ChkEmailExist;
import org.ims.ignou.dto.employee.registration.EmployeeRegsdto;

public class ChkEmailAlreadyUse {

	
		private ChkEmailExist chkEmailExist;
		private boolean ismailFound;
		private ArrayList<String> emailList=null;
		public ChkEmailAlreadyUse() {
			chkEmailExist=new ChkEmailExist();
			ismailFound=chkEmailExist.getEmail();
			if(ismailFound){

						emailList=chkEmailExist.getEmaillist();
			}	
					
					
		}
		public Boolean searchEmail(String mailId){
		
			
			
							if(emailList!=null){						
										for(String s:emailList){
											if(s.equals(mailId)){
												return true;				
											}
										}
									
								}
			
			return false;
		}
	
	
}
