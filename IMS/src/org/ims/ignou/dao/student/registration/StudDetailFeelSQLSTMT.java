package org.ims.ignou.dao.student.registration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ims.ignou.dto.student.registration.StudentRegistrationDto;
import org.ims.ignou.view.extendable.Registration;

public class StudDetailFeelSQLSTMT {

	
	
	
	public PreparedStatement setQuflicationOther(Registration regFrame,PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){	
		try{
					pre.setString(1,(String) regFrame.getComboBoxQualificationOther().getSelectedItem());
					pre.setInt(2, employeedetail.getYearOther());
					pre.setString(3, employeedetail.getPercentageOther());
					pre.setString(4, employeedetail.getInstituteNameOther());
					pre.setString(5, employeedetail.getGradeOther());
					pre.setString(6, employeedetail.getCoursenameOther());
					pre.setInt(7, employeeeid);
		}
		catch (SQLException e) {

				e.printStackTrace();
		}

	return pre;
}
	
	
	public PreparedStatement setQuflicationUnderGraduate(Registration regFrame,PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){	
		try{
					pre.setString(1,(String) regFrame.getComboBoxQualificationUnder_graduate().getSelectedItem());
					pre.setInt(2, employeedetail.getYearunderGraduate());
					pre.setString(3, employeedetail.getPercentageUnderGraduate());
					pre.setString(4, employeedetail.getInstituteNameUnderGraduate());
					pre.setString(5, employeedetail.getGradeUnderGraduate());
					pre.setString(6, employeedetail.getCoursenameUnderGraduate());
					pre.setInt(7, employeeeid);
		}
		catch (SQLException e) {

				e.printStackTrace();
		}

	return pre;
}
	
	public PreparedStatement setQuflicationPostGraduate(Registration regFrame,PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){	
				try{
							pre.setString(1,(String) regFrame.getComboBoxQualificationPost_graducation().getSelectedItem());
							pre.setInt(2, employeedetail.getYearPostGraduate());
							pre.setString(3, employeedetail.getPercentagePostgraduate());
							pre.setString(4, employeedetail.getInstituteNamePostgraduate());
							pre.setString(5, employeedetail.getGradePostgraduate());
							pre.setString(6, employeedetail.getCoursenamePostgraduate());
							pre.setInt(7, employeeeid);
				}
				catch (SQLException e) {

						e.printStackTrace();
				}
	
			return pre;
	}


	
	public PreparedStatement setQuflicationDiploma(Registration regFrame,PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){	
				try{
							pre.setString(1,(String) regFrame.getComboBoxQualificationdiploma().getSelectedItem());
							pre.setInt(2, employeedetail.getYearDiploma());
							pre.setString(3, employeedetail.getPercentageDiploma());
							pre.setString(4, employeedetail.getInstituteNameDiploma());
							pre.setString(5, employeedetail.getGradeDiploma());
							pre.setString(6, employeedetail.getCoursenameDiploma());
							pre.setInt(7, employeeeid);
				}
				catch (SQLException e) {

						e.printStackTrace();
				}
	
			return pre;
	}


	public PreparedStatement setQuflicationCertification(Registration regFrame,PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){
		
		
			try {
				pre.setString(1, (String) regFrame.getComboBoxQualificationcertification().getSelectedItem());
				pre.setInt(2, employeedetail.getYearCertification());
				pre.setString(3, employeedetail.getPercentageCertification());
				pre.setString(4, employeedetail.getInstituteNameCertification());
				pre.setString(5, employeedetail.getGradeCertification());
				pre.setString(6, employeedetail.getCoursenameCertification());
				pre.setInt(7, employeeeid);
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return pre;
	}
	
	
	
	public PreparedStatement setQuflication12th(PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){
		try {
			pre.setInt(1,employeedetail.getYear12th());
			pre.setString(2, employeedetail.getPercentage12th());
			pre.setString(3, employeedetail.getInstituteName12th());
			pre.setString(4, employeedetail.getStream12th());
			pre.setString(5, employeedetail.getGrade12th());
			pre.setInt(6, employeeeid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return pre;
	}
	
	
	
	
	public PreparedStatement setQuflication10th(PreparedStatement pre,StudentRegistrationDto employeedetail,int employeeeid){
		try {
			pre.setInt(1,employeedetail.getYear10th());
			pre.setString(2, employeedetail.getInstituteName10th());
			pre.setString(3, employeedetail.getPercentage10th());
			pre.setInt(4, employeeeid);
			pre.setString(5, employeedetail.getGrade10th());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return pre;
	}

	public PreparedStatement  employeeId(PreparedStatement pre,StudentRegistrationDto stuDetail){
		try {
			pre.setString(1, stuDetail.getDob());
			pre.setString(2, stuDetail.getStudentName());
			pre.setString(3, stuDetail.getFathersName());
			pre.setString(4, stuDetail.getContactNumber());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;		
	}
	
	public PreparedStatement imagePath(PreparedStatement pre,int id)
	{
		
		try {
					pre.setString(1, (Integer.toString(id)+".JPG"));
					pre.setInt(2, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pre;
	}
	
	
	public PreparedStatement employee(PreparedStatement pre,StudentRegistrationDto empdetail)
	{
		
		try {
			pre.setInt(1, Integer.parseInt(empdetail.getTotalFees()));
			pre.setInt(2, Integer.parseInt(empdetail.getReaminFees()));
			pre.setString(3, empdetail.getDob());
			pre.setString(4, empdetail.getStudentName());
			pre.setString(5,empdetail.getFathersName());
			pre.setString(6,empdetail.getMaritialStatus());
			pre.setString(7,empdetail.getContactNumber());
			pre.setString(8,empdetail.getEmailId());
			pre.setString(9,empdetail.getCateGory());
			pre.setString(10,empdetail.getGenDer());
			pre.setString(11,empdetail.getAddRess());
			pre.setInt(12,empdetail.getZipcode());
			pre.setString(13,empdetail.getState());
			pre.setString(14,empdetail.getCity());
			pre.setString(15,empdetail.getCounTry());		
			pre.setString(16,empdetail.getTeacherName());
			pre.setString(17,empdetail.getCourseName());
			pre.setString(18, empdetail.getBatchTimeing());

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pre;
	}
	
	
}
