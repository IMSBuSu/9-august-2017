package org.ims.ignou.helper.employee.delete;

import org.ims.ignou.view.employee.delete.DeleteEmployeeSearchView;
import org.ims.ignou.view.employee.find.EmployeeSearchView;

public class EmpDeleteViewValidation {

	private Boolean onlyNumberAllowed(DeleteEmployeeSearchView employee){
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
	public Boolean canNotblank(DeleteEmployeeSearchView employee){
			
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
