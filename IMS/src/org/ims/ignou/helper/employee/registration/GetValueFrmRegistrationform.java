package org.ims.ignou.helper.employee.registration;

import org.ims.ignou.dto.employee.registration.Employeedto;
import org.ims.ignou.view.employee.registration.RegistrationeEmployee;

import oracle.net.aso.e;
import oracle.net.aso.f;

public class GetValueFrmRegistrationform {

	

		
		private Employeedto setPersonalInformation(RegistrationeEmployee frameReg){
			Employeedto employeeDetail=new Employeedto();
			employeeDetail.setEmployeeName((frameReg.getStudent_First_Name().getText()+" "+frameReg.getStudent_Middle_Name().getText()+" "+frameReg.getStudent_Last_Name().getText()).toUpperCase());
			employeeDetail.setFathersName((frameReg.getFather_First_Name().getText()+" "+frameReg.getFather_Middle_Name().getText()+" "+frameReg.getFather_Last_Name().getText()).toUpperCase());
			employeeDetail.setDob((((String)frameReg.getDaydob().getSelectedItem())+"/"+((String)frameReg.getMonthsdob().getSelectedItem())+"/"+((String)frameReg.getYeardob().getSelectedItem())).toUpperCase());
			employeeDetail.setGenDer(((String)frameReg.getGender().getSelectedItem()).toUpperCase());
			employeeDetail.setCateGory(((String)frameReg.getCategory().getSelectedItem()).toUpperCase());
			employeeDetail.setMaritialStatus(((String)frameReg.getMaritial_status().getSelectedItem()).toUpperCase());
			employeeDetail.setImagesPath((frameReg.getCandidateImage().getSelectedFile().getPath()).toUpperCase());
			return employeeDetail;
		}
		
