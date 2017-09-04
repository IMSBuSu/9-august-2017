package org.ims.ignou.helper.employee.registration;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.employee.registration.InsertEmployee;
import org.ims.ignou.dto.employee.registration.Employeedto;
import org.ims.ignou.view.employee.registration.RegistrationeEmployee;

public class InsertEmployeehelper {
	
	
		public  Boolean insertEmployee(RegistrationeEmployee frame){
												
				GetValueFrmRegistrationform frmRegistrationform=new GetValueFrmRegistrationform();
				Employeedto employeeDetail=frmRegistrationform.setDetails(frame);
				InsertEmployee employee=new InsertEmployee(); //Database insertion
				if(employee.insertEmployeeDetail(employeeDetail)){									
									frame.setVisible(false);
									JOptionPane.showMessageDialog(frame, "Course Successfully Added !");
									return true;
									
				}else{
									frame.setVisible(false);
									JOptionPane.showMessageDialog(frame, "Unable to Add Employee ");
									return false;
				}
			
		}
	
			
}
