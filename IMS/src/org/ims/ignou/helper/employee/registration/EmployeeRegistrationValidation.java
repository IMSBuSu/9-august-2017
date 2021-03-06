package org.ims.ignou.helper.employee.registration;

import javax.swing.JOptionPane;

import org.ims.ignou.view.employee.registration.RegistrationeEmployee;

public class EmployeeRegistrationValidation {

	
	
	public Boolean Facultyvalidation(RegistrationeEmployee regframe)
	{		
		if(regframe.getJobNametxtfieldfaculty().getText().equals(""))
		{
			JOptionPane.showMessageDialog(regframe, "Job Type Can not Blank");
			return false;
		}
		if(regframe.getJobstarttimingcomboBoxfaculty().getSelectedItem().equals("Start"))
		{
			JOptionPane.showMessageDialog(regframe, "Select Job Start Timing");
			return false;
		}
		if(regframe.getJobEndtimingcomboBoxfaculty().getSelectedItem().equals("End"))
		{
			JOptionPane.showMessageDialog(regframe, "Select Job End Timing");
			return false;			
		}
	
		if(regframe.getSalarytextFieldfaculty().getText().equals(""))
		{
			JOptionPane.showMessageDialog(regframe, "Salary Can not Blank.");
			return false;
		}
		try{
		Integer.parseInt(regframe.getSalarytextFieldfaculty().getText());
		}
		catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(regframe, "Only number allowed in salary !");
				return false;
		}
		if(regframe.getSelectcourse7().getSelectedItem().equals("Select course")||regframe.getSelectcourse7().getSelectedItem().equals("No course found"))
		{
			if(regframe.getSelectcourse7().getItemAt(1).equals("No course found"))
			{
				return true;
			}
			else
			{				
				JOptionPane.showMessageDialog(regframe, "Select Minimum One Course * ");	
				return false;
			}
		}

		if(regframe.getBatch_start_time7().getSelectedItem().equals("Start"))
		{
			JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
			return false;
		}
		if(regframe.getBatch_End_time7().getSelectedItem().equals("End"))
		{
			JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
			return false;
		}		


		if(!(regframe.getSelectcourse1().getSelectedItem().equals("Select course")))
		{
		
			if(regframe.getBatch_start_time1().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time1().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		if(!(regframe.getSelectcourse2().getSelectedItem().equals("Select course")))
		{
		
			if(regframe.getBatch_start_time2().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time2().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		
		
		if(!(regframe.getSelectcourse3().getSelectedItem().equals("Select course")))
		{
		
			if(regframe.getBatch_start_time3().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time3().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		
		if(!(regframe.getSelectcourse4().getSelectedItem().equals("Select course")))
		{
		
			if(regframe.getBatch_start_time4().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time4().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		
		if(!(regframe.getSelectcourse5().getSelectedItem().equals("Select course")))
		{
		
			if(regframe.getBatch_start_time5().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time5().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		if(!(regframe.getSelectcourse6().getSelectedItem().equals("Select course")))
		{
		
			if(regframe.getBatch_start_time6().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time6().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		
		if(!(regframe.getSelectcourse8().getSelectedItem().equals("Select course")))
		{			
			if(regframe.getBatch_start_time8().getSelectedItem().equals("Start"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch Start timing");			
				return false;
			}
			if(regframe.getBatch_End_time8().getSelectedItem().equals("End"))
			{
				JOptionPane.showMessageDialog(regframe, "Select Batch End timing");			
				return false;
			}		
		}

		
		return true;
		
		
		
	}
	
	
	public Boolean OtherEmpvalidation(RegistrationeEmployee regframe)
	{
		if(regframe.getJobNametxtfieldother().getText().equals(""))
		{
			JOptionPane.showMessageDialog(regframe, "Job Type Can not Blank");
			return false;
		}
		if(regframe.getJobstarttimingcomboxBother().getSelectedItem().equals("Start"))
		{
			JOptionPane.showMessageDialog(regframe, "Select Job Start Timing");
			return false;
		}
		if(regframe.getJobEndtimingcomboxother().getSelectedItem().equals("End"))
		{
			JOptionPane.showMessageDialog(regframe, "Select Job End Timing");
			return false;			
		}
		if(regframe.getSalarytextFieldother().getText().equals(""))
		{
			JOptionPane.showMessageDialog(regframe, "Salary Can not Blank.");
			return false;
		}
		try{
			Integer.parseInt(regframe.getSalarytextFieldother().getText());
			}
			catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(regframe, "Only number allowed in salary !");
					return false;
			}
		
		
		return true;
	}

	
	
}
