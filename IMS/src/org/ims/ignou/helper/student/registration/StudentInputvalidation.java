package org.ims.ignou.helper.student.registration;

import javax.swing.JOptionPane;

import org.ims.ignou.view.student.registration.StudentRegistration;

public class StudentInputvalidation {
	private ChkStudentEmailValid chkStudentEmailValid=new ChkStudentEmailValid();
	public Boolean courseinformationvalidiation(StudentRegistration studentRegistration)
	{
		
		if(!(chkStudentEmailValid.isValidemail(studentRegistration.getEmail_id().getText()))){
		
				JOptionPane.showMessageDialog(studentRegistration, "Email id is not valid !");
				return false;
		}
		if(studentRegistration.getCourse().getSelectedItem().equals("Select Course"))
		{
		
				JOptionPane.showMessageDialog(studentRegistration, "Select Course Which you want to applied.");
				return false;
				
		}	
		if(studentRegistration.getBatch_timeing().getModel().getSize()>1){		
		if(studentRegistration.getBatch_timeing().getSelectedItem().equals("Batch Timeing")){
					JOptionPane.showMessageDialog(studentRegistration, "Select Batch Timeing");
					return false;
			}
		}
		if(studentRegistration.getFaculty().getModel().getSize()==1){
			JOptionPane.showMessageDialog(studentRegistration, "Please Register A faculty for the selected course");
			return false;
		}


		if(studentRegistration.getFaculty().getSelectedItem().equals("Teacher"))
		{
				JOptionPane.showMessageDialog(studentRegistration, "Select Faculty");
				return false;
		}

				
		if(studentRegistration.getStart_Day_course().getSelectedItem().equals("Day"))
		{		
			JOptionPane.showMessageDialog(studentRegistration, "Select Start Day ");
			return false;
		}
		if(studentRegistration.getStart_Month_course().getSelectedItem().equals("Month"))
		{		
			JOptionPane.showMessageDialog(studentRegistration, "Select Start Month ");
			return false;
		}
		if(studentRegistration.getStart_year_course().getSelectedItem().equals("Year"))
		{		
			JOptionPane.showMessageDialog(studentRegistration, "Select Start Year ");
			return false;
		}
		

		if(studentRegistration.getSumbitted_fees().getText().trim().equals(""))
		{	
			JOptionPane.showMessageDialog(studentRegistration, "Submit Fess  ");
			return false;
		}
		try{
			Integer.parseInt(studentRegistration.getSumbitted_fees().getText());
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(studentRegistration, "only number allowed in salary !");
			return false;
			// TODO: handle exception
		}
		
		return true;

		
		
	}

	
}
