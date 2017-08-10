package org.ims.ignou.view.extendable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ShowrEmpStuRecord extends JFrame {

	protected JPanel contentPane;
	protected JPanel panelPersonal_information;
	protected JTextField nametextField;
	protected JTextField textFieldfathername;
	protected JTextField textDob;
	protected JTextField textFieldGender;
	protected JTextField textFieldcategory;
	protected JTextField textMaritialstatus;
	protected JPanel panelContactinformation;
	protected JTextField textFieldContactnumber;
	protected JLabel labelContactnumber;
	protected JTextField textFieldEmailid;
	protected JTextArea textAreaAddress;
	protected JLabel lblEmailId;
	protected JLabel lblCountry;
	protected JTextField textFieldCountry;
	protected JPanel panelQualificationInforamtion;
	protected JTextField textField_Qualification10th;
	protected JTextField textFieldQualification12th;
	protected JTextField textFieldQualificationdiploma;
	protected JTextField textFieldQualificationUnder_graduate;
	protected JTextField textFieldQualificationcertification;
	protected JTextField textField_QualificationOther;
	protected JTextField textFieldQualificationPost_graducation;
	protected JTextField textField_Year10th;
	protected JTextField textField_Year12th;
	protected JTextField textField_Yeardiploma;
	protected JTextField textField_Yearcertification;
	protected JTextField textField_YearUnder_graduate;
	protected JTextField textField_Year_post_graduation;
	protected JTextField textField_Year_other;
	protected JTextField txFieldinstituationname_10th;
	protected JTextField textField_institutationname_12th;
	protected JTextField textFieldInstitutenamecertification;
	protected JTextField textFieldInstitutenamediploma;
	protected JTextField textFieldInstitutenameUnder_graduate;
	protected JTextField textFieldInstitutenamePost_graducation;
	protected JTextField textField_InstituteNameOther;
	protected JTextField textField_Percentage_10th;
	protected JTextField textField_Percentage_12th;
	protected JTextField textField_Percentage_Diploma;
	protected JTextField textField_Percentage_Certification;
	protected JTextField textField_Percentage_Undergraduate;
	protected JTextField textField_Percentage_postgraduate;
	protected JTextField textField_Percentage_Other;
	protected JTextField textField_grade_10th;
	protected JTextField textField_grade_12th;
	protected JTextField textField_grade_Diploma;
	protected JTextField textField_Grade_certification;
	protected JTextField textField_GradeUndergraduate;
	protected JTextField textField_GradePostUndergraduate;
	protected JTextField textField_GradeOther;
	protected JTextField textFieldCourseName_Other;
	protected JTextField textFieldCourseNamePostGraduate;
	protected JTextField textFieldCourseNameUndergraduate;
	protected JTextField textFieldCourseNameDiploma;
	protected JTextField textFieldCourseName_Certification;
	protected JTextField textFieldStream_12th;
	

	public ShowrEmpStuRecord() {
		
		
		  try
		    {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
			} 
		    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
		    	try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
				} 
		    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
							    	//theme not supported	
				}	    
		    	
			}
		setBackground(Color.ORANGE);
		setBounds(100, 100, 635, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 panelPersonal_information = new JPanel();
		panelPersonal_information.setBackground(Color.ORANGE);
		panelPersonal_information.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelPersonal_information.setBounds(0, 0, 619, 129);
		contentPane.add(panelPersonal_information);
		panelPersonal_information.setLayout(null);
		
		JLabel candidiatenamelbl = new JLabel("Name");
		candidiatenamelbl.setBounds(10, 21, 37, 14);
		panelPersonal_information.add(candidiatenamelbl);
		
		nametextField = new JTextField();
		nametextField.setEnabled(false);
		nametextField.setBounds(57, 18, 159, 20);
		panelPersonal_information.add(nametextField);
		nametextField.setColumns(10);
		
		textFieldfathername = new JTextField();
		textFieldfathername.setEnabled(false);
		textFieldfathername.setColumns(10);
		textFieldfathername.setBounds(310, 18, 159, 20);
		panelPersonal_information.add(textFieldfathername);
		
		JLabel Fathernamelbl = new JLabel("Father's Name");
		Fathernamelbl.setBounds(226, 21, 74, 14);
		panelPersonal_information.add(Fathernamelbl);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(10, 53, 30, 14);
		panelPersonal_information.add(lblDob);
		
		textDob = new JTextField();
		textDob.setEnabled(false);
		textDob.setBounds(36, 50, 86, 20);
		panelPersonal_information.add(textDob);
		textDob.setColumns(10);
		
		JLabel labelGender = new JLabel("Gender");
		labelGender.setBounds(132, 53, 37, 14);
		panelPersonal_information.add(labelGender);
		
		textFieldGender = new JTextField();
		textFieldGender.setEnabled(false);
		textFieldGender.setColumns(10);
		textFieldGender.setBounds(179, 50, 86, 20);
		panelPersonal_information.add(textFieldGender);
		
		JLabel labelCategory = new JLabel("Category");
		labelCategory.setBounds(274, 53, 52, 14);
		panelPersonal_information.add(labelCategory);
		
		textFieldcategory = new JTextField();
		textFieldcategory.setEnabled(false);
		textFieldcategory.setColumns(10);
		textFieldcategory.setBounds(336, 50, 86, 20);
		panelPersonal_information.add(textFieldcategory);
		
		textMaritialstatus = new JTextField();
		textMaritialstatus.setEnabled(false);
		textMaritialstatus.setColumns(10);
		textMaritialstatus.setBounds(94, 81, 86, 20);
		panelPersonal_information.add(textMaritialstatus);
		
		JLabel labelMaritialstatus = new JLabel("Maritial Status");
		labelMaritialstatus.setBounds(10, 85, 74, 14);
		panelPersonal_information.add(labelMaritialstatus);
		
		JLabel lblimage = new JLabel("");
		lblimage.setIcon(new ImageIcon("C:\\Users\\pro\\Pictures\\1.jpg"));
		lblimage.setBounds(523, 21, 119, 97);
		panelPersonal_information.add(lblimage);
		
		panelContactinformation = new JPanel();
		panelContactinformation.setLayout(null);
		panelContactinformation.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Contact Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelContactinformation.setBackground(Color.ORANGE);
		panelContactinformation.setBounds(0, 128, 619, 129);
		contentPane.add(panelContactinformation);
		
		textFieldContactnumber = new JTextField();
		textFieldContactnumber.setEnabled(false);
		textFieldContactnumber.setColumns(10);
		textFieldContactnumber.setBounds(510, 11, 129, 20);
		panelContactinformation.add(textFieldContactnumber);
		
		labelContactnumber = new JLabel("Contact Number");
		labelContactnumber.setBounds(414, 14, 86, 14);
		panelContactinformation.add(labelContactnumber);
		
		textFieldEmailid = new JTextField();
		textFieldEmailid.setEnabled(false);
		textFieldEmailid.setColumns(10);
		textFieldEmailid.setBounds(462, 42, 177, 20);
		panelContactinformation.add(textFieldEmailid);
		
		textAreaAddress = new JTextArea();
		textAreaAddress.setEditable(false);
		textAreaAddress.setText("Address");
		textAreaAddress.setBounds(10, 16, 394, 102);
		panelContactinformation.add(textAreaAddress);
		
		lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(414, 45, 46, 14);
		panelContactinformation.add(lblEmailId);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(414, 77, 46, 14);
		panelContactinformation.add(lblCountry);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setEnabled(false);
		textFieldCountry.setBounds(474, 74, 96, 20);
		panelContactinformation.add(textFieldCountry);
		textFieldCountry.setColumns(10);
		
		panelQualificationInforamtion = new JPanel();
		panelQualificationInforamtion.setLayout(null);
		panelQualificationInforamtion.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Qualification Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelQualificationInforamtion.setBackground(Color.ORANGE);
		panelQualificationInforamtion.setBounds(0, 258, 619, 201);
		contentPane.add(panelQualificationInforamtion);
		
		textField_Qualification10th = new JTextField();
		textField_Qualification10th.setEditable(false);
		textField_Qualification10th.setBounds(10, 21, 90, 20);
		panelQualificationInforamtion.add(textField_Qualification10th);
		textField_Qualification10th.setColumns(10);
		
		textFieldQualification12th = new JTextField();
		textFieldQualification12th.setEditable(false);
		textFieldQualification12th.setColumns(10);
		textFieldQualification12th.setBounds(10, 48, 90, 20);
		panelQualificationInforamtion.add(textFieldQualification12th);
		
		textFieldQualificationdiploma = new JTextField();
		textFieldQualificationdiploma.setEditable(false);
		textFieldQualificationdiploma.setColumns(10);
		textFieldQualificationdiploma.setBounds(10, 72, 90, 20);
		panelQualificationInforamtion.add(textFieldQualificationdiploma);
		
		textFieldQualificationUnder_graduate = new JTextField();
		textFieldQualificationUnder_graduate.setEditable(false);
		textFieldQualificationUnder_graduate.setColumns(10);
		textFieldQualificationUnder_graduate.setBounds(10, 121, 90, 20);
		panelQualificationInforamtion.add(textFieldQualificationUnder_graduate);
		
		textFieldQualificationcertification = new JTextField();
		textFieldQualificationcertification.setEditable(false);
		textFieldQualificationcertification.setColumns(10);
		textFieldQualificationcertification.setBounds(10, 97, 90, 20);
		panelQualificationInforamtion.add(textFieldQualificationcertification);
		
		textField_QualificationOther = new JTextField();
		textField_QualificationOther.setEditable(false);
		textField_QualificationOther.setColumns(10);
		textField_QualificationOther.setBounds(10, 168, 90, 20);
		panelQualificationInforamtion.add(textField_QualificationOther);
		
		textFieldQualificationPost_graducation = new JTextField();
		textFieldQualificationPost_graducation.setEditable(false);
		textFieldQualificationPost_graducation.setColumns(10);
		textFieldQualificationPost_graducation.setBounds(10, 144, 90, 20);
		panelQualificationInforamtion.add(textFieldQualificationPost_graducation);
		
		textField_Year10th = new JTextField();
		textField_Year10th.setEditable(false);
		textField_Year10th.setColumns(10);
		textField_Year10th.setBounds(110, 21, 37, 20);
		panelQualificationInforamtion.add(textField_Year10th);
		
		textField_Year12th = new JTextField();
		textField_Year12th.setEditable(false);
		textField_Year12th.setColumns(10);
		textField_Year12th.setBounds(110, 48, 37, 20);
		panelQualificationInforamtion.add(textField_Year12th);
		
		textField_Yeardiploma = new JTextField();
		textField_Yeardiploma.setEditable(false);
		textField_Yeardiploma.setColumns(10);
		textField_Yeardiploma.setBounds(110, 72, 37, 20);
		panelQualificationInforamtion.add(textField_Yeardiploma);
		
		textField_Yearcertification = new JTextField();
		textField_Yearcertification.setEditable(false);
		textField_Yearcertification.setColumns(10);
		textField_Yearcertification.setBounds(110, 97, 37, 20);
		panelQualificationInforamtion.add(textField_Yearcertification);
		
		textField_YearUnder_graduate = new JTextField();
		textField_YearUnder_graduate.setEditable(false);
		textField_YearUnder_graduate.setColumns(10);
		textField_YearUnder_graduate.setBounds(110, 121, 37, 20);
		panelQualificationInforamtion.add(textField_YearUnder_graduate);
		
		textField_Year_post_graduation = new JTextField();
		textField_Year_post_graduation.setEditable(false);
		textField_Year_post_graduation.setColumns(10);
		textField_Year_post_graduation.setBounds(110, 144, 37, 20);
		panelQualificationInforamtion.add(textField_Year_post_graduation);
		
		textField_Year_other = new JTextField();
		textField_Year_other.setEditable(false);
		textField_Year_other.setColumns(10);
		textField_Year_other.setBounds(110, 168, 37, 20);
		panelQualificationInforamtion.add(textField_Year_other);
		
		txFieldinstituationname_10th = new JTextField();
		txFieldinstituationname_10th.setEditable(false);
		txFieldinstituationname_10th.setColumns(10);
		txFieldinstituationname_10th.setBounds(157, 21, 262, 20);
		panelQualificationInforamtion.add(txFieldinstituationname_10th);
		
		textField_institutationname_12th = new JTextField();
		textField_institutationname_12th.setEditable(false);
		textField_institutationname_12th.setColumns(10);
		textField_institutationname_12th.setBounds(157, 48, 262, 20);
		panelQualificationInforamtion.add(textField_institutationname_12th);
		
		textFieldInstitutenamecertification = new JTextField();
		textFieldInstitutenamecertification.setEditable(false);
		textFieldInstitutenamecertification.setColumns(10);
		textFieldInstitutenamecertification.setBounds(157, 97, 262, 20);
		panelQualificationInforamtion.add(textFieldInstitutenamecertification);
		
		textFieldInstitutenamediploma = new JTextField();
		textFieldInstitutenamediploma.setEditable(false);
		textFieldInstitutenamediploma.setColumns(10);
		textFieldInstitutenamediploma.setBounds(157, 72, 262, 20);
		panelQualificationInforamtion.add(textFieldInstitutenamediploma);
		
		textFieldInstitutenameUnder_graduate = new JTextField();
		textFieldInstitutenameUnder_graduate.setEditable(false);
		textFieldInstitutenameUnder_graduate.setColumns(10);
		textFieldInstitutenameUnder_graduate.setBounds(157, 121, 262, 20);
		panelQualificationInforamtion.add(textFieldInstitutenameUnder_graduate);
		
		textFieldInstitutenamePost_graducation = new JTextField();
		textFieldInstitutenamePost_graducation.setEditable(false);
		textFieldInstitutenamePost_graducation.setColumns(10);
		textFieldInstitutenamePost_graducation.setBounds(157, 144, 262, 20);
		panelQualificationInforamtion.add(textFieldInstitutenamePost_graducation);
		
		textField_InstituteNameOther = new JTextField();
		textField_InstituteNameOther.setEditable(false);
		textField_InstituteNameOther.setColumns(10);
		textField_InstituteNameOther.setBounds(157, 168, 262, 20);
		panelQualificationInforamtion.add(textField_InstituteNameOther);
		
		textField_Percentage_10th = new JTextField();
		textField_Percentage_10th.setEnabled(false);
		textField_Percentage_10th.setColumns(10);
		textField_Percentage_10th.setBounds(429, 21, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_10th);
		
		textField_Percentage_12th = new JTextField();
		textField_Percentage_12th.setEnabled(false);
		textField_Percentage_12th.setColumns(10);
		textField_Percentage_12th.setBounds(429, 48, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_12th);
		
		textField_Percentage_Diploma = new JTextField();
		textField_Percentage_Diploma.setEnabled(false);
		textField_Percentage_Diploma.setColumns(10);
		textField_Percentage_Diploma.setBounds(429, 72, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_Diploma);
		
		textField_Percentage_Certification = new JTextField();
		textField_Percentage_Certification.setToolTipText("");
		textField_Percentage_Certification.setEnabled(false);
		textField_Percentage_Certification.setColumns(10);
		textField_Percentage_Certification.setBounds(429, 97, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_Certification);
		
		textField_Percentage_Undergraduate = new JTextField();
		textField_Percentage_Undergraduate.setEnabled(false);
		textField_Percentage_Undergraduate.setColumns(10);
		textField_Percentage_Undergraduate.setBounds(429, 121, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_Undergraduate);
		
		textField_Percentage_postgraduate = new JTextField();
		textField_Percentage_postgraduate.setEnabled(false);
		textField_Percentage_postgraduate.setColumns(10);
		textField_Percentage_postgraduate.setBounds(429, 144, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_postgraduate);
		
		textField_Percentage_Other = new JTextField();
		textField_Percentage_Other.setEnabled(false);
		textField_Percentage_Other.setColumns(10);
		textField_Percentage_Other.setBounds(429, 168, 43, 20);
		panelQualificationInforamtion.add(textField_Percentage_Other);
		
		textField_grade_10th = new JTextField();
		textField_grade_10th.setEnabled(false);
		textField_grade_10th.setColumns(10);
		textField_grade_10th.setBounds(482, 21, 23, 20);
		panelQualificationInforamtion.add(textField_grade_10th);
		
		textField_grade_12th = new JTextField();
		textField_grade_12th.setEnabled(false);
		textField_grade_12th.setColumns(10);
		textField_grade_12th.setBounds(482, 48, 23, 20);
		panelQualificationInforamtion.add(textField_grade_12th);
		
		textField_grade_Diploma = new JTextField();
		textField_grade_Diploma.setEnabled(false);
		textField_grade_Diploma.setColumns(10);
		textField_grade_Diploma.setBounds(482, 72, 23, 20);
		panelQualificationInforamtion.add(textField_grade_Diploma);
		
		textField_Grade_certification = new JTextField();
		textField_Grade_certification.setToolTipText("");
		textField_Grade_certification.setEnabled(false);
		textField_Grade_certification.setColumns(10);
		textField_Grade_certification.setBounds(482, 97, 23, 20);
		panelQualificationInforamtion.add(textField_Grade_certification);
		
		textField_GradeUndergraduate = new JTextField();
		textField_GradeUndergraduate.setEnabled(false);
		textField_GradeUndergraduate.setColumns(10);
		textField_GradeUndergraduate.setBounds(482, 121, 23, 20);
		panelQualificationInforamtion.add(textField_GradeUndergraduate);
		
		textField_GradePostUndergraduate = new JTextField();
		textField_GradePostUndergraduate.setEnabled(false);
		textField_GradePostUndergraduate.setColumns(10);
		textField_GradePostUndergraduate.setBounds(482, 144, 23, 20);
		panelQualificationInforamtion.add(textField_GradePostUndergraduate);
		
		textField_GradeOther = new JTextField();
		textField_GradeOther.setEnabled(false);
		textField_GradeOther.setColumns(10);
		textField_GradeOther.setBounds(482, 168, 23, 20);
		panelQualificationInforamtion.add(textField_GradeOther);
		
		textFieldCourseName_Other = new JTextField();
		textFieldCourseName_Other.setEditable(false);
		textFieldCourseName_Other.setBounds(515, 168, 119, 20);
		panelQualificationInforamtion.add(textFieldCourseName_Other);
		textFieldCourseName_Other.setColumns(10);
		
		textFieldCourseNamePostGraduate = new JTextField();
		textFieldCourseNamePostGraduate.setEditable(false);
		textFieldCourseNamePostGraduate.setColumns(10);
		textFieldCourseNamePostGraduate.setBounds(515, 144, 119, 20);
		panelQualificationInforamtion.add(textFieldCourseNamePostGraduate);
		
		textFieldCourseNameUndergraduate = new JTextField();
		textFieldCourseNameUndergraduate.setEditable(false);
		textFieldCourseNameUndergraduate.setColumns(10);
		textFieldCourseNameUndergraduate.setBounds(515, 121, 119, 20);
		panelQualificationInforamtion.add(textFieldCourseNameUndergraduate);
		
		textFieldCourseNameDiploma = new JTextField();
		textFieldCourseNameDiploma.setEditable(false);
		textFieldCourseNameDiploma.setColumns(10);
		textFieldCourseNameDiploma.setBounds(515, 97, 119, 20);
		panelQualificationInforamtion.add(textFieldCourseNameDiploma);
		
		textFieldCourseName_Certification = new JTextField();
		textFieldCourseName_Certification.setEditable(false);
		textFieldCourseName_Certification.setColumns(10);
		textFieldCourseName_Certification.setBounds(515, 72, 119, 20);
		panelQualificationInforamtion.add(textFieldCourseName_Certification);
		
		textFieldStream_12th = new JTextField();
		textFieldStream_12th.setEditable(false);
		textFieldStream_12th.setColumns(10);
		textFieldStream_12th.setBounds(515, 48, 119, 20);
		panelQualificationInforamtion.add(textFieldStream_12th);
		 
		
		
	}
}
