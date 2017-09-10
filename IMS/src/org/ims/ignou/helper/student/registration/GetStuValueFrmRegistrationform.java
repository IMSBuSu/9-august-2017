package org.ims.ignou.helper.student.registration;

import javax.mail.search.IntegerComparisonTerm;

import org.ims.ignou.dto.student.registration.StudentRegistrationDto;
import org.ims.ignou.view.student.registration.StudentRegistration;

public class GetStuValueFrmRegistrationform {

	private StudentRegistrationDto setPersonalInformation(StudentRegistration frameReg){
		StudentRegistrationDto employeeDetail=new StudentRegistrationDto();
		employeeDetail.setStudentName((frameReg.getStudent_First_Name().getText()+" "+frameReg.getStudent_Middle_Name().getText()+" "+frameReg.getStudent_Last_Name().getText()).toUpperCase());
		employeeDetail.setFathersName((frameReg.getFather_First_Name().getText()+" "+frameReg.getFather_Middle_Name().getText()+" "+frameReg.getFather_Last_Name().getText()).toUpperCase());
		employeeDetail.setDob((((String)frameReg.getDaydob().getSelectedItem())+"/"+((String)frameReg.getMonthsdob().getSelectedItem())+"/"+((String)frameReg.getYeardob().getSelectedItem())).toUpperCase());
		employeeDetail.setGenDer(((String)frameReg.getGender().getSelectedItem()).toUpperCase());
		employeeDetail.setCateGory(((String)frameReg.getCategory().getSelectedItem()).toUpperCase());
		employeeDetail.setMaritialStatus(((String)frameReg.getMaritial_status().getSelectedItem()).toUpperCase());
		employeeDetail.setStudentimagesPath((frameReg.getCandidateImage().getSelectedFile().getPath()).toUpperCase());
		return employeeDetail;
	}
	
