package org.ims.ignou.view.employee.find;

import org.ims.ignou.dto.employee.registration.Employeedto;
import org.ims.ignou.helper.employee.FatchDB;
import org.ims.ignou.view.extendable.ShowrEmpStuRecord;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class ShowRecord extends ShowrEmpStuRecord
{
	protected JPanel panelJobInformation;
	private JTextField textFieldJobType;
	private JTextField textFieldjobtimeing;
	private JTextField textFieldSalary;
	private JTextField textFieldSubject1;
	private JTextField textField_jobtiming1;
	private JTextField textFieldSubject5;
	private JTextField textField_jobtiming5;
	private JTextField textFieldSubject2;
	private JTextField textField_jobtiming2;
	private JTextField textFieldSubject6;
	private JTextField textField_jobtiming6;
	private JTextField textFieldSubject3;
	private JTextField textField_jobtiming3;
	private JTextField textFieldSubject7;
	private JTextField textField_jobtiming7;
	private JTextField textFieldSubject4;
	private JTextField textField_jobtiming4;
	private JTextField textField_16textFieldSubject8;
	private JTextField textField_jobtiming8;
	public void setPersonalInformation(ShowRecord record,Employeedto data){
		record.nametextField.setText(data.getEmployeeName());
		record.textFieldfathername.setText(data.getFathersName());
		record.textDob.setText(data.getDob());
		record.textFieldGender.setText(data.getGenDer());
		record.textFieldcategory.setText(data.getCateGory());
		record.textMaritialstatus.setText(data.getMaritialStatus());
	}
	public void setContactInformation(ShowRecord record,Employeedto data){
		record.textFieldContactnumber.setText(data.getContactNumber());	
		record.textFieldEmailid.setText(data.getEmailId());
		record.textAreaAddress.setText(data.getAddRess());
		record.textFieldCountry.setText(data.getCounTry());
	}

	public void setQualificationInformation10th(ShowRecord record,Employeedto data){
		record.textField_Qualification10th.setText("10th");
		record.textField_Year10th.setText(new Integer(data.getYear10th()).toString());
		record.txFieldinstituationname_10th.setText(data.getInstituteName10th());
		record.textField_Percentage_10th.setText(data.getPercentage10th());
		record.textField_grade_10th.setText(new Character(data.getGrade10th()).toString());	
	}
	public void setQualificationInformation12th(ShowRecord record,Employeedto data){
		record.textFieldQualification12th.setText("12th");
		record.textField_Year12th.setText(new Integer(data.getYear12th()).toString());
		record.textField_institutationname_12th.setText(data.getInstituteName12th());
		record.textField_Percentage_12th.setText(data.getPercentage12th());
		record.textField_grade_12th.setText(new Character(data.getGrade12th()).toString());
		record.textFieldStream_12th.setText(data.getStream12th());		
	}
	public void setQualificationInformationcertification(ShowRecord record,Employeedto data){
		record.textFieldQualificationcertification.setText("Certification");
		record.textField_Yearcertification.setText(new Integer(data.getYearCertification()).toString());
		record.textFieldInstitutenamecertification.setText(data.getInstituteNameCertification());
		record.textField_Percentage_Certification.setText(data.getPercentageCertification());
		record.textField_Grade_certification.setText(new Character(data.getGradeCertification()).toString());
		record.textFieldCourseName_Certification.setText(data.getCoursenameCertification());
	}
	public void setQualificationInformationDiploma(ShowRecord record,Employeedto data){
		record.textFieldQualificationdiploma.setText("Diploma");
		record.textField_Yeardiploma.setText(new Integer(data.getYearDiploma()).toString());
		record.textFieldInstitutenamediploma.setText(data.getInstituteNameDiploma());
		record.textField_Percentage_Diploma.setText(data.getPercentageDiploma());
		record.textField_grade_Diploma.setText(new Character(data.getGradeDiploma()).toString());
		record.textFieldCourseNameDiploma.setText(data.getCoursenameDiploma());
	}
	public void setQualificationInformationundergraduate(ShowRecord record,Employeedto data){
		record.textFieldQualificationUnder_graduate.setText("under graduate");
		record.textField_YearUnder_graduate.setText(new Integer(data.getYearunderGraduate()).toString());
		record.textFieldInstitutenameUnder_graduate.setText(data.getInstituteNameUnderGraduate());
		record.textField_Percentage_Undergraduate.setText(data.getPercentageUnderGraduate());
		record.textField_GradeUndergraduate.setText(new Character(data.getGradeUnderGraduate()).toString());	
		record.textFieldCourseNameUndergraduate.setText(data.getCoursenameUnderGraduate());	
	}
	public void setQualificationInformationpostgraduate(ShowRecord record,Employeedto data){
				record.textFieldQualificationPost_graducation.setText("Post Graduate");
				record.textField_Year_post_graduation.setText(new Integer(data.getYearPostGraduate()).toString());
				record.textFieldInstitutenamePost_graducation.setText(data.getInstituteNamePostgraduate());
				record.textField_Percentage_postgraduate.setText(data.getPercentagePostgraduate());
				record.textField_GradePostUndergraduate.setText(new Character(data.getGradePostgraduate()).toString());
				record.textFieldCourseNamePostGraduate.setText(data.getCoursenamePostgraduate());
	}
			
public void setQualificationinformationother(ShowRecord record,Employeedto data){
			record.textField_QualificationOther.setText("Other");
			record.textField_Year_other.setText(new Integer(data.getYearOther()).toString());		
			record.textField_InstituteNameOther.setText(data.getInstituteNameOther());
			record.textField_Percentage_Other.setText(data.getPercentageOther());
			record.textField_GradeOther.setText(new Character(data.getGradeOther()).toString());
			record.textFieldCourseName_Other.setText(data.getCoursenameOther());
		}
	
	
	
	
	public void setQualificationInformation(ShowRecord record,Employeedto data){
		setQualificationInformation10th(record,data);
		setQualificationInformation12th(record,data);
		setQualificationInformationcertification(record, data);
		setQualificationInformationDiploma(record, data);
		setQualificationInformationundergraduate(record,data);
		setQualificationInformationpostgraduate(record, data);
		setQualificationinformationother(record, data);		
	}
	
	public void setData(ShowRecord record,Employeedto data){	
			setPersonalInformation(record, data);
			setContactInformation(record, data);
			setQualificationInformation(record,data);		
	}
	public ShowRecord() 
	{
	
		setBounds(100, 100, 665, 673);
		setLocationRelativeTo(null);
		
		panelPersonal_information.setBounds(0, 0, 648, 129);
		panelContactinformation.setBounds(0, 128, 648, 129);
		panelQualificationInforamtion.setBounds(0, 258, 648, 201);
		panelJobInformation = new JPanel();
		panelJobInformation.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Faculty Job Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelJobInformation.setBackground(Color.ORANGE);
//		panelJobInformation.setBounds(0, 459, 649, 50); //when employee are not faculty
		panelJobInformation.setBounds(0, 459, 649, 175);

		getContentPane().add(panelJobInformation);
		panelJobInformation.setLayout(null);
		
		textFieldJobType = new JTextField();
		textFieldJobType.setBounds(72, 21, 215, 20);
		panelJobInformation.add(textFieldJobType);
		textFieldJobType.setEditable(false);
		textFieldJobType.setColumns(10);
		
				JLabel lblJobType = new JLabel("Job Name");
				lblJobType.setBounds(10, 24, 57, 14);
				panelJobInformation.add(lblJobType);
				
				JLabel lblJobtiming = new JLabel("Job Timing");
				lblJobtiming.setBounds(297, 24, 57, 14);
				panelJobInformation.add(lblJobtiming);
				
				textFieldjobtimeing = new JTextField();
				textFieldjobtimeing.setEditable(false);
				textFieldjobtimeing.setBounds(359, 21, 109, 20);
				panelJobInformation.add(textFieldjobtimeing);
				textFieldjobtimeing.setColumns(10);
				
				JLabel lblsalary = new JLabel("Salary");
				lblsalary.setBounds(478, 24, 42, 14);
				panelJobInformation.add(lblsalary);
				
				textFieldSalary = new JTextField();
				textFieldSalary.setEditable(false);
				textFieldSalary.setColumns(10);
				textFieldSalary.setBounds(530, 21, 109, 20);
				panelJobInformation.add(textFieldSalary);
				
				textFieldSubject1 = new JTextField();
				textFieldSubject1.setEditable(false);
				textFieldSubject1.setBounds(10, 52, 115, 20);
				panelJobInformation.add(textFieldSubject1);
				textFieldSubject1.setColumns(10);
				
				textField_jobtiming1 = new JTextField();
				textField_jobtiming1.setEditable(false);
				textField_jobtiming1.setColumns(10);
				textField_jobtiming1.setBounds(206, 52, 103, 20);
				panelJobInformation.add(textField_jobtiming1);
				
				JLabel lblBatchTiming1 = new JLabel("Batch Timing");
				lblBatchTiming1.setBounds(136, 55, 60, 14);
				panelJobInformation.add(lblBatchTiming1);
				
				JLabel lblBatchTiming5 = new JLabel("Batch Timing");
				lblBatchTiming5.setBounds(466, 55, 60, 14);
				panelJobInformation.add(lblBatchTiming5);
				
				textFieldSubject5 = new JTextField();
				textFieldSubject5.setEditable(false);
				textFieldSubject5.setColumns(10);
				textFieldSubject5.setBounds(340, 52, 115, 20);
				panelJobInformation.add(textFieldSubject5);
				
				textField_jobtiming5 = new JTextField();
				textField_jobtiming5.setEditable(false);
				textField_jobtiming5.setColumns(10);
				textField_jobtiming5.setBounds(536, 52, 103, 20);
				panelJobInformation.add(textField_jobtiming5);
				
				textFieldSubject2 = new JTextField();
				textFieldSubject2.setEditable(false);
				textFieldSubject2.setColumns(10);
				textFieldSubject2.setBounds(10, 80, 115, 20);
				panelJobInformation.add(textFieldSubject2);
				
				textField_jobtiming2 = new JTextField();
				textField_jobtiming2.setEditable(false);
				textField_jobtiming2.setColumns(10);
				textField_jobtiming2.setBounds(206, 80, 103, 20);
				panelJobInformation.add(textField_jobtiming2);
				
				JLabel lblBatchTiming2 = new JLabel("Batch Timing");
				lblBatchTiming2.setBounds(136, 83, 60, 14);
				panelJobInformation.add(lblBatchTiming2);
				
				textFieldSubject6 = new JTextField();
				textFieldSubject6.setEditable(false);
				textFieldSubject6.setColumns(10);
				textFieldSubject6.setBounds(340, 80, 115, 20);
				panelJobInformation.add(textFieldSubject6);
				
				JLabel lblBatchTiming6 = new JLabel("Batch Timing");
				lblBatchTiming6.setBounds(466, 83, 60, 14);
				panelJobInformation.add(lblBatchTiming6);
				
				textField_jobtiming6 = new JTextField();
				textField_jobtiming6.setEditable(false);
				textField_jobtiming6.setColumns(10);
				textField_jobtiming6.setBounds(536, 80, 103, 20);
				panelJobInformation.add(textField_jobtiming6);
				
				textFieldSubject3 = new JTextField();
				textFieldSubject3.setEditable(false);
				textFieldSubject3.setColumns(10);
				textFieldSubject3.setBounds(10, 105, 115, 20);
				panelJobInformation.add(textFieldSubject3);
				
				textField_jobtiming3 = new JTextField();
				textField_jobtiming3.setEditable(false);
				textField_jobtiming3.setColumns(10);
				textField_jobtiming3.setBounds(206, 105, 103, 20);
				panelJobInformation.add(textField_jobtiming3);
				
				JLabel lblBatchTiming3 = new JLabel("Batch Timing");
				lblBatchTiming3.setBounds(136, 108, 60, 14);
				panelJobInformation.add(lblBatchTiming3);
				
				textFieldSubject7 = new JTextField();
				textFieldSubject7.setEditable(false);
				textFieldSubject7.setColumns(10);
				textFieldSubject7.setBounds(340, 105, 115, 20);
				panelJobInformation.add(textFieldSubject7);
				
				JLabel lblBatchTiming7 = new JLabel("Batch Timing");
				lblBatchTiming7.setBounds(466, 108, 60, 14);
				panelJobInformation.add(lblBatchTiming7);
				
				textField_jobtiming7 = new JTextField();
				textField_jobtiming7.setEditable(false);
				textField_jobtiming7.setColumns(10);
				textField_jobtiming7.setBounds(536, 105, 103, 20);
				panelJobInformation.add(textField_jobtiming7);
				
				textFieldSubject4 = new JTextField();
				textFieldSubject4.setEditable(false);
				textFieldSubject4.setColumns(10);
				textFieldSubject4.setBounds(10, 132, 115, 20);
				panelJobInformation.add(textFieldSubject4);
				
				textField_jobtiming4 = new JTextField();
				textField_jobtiming4.setEditable(false);
				textField_jobtiming4.setColumns(10);
				textField_jobtiming4.setBounds(206, 132, 103, 20);
				panelJobInformation.add(textField_jobtiming4);
				
				JLabel lblBatchTiming4 = new JLabel("Batch Timing");
				lblBatchTiming4.setBounds(136, 135, 60, 14);
				panelJobInformation.add(lblBatchTiming4);
				
				textField_16textFieldSubject8 = new JTextField();
				textField_16textFieldSubject8.setEditable(false);
				textField_16textFieldSubject8.setColumns(10);
				textField_16textFieldSubject8.setBounds(340, 132, 115, 20);
				panelJobInformation.add(textField_16textFieldSubject8);
				
				JLabel lblBatchTiming8 = new JLabel("Batch Timing");
				lblBatchTiming8.setBounds(466, 135, 60, 14);
				panelJobInformation.add(lblBatchTiming8);
				
				
				textField_jobtiming8 = new JTextField();
				textField_jobtiming8.setEditable(false);
				textField_jobtiming8.setColumns(10);
				textField_jobtiming8.setBounds(536, 132, 103, 20);
				panelJobInformation.add(textField_jobtiming8);

	
	}
	
}
