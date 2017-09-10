package org.ims.ignou.helper.student.find;

import org.ims.ignou.view.student.find.StudentSearchView;

public class StuFindValidation {

	private Boolean onlyNumberAllowed(StudentSearchView student){
				String id=student.getTxtStudentIFld().getText();
						try{

								Integer.parseInt(id); //checking only number allowed.
								student.setLblErrorMessage("");
								return true;	
						}catch (NumberFormatException e) {
							student.setLblErrorMessage("ONLY NUMBER ALLOWED !");
						}
				
				return false;		
			}
			public Boolean canNotblank(StudentSearchView student){
					
				String id=student.getTxtStudentIFld().getText();
						
						if(!id.trim().equals("")){
									
									if(onlyNumberAllowed(student)){
								
										return true;
								}
				
						}
						else{
							
									student.setLblErrorMessage("CAN NOT BE BLANK !");
							
						}
				return false;		
			}
			
}
