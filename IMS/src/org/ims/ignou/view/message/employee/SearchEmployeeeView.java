package org.ims.ignou.view.message.employee;

import javax.swing.JOptionPane;

import org.ims.ignou.helper.employee.find.SearchEmployee;
import org.ims.ignou.helper.message.FetchSenderEmailId;
import org.ims.ignou.helper.student.find.StuFindValidation;
import org.ims.ignou.view.message.student.SendEmailViewStudent;
import org.ims.ignou.view.student.find.StudentSearchView;

public class SearchEmployeeeView extends StudentSearchView {

	StuFindValidation searchValidation=new StuFindValidation();


	
@Override
public void validation() 
{
	if(searchValidation.canNotblank(this))
	{
		int id=Integer.parseInt(txtStudentIFld.getText());
		SearchEmployee employee=new SearchEmployee();
		Boolean found=employee.chkIdDb(id);
		if(!found){
					JOptionPane.showMessageDialog(this, "Employee Not Found");
		}
		else{
			this.setVisible(false);
			System.out.println(employee.getEmployeeFinddto().getEmailId());
			 FetchSenderEmailId fetchemail = new FetchSenderEmailId();
			if(fetchemail.senderEmail()){
				new SendEmailViewStudent(fetchemail.getsenderPassword(),fetchemail.getReciverEmail(),employee.getEmployeeFinddto().getEmailId()).setVisible(true);
			}			
		}
	}
}
	
	
	public SearchEmployeeeView() {
		setTitle("Search Employee");
		lblEmployeeId.setText("Employee Id");
	}

}