		private Employeedto setContactInformation(RegistrationeEmployee frameReg,Employeedto empDetail){			
			empDetail.setContactNumber(frameReg.getContact_number().getText().toUpperCase());
			empDetail.setEmailId(frameReg.getEmail_id().getText().toUpperCase());
			empDetail.setState(frameReg.getStatee().getText().toUpperCase());
			empDetail.setCounTry(((String)frameReg.getCountry().getSelectedItem()).toUpperCase());
			empDetail.setZipcode((Integer.parseInt(frameReg.getZipCode().getText())));
			empDetail.setCity(frameReg.getCity().getText().toUpperCase());
			empDetail.setAddRess(frameReg.getAddress().getText().toUpperCase());						
			return empDetail;
		}
		private Employeedto set10thQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail)
		{			
			
			if(frameReg.getComboBoxQualification10th().getSelectedItem().equals("10th")){
					empDetail.setYear10th(Integer.parseInt(frameReg.getYear10th().getText()));
					empDetail.setInstituteName10th(frameReg.getInstituation_name_10th().getText().toUpperCase());
					empDetail.setPercentage10th(frameReg.getPercentage10th().getText());
						if(!frameReg.getGrade10th().getSelectedItem().equals("Select Grade")){
									empDetail.setGrade10th((String) frameReg.getGrade10th().getSelectedItem());	
						}
			}
			return empDetail;
		}
		private Employeedto set12thQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail)
		{
					
					if(frameReg.getComboBoxQualification12th().getSelectedItem().equals("12th")){
					empDetail.setYear12th(Integer.parseInt(frameReg.getYear12th().getText()));
					empDetail.setInstituteName12th(frameReg.getInstituation_name_12th().getText().toUpperCase());
					empDetail.setPercentage12th(frameReg.getPercentage12th().getText());
						if(!frameReg.getGrade12th().getSelectedItem().equals("Select Grade")){
							empDetail.setGrade12th((String)frameReg.getGrade12th().getSelectedItem());
						}	
					empDetail.setStream12th((String)frameReg.getStream12th().getSelectedItem());
					}
					return empDetail;
		}
		

		private Employeedto setCertificationQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getComboBoxQualificationcertification().getSelectedItem().equals("Certification")){
			empDetail.setYearCertification(Integer.parseInt(frameReg.getYearcertification().getText()));
			empDetail.setInstituteNameCertification(frameReg.getInstituation_name_Certification().getText());
			empDetail.setPercentageCertification(frameReg.getPercentagecertification().getText());
							if(!frameReg.getGradeCertificate().getSelectedItem().equals("Select Grade")){
								
										empDetail.setGradeCertification((String)frameReg.getGradeCertificate().getSelectedItem());
								}
			empDetail.setCoursenameCertification(frameReg.getCertificatation_course_name().getText().toUpperCase());
							
			}			
							
				
			return empDetail;			
		}
			
		
		private Employeedto setDiplomaQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getComboBoxQualificationdiploma().getSelectedItem().equals("Diploma")){
		
			empDetail.setYearDiploma(Integer.parseInt(frameReg.getYeardiploma().getText()));			
			empDetail.setInstituteNameDiploma(frameReg.getInstituation_name_Diploma().getText().toUpperCase());
			empDetail.setPercentageDiploma(frameReg.getPercentageDiploma().getText());
			
			if(!frameReg.getGradediploma().getSelectedItem().equals("Select Grade")){
				

							empDetail.setGradeDiploma((String)frameReg.getGradediploma().getSelectedItem());
			
			}				
			empDetail.setCoursenameDiploma(frameReg.getDiploma_course_name().getText().toUpperCase());						
			}
				
			return empDetail;
		}
		

		private Employeedto setPostGraduateQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getComboBoxQualificationPost_graducation().getSelectedItem().equals("Post Graducation")){
			empDetail.setYearPostGraduate(Integer.parseInt(frameReg.getYear_post_graduation().getText()));			
			empDetail.setInstituteNamePostgraduate(frameReg.getInstituation_name_Post_graduate().getText().toUpperCase());
			empDetail.setPercentagePostgraduate(frameReg.getPercentagepost_graduation().getText());
			if(!frameReg.getGradePost_graduate().getSelectedItem().equals("Select Grade")){
				
							empDetail.setGradePostgraduate((String)frameReg.getGradePost_graduate().getSelectedItem());
			
			}				
			empDetail.setCoursenamePostgraduate(frameReg.getPostGraduation_course_name().getText().toUpperCase());		
			}			
			return empDetail;
		}
		private Employeedto setUnderGraduateQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			

			if(frameReg.getComboBoxQualificationUnder_graduate().getSelectedItem().equals("Under Graduation")){
			empDetail.setYearunderGraduate(Integer.parseInt(frameReg.getYearUnder_graduate().getText()));			
			empDetail.setInstituteNameUnderGraduate(frameReg.getInstituation_name_Under_graduate().getText().toUpperCase());
			empDetail.setPercentageUnderGraduate(frameReg.getPercentageUndergraduate().getText());
			if(!frameReg.getGradeUnder_graduate().getSelectedItem().equals("Select Grade")){
				

			empDetail.setGradeUnderGraduate((String)frameReg.getGradeUnder_graduate().getSelectedItem());
			}
			empDetail.setCoursenameUnderGraduate(frameReg.getUnderGraduation_course_name().getText().toUpperCase());		
			}
			return empDetail;
		}	
		
		private Employeedto setOtherQualificationDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			
			if(frameReg.getComboBoxQualificationOther().getSelectedItem().equals("Other")){
					empDetail.setYearOther(Integer.parseInt(frameReg.getYear_other().getText()));			
					empDetail.setInstituteNameOther(frameReg.getInstituation_name_other().getText().toUpperCase());
					empDetail.setPercentageOther(frameReg.getPercentageother().getText());
					if(!frameReg.getGradeother().getSelectedItem().equals("Select Grade")){
						

					empDetail.setGradeOther((String)frameReg.getGradeother().getSelectedItem());
					}
					empDetail.setCoursenameOther(frameReg.getOther_course_name().getText().toUpperCase());		
			}
			return empDetail;
		}	
		
		private Employeedto empCourseTeachingDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			 String subjectName[]=new String[8];
			 String batchTiming[]=new String[8];
			if(!((frameReg.getSelectcourse1().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse1().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[0]=(String)frameReg.getSelectcourse1().getSelectedItem();
				batchTiming[0]=(String)frameReg.getBatch_start_time1().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time1().getSelectedItem();
			}
		
			if(!((frameReg.getSelectcourse2().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse2().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[1]=(String)frameReg.getSelectcourse2().getSelectedItem();
				batchTiming[1]=(String)frameReg.getBatch_start_time2().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time2().getSelectedItem();
			}
			
			if(!((frameReg.getSelectcourse3().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse3().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[2]=(String)frameReg.getSelectcourse3().getSelectedItem();
				batchTiming[2]=(String)frameReg.getBatch_start_time3().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time3().getSelectedItem();
			}
			
			

			if(!((frameReg.getSelectcourse4().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse4().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[3]=(String)frameReg.getSelectcourse4().getSelectedItem();
				batchTiming[3]=(String)frameReg.getBatch_start_time4().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time4().getSelectedItem();
			}


			if(!((frameReg.getSelectcourse5().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse5().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[4]=(String)frameReg.getSelectcourse5().getSelectedItem();
				batchTiming[4]=(String)frameReg.getBatch_start_time5().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time5().getSelectedItem();
			}
			
			if(!((frameReg.getSelectcourse6().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse6().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[5]=(String)frameReg.getSelectcourse6().getSelectedItem();
				batchTiming[5]=(String)frameReg.getBatch_start_time6().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time6().getSelectedItem();
			}

			if(!((frameReg.getSelectcourse7().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse7().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[6]=(String)frameReg.getSelectcourse7().getSelectedItem();
				batchTiming[6]=(String)frameReg.getBatch_start_time7().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time7().getSelectedItem();
			}

			if(!((frameReg.getSelectcourse8().getSelectedItem().equals("Select course"))  || (frameReg.getSelectcourse8().getSelectedItem().equals("No Course Found"))) ){				
				subjectName[7]=(String)frameReg.getSelectcourse8().getSelectedItem();
				batchTiming[7]=(String)frameReg.getBatch_start_time8().getSelectedItem()+" - "+(String)frameReg.getBatch_End_time8().getSelectedItem();
			}

			empDetail.setBatchTiming(batchTiming);
			empDetail.setSubjectName(subjectName);
			
			
			return empDetail;

		}
		private Employeedto empJobDetail(RegistrationeEmployee frameReg,Employeedto empDetail){
			
			if(frameReg.getAreyoucmbox().getSelectedItem().equals("Other")){
						empDetail.setJobName(frameReg.getJobNametxtfieldother().getText().toUpperCase());
						empDetail.setSalary(Integer.parseInt(frameReg.getSalarytextFieldother().getText()));
						empDetail.setJobTiming(((String)frameReg.getJobstarttimingcomboxBother().getSelectedItem())+" - "+((String)frameReg.getJobEndtimingcomboxother().getSelectedItem()));						
			}
			if(frameReg.getAreyoucmbox().getSelectedItem().equals("Faculty")){
				empDetail.setJobName(frameReg.getJobNametxtfieldfaculty().getText().toUpperCase());
				empDetail.setSalary(Integer.parseInt(frameReg.getSalarytextFieldfaculty().getText().trim()));
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
