package org.ims.ignou.helper.student.delete;

import org.ims.ignou.view.employee.delete.DeleteEmployeeSearchView;
import org.ims.ignou.view.employee.find.EmployeeSearchView;
import org.ims.ignou.view.student.delete.DeleteStudentSearchView;

public class StuDeleteViewValidation {

	private Boolean onlyNumberAllowed(DeleteStudentSearchView employee){
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
	public Boolean canNotblank(DeleteStudentSearchView employee){
			
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
