package org.ims.ignou.helper.employee.registration;

import org.ims.ignou.dto.employee.registration.Employeedto;
import org.ims.ignou.view.employee.registration.RegistrationeEmployee;

import oracle.net.aso.e;
import oracle.net.aso.f;

public class GetValueFrmRegistrationform {

	

		
		public Employeedto setPersonalInformation(RegistrationeEmployee frameReg){
			Employeedto employeeDetail=new Employeedto();
			employeeDetail.setEmployeeName(frameReg.getStudent_First_Name().getText()+" "+frameReg.getStudent_Middle_Name().getText()+" "+frameReg.getStudent_Last_Name().getText());
			employeeDetail.setFathersName(frameReg.getFather_First_Name().getText()+" "+frameReg.getFather_Middle_Name().getText()+" "+frameReg.getFather_Last_Name().getText());
			employeeDetail.setDob(((String)frameReg.getDaydob().getSelectedItem())+"/"+((String)frameReg.getMonthsdob().getSelectedItem())+"/"+((String)frameReg.getYeardob().getSelectedItem()));
			employeeDetail.setGenDer((String)frameReg.getGender().getSelectedItem());
			employeeDetail.setCateGory((String)frameReg.getCategory().getSelectedItem());
			employeeDetail.setMaritialStatus((String)frameReg.getMaritial_status().getSelectedItem());
			employeeDetail.setImagesPath(frameReg.getEmployeeImage().getSelectedFile().getAbsolutePath());
			return employeeDetail;
		}
	