	private StudentRegistrationDto setContactInformation(StudentRegistration frameReg,StudentRegistrationDto stuDetail){			
		stuDetail.setContactNumber(frameReg.getContact_number().getText().toUpperCase());
		stuDetail.setEmailId(frameReg.getEmail_id().getText().toUpperCase());
		stuDetail.setState(frameReg.getStatee().getText().toUpperCase());
		stuDetail.setCounTry(((String)frameReg.getCountry().getSelectedItem()).toUpperCase());
		stuDetail.setZipcode((Integer.parseInt(frameReg.getZipCode().getText())));
		stuDetail.setCity(frameReg.getCity().getText().toUpperCase());
		stuDetail.setAddRess(frameReg.getAddress().getText().toUpperCase());						
		return stuDetail;
	}
	private StudentRegistrationDto set10thQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail)
	{			
		
		if(frameReg.getComboBoxQualification10th().getSelectedItem().equals("10th")){
				stuDetail.setYear10th(Integer.parseInt(frameReg.getYear10th().getText()));
				stuDetail.setInstituteName10th(frameReg.getInstituation_name_10th().getText().toUpperCase());
				stuDetail.setPercentage10th(frameReg.getPercentage10th().getText());
					if(!frameReg.getGrade10th().getSelectedItem().equals("Select Grade")){
								stuDetail.setGrade10th((String) frameReg.getGrade10th().getSelectedItem());	
					}
		}
		return stuDetail;
	}
	private StudentRegistrationDto set12thQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail)
	{
				
				if(frameReg.getComboBoxQualification12th().getSelectedItem().equals("12th")){
				stuDetail.setYear12th(Integer.parseInt(frameReg.getYear12th().getText()));
				stuDetail.setInstituteName12th(frameReg.getInstituation_name_12th().getText().toUpperCase());
				stuDetail.setPercentage12th(frameReg.getPercentage12th().getText());
					if(!frameReg.getGrade12th().getSelectedItem().equals("Select Grade")){
						stuDetail.setGrade12th((String)frameReg.getGrade12th().getSelectedItem());
					}	
				stuDetail.setStream12th((String)frameReg.getStream12th().getSelectedItem());
				}
				return stuDetail;
	}
	

	private StudentRegistrationDto setCertificationQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail){
		
		if(frameReg.getComboBoxQualificationcertification().getSelectedItem().equals("Certification")){
		stuDetail.setYearCertification(Integer.parseInt(frameReg.getYearcertification().getText()));
		stuDetail.setInstituteNameCertification(frameReg.getInstituation_name_Certification().getText());
		stuDetail.setPercentageCertification(frameReg.getPercentagecertification().getText());
						if(!frameReg.getGradeCertificate().getSelectedItem().equals("Select Grade")){
							
									stuDetail.setGradeCertification((String)frameReg.getGradeCertificate().getSelectedItem());
							}
		stuDetail.setCoursenameCertification(frameReg.getCertificatation_course_name().getText().toUpperCase());
						
		}			
						
			
		return stuDetail;			
	}
		
	
	private StudentRegistrationDto setDiplomaQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail){
		
		if(frameReg.getComboBoxQualificationdiploma().getSelectedItem().equals("Diploma")){
	
		stuDetail.setYearDiploma(Integer.parseInt(frameReg.getYeardiploma().getText()));			
		stuDetail.setInstituteNameDiploma(frameReg.getInstituation_name_Diploma().getText().toUpperCase());
		stuDetail.setPercentageDiploma(frameReg.getPercentageDiploma().getText());
		
		if(!frameReg.getGradediploma().getSelectedItem().equals("Select Grade")){
			

						stuDetail.setGradeDiploma((String)frameReg.getGradediploma().getSelectedItem());
		
		}				
		stuDetail.setCoursenameDiploma(frameReg.getDiploma_course_name().getText().toUpperCase());						
		}
		
		return stuDetail;
	}
	

	private StudentRegistrationDto setPostGraduateQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail){
		
		if(frameReg.getComboBoxQualificationPost_graducation().getSelectedItem().equals("Post Graducation")){
		stuDetail.setYearPostGraduate(Integer.parseInt(frameReg.getYear_post_graduation().getText()));			
		stuDetail.setInstituteNamePostgraduate(frameReg.getInstituation_name_Post_graduate().getText().toUpperCase());
		stuDetail.setPercentagePostgraduate(frameReg.getPercentagepost_graduation().getText());
		if(!frameReg.getGradePost_graduate().getSelectedItem().equals("Select Grade")){
			
						stuDetail.setGradePostgraduate((String)frameReg.getGradePost_graduate().getSelectedItem());
		
		}				
		stuDetail.setCoursenamePostgraduate(frameReg.getPostGraduation_course_name().getText().toUpperCase());		
		}			
		return stuDetail;
	}
	private StudentRegistrationDto setUnderGraduateQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail){
		

		if(frameReg.getComboBoxQualificationUnder_graduate().getSelectedItem().equals("Under Graduation")){
		stuDetail.setYearunderGraduate(Integer.parseInt(frameReg.getYearUnder_graduate().getText()));			
		stuDetail.setInstituteNameUnderGraduate(frameReg.getInstituation_name_Under_graduate().getText().toUpperCase());
		stuDetail.setPercentageUnderGraduate(frameReg.getPercentageUndergraduate().getText());
		if(!frameReg.getGradeUnder_graduate().getSelectedItem().equals("Select Grade")){
			

		stuDetail.setGradeUnderGraduate((String)frameReg.getGradeUnder_graduate().getSelectedItem());
		}
		stuDetail.setCoursenameUnderGraduate(frameReg.getUnderGraduation_course_name().getText().toUpperCase());		
		}
		return stuDetail;
	}	
	
	private StudentRegistrationDto setOtherQualificationDetail(StudentRegistration frameReg,StudentRegistrationDto stuDetail){
		
		
		if(frameReg.getComboBoxQualificationOther().getSelectedItem().equals("Other")){
				stuDetail.setYearOther(Integer.parseInt(frameReg.getYear_other().getText()));			
				stuDetail.setInstituteNameOther(frameReg.getInstituation_name_other().getText().toUpperCase());
				stuDetail.setPercentageOther(frameReg.getPercentageother().getText());
				if(!frameReg.getGradeother().getSelectedItem().equals("Select Grade")){
					

				stuDetail.setGradeOther((String)frameReg.getGradeother().getSelectedItem());
				}
				stuDetail.setCoursenameOther(frameReg.getOther_course_name().getText().toUpperCase());		
		}
		return stuDetail;
	}	
	
	private StudentRegistrationDto setCourseInfromation(StudentRegistration frameReg,StudentRegistrationDto stuDetail){
	
			stuDetail.setCourseName(frameReg.getCourse().getSelectedItem().toString());
			stuDetail.setBatchTimeing(frameReg.getBatch_timeing().getSelectedItem().toString());
			stuDetail.setTeacherName(frameReg.getFaculty().getSelectedItem().toString());
			stuDetail.setCourseStartDate(frameReg.getStart_Day_course().getSelectedItem().toString()+"/"+frameReg.getStart_Month_course().getSelectedItem().toString()+"/"+frameReg.getStart_year_course().getSelectedItem().toString());;
			stuDetail.setReaminFees(Integer.toString(((Integer.parseInt(frameReg.getTextFees().getText().toString()))-(Integer.parseInt(frameReg.getSumbitted_fees().getText().toString())))));
			stuDetail.setTotalFees(frameReg.getTextFees().getText());
		
		
		return stuDetail;
	}
	public StudentRegistrationDto setDetails(StudentRegistration frameReg){
				StudentRegistrationDto stuDetail=setPersonalInformation(frameReg);
				stuDetail=setContactInformation(frameReg, stuDetail);
				stuDetail=set10thQualificationDetail(frameReg, stuDetail);
				stuDetail=set12thQualificationDetail(frameReg, stuDetail);	
				stuDetail=setCertificationQualificationDetail(frameReg, stuDetail);
				stuDetail=setDiplomaQualificationDetail(frameReg, stuDetail);
				stuDetail=setPostGraduateQualificationDetail(frameReg, stuDetail);
				stuDetail=setUnderGraduateQualificationDetail(frameReg, stuDetail);
				stuDetail=setOtherQualificationDetail(frameReg, stuDetail);
				stuDetail=setCourseInfromation(frameReg, stuDetail);
				System.out.println(stuDetail);
				return stuDetail;					
	}


}
