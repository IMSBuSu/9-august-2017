package org.ims.ignou.view.extendable;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Reg_Validation {
	
	
	
	public Boolean selectImage(Registration reg){
		if(reg.getCandidateImage()==null){
			reg.setCandidateImage(new JFileChooser());
			reg.getCandidateImage().setDialogTitle("Select Image");
			reg.getCandidateImage().showOpenDialog(null);
		}
		if(imagevalidation(reg)){
			return true;
		}
		return false;
	}
	
	
	
	
	public Boolean imagevalidation(Registration reg)
	{
		if(reg.getCandidateImage().getSelectedFile()!=null){					
							reg.setStudent_image(reg.getCandidateImage().getSelectedFile().toString());				
							ImageIcon icon=new ImageIcon(reg.getStudent_image());
							if((icon.getIconHeight()<=reg.getImage().getWidth()) && (icon.getIconWidth()<=reg.getImage().getWidth()))
								{	
				
										reg.getImage().setIcon(new ImageIcon(reg.getStudent_image()));
										reg.getImage().setText("");
										return true;		
								}
							else
							{
									JOptionPane.showMessageDialog(reg, "Image Too large. Your image Size : Height "+icon.getIconHeight()+" Width "+icon.getIconWidth()+"  But Required  Maximum Width : "+" 100 "+" Hight : "+"100");
							}
				}
		else
		{
					reg.getImage().setIcon(new ImageIcon(Registration.class.getResource("upload_image.png")));					
					JOptionPane.showMessageDialog(reg, "Image not Selected");
		}	
		reg.setCandidateImage(null);
		return false;
	}
	public Boolean personalInformationvalidation(Registration reg)

	{

		
			if(reg.getStudent_First_Name().getText().equals(""))
			{
				JOptionPane.showMessageDialog(reg, "Student First Name Can not be blank");
				return false;
			}
			
			if(reg.getFather_First_Name().getText().equals(""))
			{
				JOptionPane.showMessageDialog(reg, "Father's First Name Can not be blank");
				return false;
			}		
			
			if(reg.getDaydob().getSelectedItem().equals("Day"))		
			{
			
				JOptionPane.showMessageDialog(reg, "Birth Day Can not be blank");
				return false;
			}
			if(reg.getMonthsdob().getSelectedItem().equals("Month"))
			{
				JOptionPane.showMessageDialog(reg, "Birth Month Can not be blank");
				return false;
			}
			if(reg.getYeardob().getSelectedItem().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "Birth Year Can not be blank");
				return false;
			}
			if(reg.getGender().getSelectedItem().equals("Select Gender"))
			{
				JOptionPane.showMessageDialog(reg, "Gender Can not be blank");
				return false;
			}
			if(reg.getCategory().getSelectedItem().equals("Category"))
			{
				JOptionPane.showMessageDialog(reg, "Category Can not be blank");
				return false;
			}
			
			
			if(reg.getMaritial_status().getSelectedItem().equals("Maritial Status"))
			{
				JOptionPane.showMessageDialog(reg, "Maritial status Can not be blank");
				return false;
			}
			if(!(selectImage(reg))){
				return false;
			}
			return true;
	}
	public Boolean ContactInformationvalidation(Registration reg)
	{
		if(reg.getAddress().getText().equals("Address"))
		{
			JOptionPane.showMessageDialog(reg, "Address can not be blank");
			return false;
		}
		if(reg.getCity().getText().equals(""))
		{
			JOptionPane.showMessageDialog(reg, "City can not be blank");
			return false;
		}
		if(reg.getStatee().getText().equals(""))
		{
			JOptionPane.showMessageDialog(reg, "State can not be blank");
			return false;
		}
		if(reg.getCountry().getSelectedItem().equals("Country"))
		{
			JOptionPane.showMessageDialog(reg, "Country can not be blank");
			return false;
		}
		if(reg.getZipCode().getText().equals(""))
		{
			JOptionPane.showMessageDialog(reg, "ZipCode can not be blank");
			return false;
		}
		try{
			Integer.parseInt(reg.getZipCode().getText());
		}
		catch(NumberFormatException e){
			
			JOptionPane.showMessageDialog(reg, "Only Number Allowed in Zipcode !");
			return false;
		}
		
		if(reg.getContact_number().getText().equals(""))
		{
			JOptionPane.showMessageDialog(reg, "Contact number can not be blank");
			return false;
		}
		if(reg.getEmail_id().getText().equals("Email Id"))
		{
			JOptionPane.showMessageDialog(reg, "Email Id can not be blank");
			return false;
		}
		return true;
	}
	
	public boolean qualificationinformationvalidation(Registration reg)
	{
		if(!reg.getComboBoxQualification10th().getSelectedItem().equals("Select"))
		{
			if(reg.getYear10th().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "10th year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_10th().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "10th Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentage10th().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "10th Percentage cannot be balnk");
				return false;
			}
		}
		if(!reg.getComboBoxQualification12th().getSelectedItem().equals("Select"))
		{
			if(reg.getYear12th().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "12th year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_12th().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "12th Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentage12th().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "12th Percentage cannot be balnk");
				return false;
			}
			if(reg.getStream12th().getSelectedItem().equals("Select Stream"))
			{
				JOptionPane.showMessageDialog(reg, "12th  Stream  cannot be balnk");
				return false;
			}
		}
		if(!reg.getComboBoxQualificationdiploma().getSelectedItem().equals("Select"))
		{
			if(reg.getYeardiploma().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "Diploma year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_Diploma().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "Diploma Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentageDiploma().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "Diploma Percentage cannot be balnk");
				return false;
			}
			if(reg.getDiploma_course_name().getText().equals("Course Name"))
			{
				JOptionPane.showMessageDialog(reg, "Diploma  Course Name cannot be balnk");
				return false;
			}
			
		}
		
		if(!reg.getComboBoxQualificationcertification().getSelectedItem().equals("Select"))
		{
			if(reg.getYearcertification().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "Certification year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_Certification().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "Certification Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentagecertification().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "Certification Percentage cannot be balnk");
				return false;
			}
			if(reg.getCertificatation_course_name().getText().equals("Course Name"))
			{
				JOptionPane.showMessageDialog(reg, "Certification  Course Name cannot be balnk");
				return false;
			}
			
		}
		
		if(!reg.getComboBoxQualificationUnder_graduate().getSelectedItem().equals("Select"))
		{
			if(reg.getYearUnder_graduate().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "Under graduate year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_Under_graduate().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "Under graduate Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentageUndergraduate().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "Under graduate Percentage cannot be balnk");
				return false;
			}
			if(reg.getUnderGraduation_course_name().getText().equals("Course Name"))
			{
				JOptionPane.showMessageDialog(reg, "Under graduate  Course Name cannot be balnk");
				return false;
			}		
		}
		
		if(!reg.getComboBoxQualificationPost_graducation().getSelectedItem().equals("Select"))
		{
			if(reg.getYear_post_graduation().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "Post graduate year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_Post_graduate().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "Post graduate Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentagepost_graduation().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "Post graduate Percentage cannot be balnk");
				return false;
			}
			if(reg.getPostGraduation_course_name().getText().equals("Course Name"))
			{
				JOptionPane.showMessageDialog(reg, "Post graduate  Course Name cannot be balnk");
				return false;
			}		
		}
		if(!reg.getComboBoxQualificationOther().getSelectedItem().equals("Select"))
		{
			if(reg.getYear_other().getText().equals("Year"))
			{
				JOptionPane.showMessageDialog(reg, "Other  year cannot be balnk");
				return false;
			}
			if(reg.getInstituation_name_other().getText().equals("Instituation Name"))
			{
				JOptionPane.showMessageDialog(reg, "Other  Institute Name cannot be balnk");
				return false;
			}
			if(reg.getPercentageother().getText().equals("%"))
			{
				JOptionPane.showMessageDialog(reg, "Other  Percentage cannot be balnk");
				return false;
			}
			if(reg.getOther_course_name().getText().equals("Course Name"))
			{
				JOptionPane.showMessageDialog(reg, "Other   Course Name cannot be balnk");
				return false;
			}		
		}
		return true;
	}

	
	
	
}
