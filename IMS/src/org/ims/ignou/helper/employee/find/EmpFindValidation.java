package org.ims.ignou.helper.employee.find;

import org.ims.ignou.view.employee.find.EmployeeSearchView;

public class EmpFindValidation {

	private Boolean onlyNumberAllowed(EmployeeSearchView employee){
				String id=employee.getTxtEmployeeIFld().getText();
						try{

								Integer.parseInt(id); //checking only number allowed.
								employee.setLblErrorMessage("");
								return true;	
						}catch (NumberFormatException e) {
							employee.setLblErrorMessage("ONLY NUMBER ALLOWED !");
						}
				
				return false;		
			}
			public Boolean canNotblank(EmployeeSearchView employee){
					
				String id=employee.getTxtEmployeeIFld().getText();
						
						if(!id.trim().equals("")){
									
										if(onlyNumberAllowed(employee)){
											
													return true;
										}
									
						}
						else{
							
									employee.setLblErrorMessage("CAN NOT BE BLANK !");
							
						}
				return false;		
			}
			
}
