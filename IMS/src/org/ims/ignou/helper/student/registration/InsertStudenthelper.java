package org.ims.ignou.helper.student.registration;

import javax.swing.JOptionPane;

import org.ims.ignou.dao.student.registration.InsertStudent;
import org.ims.ignou.dto.student.registration.StudentRegistrationDto;
import org.ims.ignou.view.student.registration.StudentRegistration;

public class InsertStudenthelper {

	public  Boolean insertEmployee(StudentRegistration frame){
		
		GetStuValueFrmRegistrationform frmRegistrationform=new GetStuValueFrmRegistrationform();
		StudentRegistrationDto employeeDetail=frmRegistrationform.setDetails(frame);
		InsertStudent student=new InsertStudent(); //Database insertion
		if(student.insertStudentDetail(employeeDetail,frame)){									
							frame.setVisible(false);
							JOptionPane.showMessageDialog(frame, "Course Successfully Added. Student Id :- "+student.getStudentId());									
							return true;
							
		}else{
							frame.setVisible(false);
							JOptionPane.showMessageDialog(frame, "Unable to Add Employee ");
							return false;
		}
	
}

	
}