		public Employeedto setContactInformation(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			empDetail.setContactNumber(frameReg.getContact_number().getText());
			empDetail.setEmailId(frameReg.getEmail_id().getText());
			empDetail.setState(frameReg.getStatee().getText());
			empDetail.setCounTry((String)frameReg.getCountry().getSelectedItem());
			empDetail.setZipcode(frameReg.getZipCode().getText());
			empDetail.setCity(frameReg.getCity().getText());
			empDetail.setAddRess(frameReg.getAddress().getText());
						
			return empDetail;
		}
		public Employeedto set10thQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail)
		{			
			
			if(frameReg.getComboBoxQualification10th().getSelectedItem().equals("10th")){
					empDetail.setYear10th(Integer.parseInt(frameReg.getYear10th().getText()));
					empDetail.setInstituteName10th(frameReg.getInstituation_name_10th().getText());
					empDetail.setPercentage10th(frameReg.getPercentage10th().getText());
					empDetail.setGrade10th((String) frameReg.getGrade10th().getSelectedItem());	
			}
			return empDetail;
		}
		public Employeedto set12thQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail)
		{
					
					if(frameReg.getComboBoxQualification12th().getSelectedItem().equals("12th")){
					empDetail.setYear12th(Integer.parseInt(frameReg.getYear12th().getText()));
					empDetail.setInstituteName12th(frameReg.getInstituation_name_12th().getText());
					empDetail.setPercentage12th(frameReg.getPercentage12th().getText());
					empDetail.setGrade12th((String)frameReg.getGrade12th().getSelectedItem());
					empDetail.setStream12th((String)frameReg.getStream12th().getSelectedItem());
					}
					return empDetail;
		}
		

		public Employeedto setCertificationQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getComboBoxQualificationcertification().getSelectedItem().equals("Certification")){
			empDetail.setYearCertification(Integer.parseInt(frameReg.getYearcertification().getText()));
			empDetail.setInstituteNameCertification(frameReg.getInstituation_name_Certification().getText());
			empDetail.setPercentageCertification(frameReg.getPercentagecertification().getText());
			empDetail.setGradeCertification((String)frameReg.getGradeCertificate().getSelectedItem());
			empDetail.setCoursenameCertification(frameReg.getCertificatation_course_name().getText());
			}			
			return empDetail;
			
		}
		
		public Employeedto setDiplomaQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getComboBoxQualificationdiploma().getSelectedItem().equals("Diploma")){
		
			empDetail.setYearDiploma(Integer.parseInt(frameReg.getYeardiploma().getText()));			
			empDetail.setInstituteNameDiploma(frameReg.getInstituation_name_Diploma().getText());
			empDetail.setPercentageDiploma(frameReg.getPercentageDiploma().getText());
			empDetail.setGradeDiploma((String)frameReg.getGradediploma().getSelectedItem());
			empDetail.setCoursenameDiploma(frameReg.getDiploma_course_name().getText());						
			}
				
			return empDetail;
		}
		

		public Employeedto setPostGraduateQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getComboBoxQualificationPost_graducation().getSelectedItem().equals("Post Graducation")){
			empDetail.setYearPostGraduate(Integer.parseInt(frameReg.getYear_post_graduation().getText()));			
			empDetail.setInstituteNamePostgraduate(frameReg.getInstituation_name_Post_graduate().getText());
			empDetail.setPercentagePostgraduate(frameReg.getPercentagepost_graduation().getText());
			empDetail.setGradePostgraduate((String)frameReg.getGradePost_graduate().getSelectedItem());
			empDetail.setCoursenamePostgraduate(frameReg.getPostGraduation_course_name().getText());		
			}			
			return empDetail;
		}
		public Employeedto setUnderGraduateQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			

			if(frameReg.getComboBoxQualificationUnder_graduate().getSelectedItem().equals("Under Graduation")){
			empDetail.setYearunderGraduate(Integer.parseInt(frameReg.getYearUnder_graduate().getText()));			
			empDetail.setInstituteNameUnderGraduate(frameReg.getInstituation_name_Under_graduate().getText());
			empDetail.setPercentageUnderGraduate(frameReg.getPercentageUndergraduate().getText());
			empDetail.setGradeUnderGraduate((String)frameReg.getGradeUnder_graduate().getSelectedItem());
			empDetail.setCoursenameUnderGraduate(frameReg.getUnderGraduation_course_name().getText());		
			}
			return empDetail;
		}	
		
		public Employeedto setOtherQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			
			if(frameReg.getComboBoxQualificationOther().getSelectedItem().equals("Other")){
					empDetail.setYearunderGraduate(Integer.parseInt(frameReg.getYearUnder_graduate().getText()));			
					empDetail.setInstituteNameUnderGraduate(frameReg.getInstituation_name_Under_graduate().getText());
					empDetail.setPercentageUnderGraduate(frameReg.getPercentageUndergraduate().getText());
					empDetail.setGradeUnderGraduate((String)frameReg.getGradeUnder_graduate().getSelectedItem());
					empDetail.setCoursenameUnderGraduate(frameReg.getUnderGraduation_course_name().getText());		
			}
			return empDetail;
		}	
		
		public Employeedto empCourseTeachingDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			 String subjectName[]=new String[7];
			 String batchTiming[]=new String[7];
			if(!((frameReg.getSelectcourse1().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse1().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[0]=(String)frameReg.getSelectcourse1().getSelectedItem();
				batchTiming[0]=(String)frameReg.getBatch_start_time1().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time1().getSelectedItem();
				System.out.println("Course 1 Selected : "+subjectName[0]);
				System.out.println("Batch 1 Timeing Selected : "+batchTiming[0]);				
			}
			
			return empDetail;
		}
		public Employeedto empJobDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getAreyoucmbox().getSelectedItem().equals("Other")){
						empDetail.setJobName(frameReg.getJobNametxtfieldother().getText());
						empDetail.setSalary(Integer.parseInt(frameReg.getSalarytextFieldother().getText()));
						empDetail.setJobTiming(((String)frameReg.getJobstarttimingcomboxBother().getSelectedItem())+" - "+((String)frameReg.getJobEndtimingcomboBoxfaculty().getSelectedItem()));						
			}
			if(frameReg.getAreyoucmbox().getSelectedItem().equals("Faculty")){
				empDetail.setJobName(frameReg.getJobNametxtfieldfaculty().getText());
				empDetail.setSalary(Integer.parseInt(frameReg.getSalarytextFieldfaculty().getText()));
				empDetail.setJobTiming(((String)frameReg.getJobstarttimingcomboBoxfaculty().getSelectedItem())+" - "+((String)frameReg.getJobEndtimingcomboBoxfaculty().getSelectedItem()));													
				empCourseTeachingDetail(frameReg,empDetail);			
			}
			
			return empDetail;			
		}

		public Employeedto setDetails(RegistrationeEmployee frameReg){
					Employeedto empDetail=setPersonalInformation(frameReg);
					empDetail=setContactInformation(frameReg, empDetail);
					empDetail=set10thQualificationDetail(frameReg, empDetail);
					empDetail=set12thQualificationDetail(frameReg, empDetail);	
					empDetail=setCertificationQualificationDetail(frameReg, empDetail);
					empDetail=setDiplomaQualificationDetail(frameReg, empDetail);
					empDetail=setPostGraduateQualificationDetail(frameReg, empDetail);
					empDetail=setUnderGraduateQualificationDetail(frameReg, empDetail);
					empDetail=setOtherQualificationDetail(frameReg, empDetail);
					empDetail=empJobDetail(frameReg,empDetail);
					
					return empDetail;
					
		}
	
	
}
