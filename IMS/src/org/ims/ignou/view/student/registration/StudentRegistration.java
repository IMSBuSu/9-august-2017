package org.ims.ignou.view.student.registration;
/*
 * This is student view form where student provide lote of information.
 * this class extends Registration class.
 * this class also contain validation functions which check that some infomation are not filled by user.
 * all course coming from student table.
 * if user select course then faculty name filter from student table.
 * if faculty name select then batch start time and end time filter from student table.
 *  */
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.ims.ignou.dto.student.registration.CourseBatchDetailsDto;
import org.ims.ignou.helper.student.registration.BatchDetailSet;
import org.ims.ignou.helper.student.registration.ChkStudentEmailValid;
import org.ims.ignou.helper.student.registration.GetStuValueFrmRegistrationform;
import org.ims.ignou.helper.student.registration.InsertStudenthelper;
import org.ims.ignou.helper.student.registration.StudentInputvalidation;
import org.ims.ignou.view.extendable.Registration;
import javax.swing.JCheckBoxMenuItem;



public class StudentRegistration extends Registration 
{	
	private JPanel panel;
	private JTextField Sumbitted_fees;
	private JComboBox Course;
	private JComboBox<String> Faculty;
	private JComboBox Start_Day_course;
	private JComboBox Start_Month_course;
	private JComboBox Start_year_course;
	private JComboBox<String> Batch_timeing;
	private StudentRegistration frame;
	private JLabel lblCourseFees;
	private JLabel lblNewLabel;
	private JTextField textDuration;
	private JTextField textFees;
	private int employeeId;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public JTextField getTextFees() {
		return textFees;
	}
	public void setTextFees(String textFees) {
		this.textFees.setText(textFees);
	}
	public JTextField getTextDuration() {
		return textDuration;
	}
	public void setTextDuration(String textDuration) {
		this.textDuration.setText(textDuration+" "+"Month");
	}
	public JComboBox getBatch_timeing() {
		return Batch_timeing;
	}
	public void setBatch_timeing(DefaultComboBoxModel<String> batch_timeing) {
		Batch_timeing.setModel(batch_timeing);
	}
	public void setFaculty(DefaultComboBoxModel<String> faculty) {
		Faculty.setModel(faculty);
	}
	public JTextField getSumbitted_fees() {
		return Sumbitted_fees;
	}
	public JComboBox getCourse() {
		return Course;
	}
	public JComboBox getFaculty() {
		return Faculty;
	}
	public JComboBox getStart_Day_course() {
		return Start_Day_course;
	}
	public JComboBox getStart_Month_course() {
		return Start_Month_course;
	}
	public JComboBox getStart_year_course() {
		return Start_year_course;
	}
	public JComboBox getBatch_start_time() {
		return Batch_timeing;
	}


	private StudentInputvalidation inputvalidation;
public Boolean validation()
{		
	if(super.validation(super.frame))
	{
						if(inputvalidation.courseinformationvalidiation(this))
						{
												
										
							InsertStudenthelper insertStudenthelper=new InsertStudenthelper();
							insertStudenthelper.insertEmployee(this);
										return true;
						}
						
	}
	return false;
}


	public StudentRegistration(ArrayList<CourseBatchDetailsDto> course,ArrayList<CourseBatchDetailsDto> batchList) 
	{
		inputvalidation=new StudentInputvalidation();
		BatchDetailSet batchDetailSet=new BatchDetailSet();
		frame=this;
		btnSumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validation();
			}
		});	
		setTitle("New Student Registration");	
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Course Information ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 443, 758, 79);
		getContentPane().add(panel);
		
	
		Faculty = new JComboBox();
		Faculty.setModel(new DefaultComboBoxModel(new String[] {"Teacher"}));
		Faculty.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textDuration.setText("");
				textFees.setText("");
				batchDetailSet.setCourseFeesDuration(frame, Course.getSelectedItem().toString(), course);
			}
		});
	
		Faculty.setBounds(286, 46, 215, 20);
		panel.add(Faculty);
				
		Course = new JComboBox();
		Course.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Batch_timeing.setModel(new DefaultComboBoxModel<>(new String[]{"Batch Timeing"}));
				Faculty.setModel(new DefaultComboBoxModel<>(new String[]{"Teacher"}));
				textDuration.setText("");
				textFees.setText("");
				batchDetailSet.setBatchTimeing(Course.getSelectedItem().toString(),batchList,frame);
			}
		});

		Course.setBounds(20, 23, 186, 20);
		panel.add(Course);
		Course.setModel(batchDetailSet.setCourse(course));
		
		
		Start_Day_course = new JComboBox();
		Start_Day_course.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Start_Day_course.setBounds(102, 46, 44, 20);
		panel.add(Start_Day_course);
		
		Start_Month_course = new JComboBox();
		Start_Month_course.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		Start_Month_course.setBounds(151, 46, 55, 20);
		panel.add(Start_Month_course);
		
		Start_year_course = new JComboBox();
		Start_year_course.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		Start_year_course.setBounds(211, 46, 55, 20);
		panel.add(Start_year_course);
		
		Batch_timeing = new JComboBox();
		Batch_timeing.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Faculty.setModel(new DefaultComboBoxModel<>(new String[]{"Teacher"}));
				textDuration.setText("");
				textFees.setText("");
				batchDetailSet.setFaculty(Course.getSelectedItem().toString(), Batch_timeing.getSelectedItem().toString(), batchList, frame);
			}
		});
		Batch_timeing.setModel(new DefaultComboBoxModel(new String[] {"Batch Timeing"}));
		Batch_timeing.setBounds(302, 23, 183, 20);
		panel.add(Batch_timeing);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(10, 26, 6, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setBounds(276, 49, 12, 14);
		panel.add(label_4);
		
		JLabel lblBatchTimeing = new JLabel("Batch Timeing *");
		lblBatchTimeing.setBounds(219, 26, 88, 14);
		panel.add(lblBatchTimeing);
		
		JLabel label_6 = new JLabel("Starting  Date *");
		label_6.setBounds(10, 49, 82, 14);
		panel.add(label_6);
		
		JLabel label_1 = new JLabel("Submitted Fess *");
		label_1.setBounds(511, 49, 237, 14);
		panel.add(label_1);
		
		Sumbitted_fees = new JTextField();
		Sumbitted_fees.setBounds(603, 46, 145, 20);
		panel.add(Sumbitted_fees);
		Sumbitted_fees.setText("");
		Sumbitted_fees.setColumns(10);
		
		lblCourseFees = new JLabel("Total Fees");
		lblCourseFees.setBounds(618, 26, 55, 14);
		panel.add(lblCourseFees);
		
		lblNewLabel = new JLabel("Duration");
		lblNewLabel.setBounds(495, 26, 44, 14);
		panel.add(lblNewLabel);
		
		textDuration = new JTextField();
		textDuration.setEditable(false);
		textDuration.setEnabled(false);
		textDuration.setBounds(544, 23, 65, 20);
		panel.add(textDuration);
		textDuration.setColumns(10);
		
		textFees = new JTextField();
		textFees.setEnabled(false);
		textFees.setEditable(false);
		textFees.setBounds(672, 23, 76, 20);
		panel.add(textFees);
		textFees.setColumns(10);
		
	
	}
}
