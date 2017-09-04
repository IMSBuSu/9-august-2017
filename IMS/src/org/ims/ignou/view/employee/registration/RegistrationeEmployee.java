package org.ims.ignou.view.employee.registration;
import java.awt.Color;
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

import org.ims.ignou.dao.employee.registration.InsertEmployee;
import org.ims.ignou.dto.employee.registration.Employeedto;
import org.ims.ignou.helper.employee.registration.ChkEmailAlreadyUse;
import org.ims.ignou.helper.employee.registration.ChkEmailValid;
import org.ims.ignou.helper.employee.registration.EmployeeRegistrationValidation;
import org.ims.ignou.helper.employee.registration.GetValueFrmRegistrationform;
import org.ims.ignou.helper.employee.registration.InsertEmployeehelper;
import org.ims.ignou.view.extendable.Registration;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegistrationeEmployee extends Registration
{	
		
	
	private RegistrationeEmployee frame;
	
	//two panel create employee(faculty and other) 
	//they both show or hide at  the time when Areyoucmbox change state.
	private	JPanel Jobinformationfaculty;
	private JPanel Jobinformationother;
	
	//listener working in Areyoucmbox.
	private JComboBox<String> Areyoucmbox;
	
	//Faculty emp variable 28 variable (7 variable are necessary.
	private JTextField jobNametxtfieldfaculty;
	private JTextField SalarytextFieldfaculty;
	private JComboBox<String> jobstarttimingcomboBoxfaculty;
	private JComboBox<String> jobEndtimingcomboBoxfaculty;	
	private JComboBox<String> Batch_start_time1;
	private	JComboBox<String> Batch_start_time2;
	private JComboBox<String> Batch_start_time3;
	private JComboBox<String> Batch_start_time4;
	private JComboBox<String> Batch_start_time5;
	private JComboBox<String> Batch_start_time6;
	private JComboBox<String> Batch_start_time7;
	private JComboBox<String> Batch_start_time8;
	private JComboBox<String> Batch_End_time1;
	private JComboBox<String> Batch_End_time2;
	private JComboBox<String> Batch_End_time3;
	private JComboBox<String> Batch_End_time4;
	private JComboBox<String> Batch_End_time5;
	private JComboBox<String> Batch_End_time6;
	private JComboBox<String> Batch_End_time7;
	private	JComboBox<String> Batch_End_time8;	
	private	JComboBox<String> selectcourse1;
	private	JComboBox<String> selectcourse2;
	private	JComboBox<String> selectcourse3;
	private	JComboBox<String> selectcourse4;
	private	JComboBox<String> selectcourse5;
	private	JComboBox<String> selectcourse6;
	private	JComboBox<String> selectcourse7;
	private	JComboBox<String> selectcourse8;
	private ChkEmailAlreadyUse email=null;
	
	

	//Other Emp Data : 4 variable
	private JTextField jobNametxtfieldother;
	private JTextField SalarytextFieldother;
	private JComboBox<String> jobEndtimingcomboxother;
	private JComboBox<String> jobstarttimingcomboxBother;
	
	
	
	//these both variable working 
	private ArrayList<String> allcourse;	//constructor intilize that variable.
	private  DefaultComboBoxModel<String> defaultComboBoxModel; //contains course.from all course.
	private EmployeeRegistrationValidation employeeRegistrationValidation;
	
	public RegistrationeEmployee getFrame() {
		return frame;
	}
	public void setFrame(RegistrationeEmployee frame) {
		this.frame = frame;
	}
	public JPanel getJobinformationfaculty() {
		return Jobinformationfaculty;
	}
	public void setJobinformationfaculty(JPanel jobinformationfaculty) {
		Jobinformationfaculty = jobinformationfaculty;
	}
	public JPanel getJobinformationother() {
		return Jobinformationother;
	}
	public void setJobinformationother(JPanel jobinformationother) {
		Jobinformationother = jobinformationother;
	}
	public JComboBox<String> getAreyoucmbox() {
		return Areyoucmbox;
	}
	public void setAreyoucmbox(JComboBox<String> areyoucmbox) {
		Areyoucmbox = areyoucmbox;
	}
	public JTextField getJobNametxtfieldfaculty() {
		return jobNametxtfieldfaculty;
	}
	public void setJobNametxtfieldfaculty(JTextField jobNametxtfieldfaculty) {
		this.jobNametxtfieldfaculty = jobNametxtfieldfaculty;
	}
	public JTextField getSalarytextFieldfaculty() {
		return SalarytextFieldfaculty;
	}
	public void setSalarytextFieldfaculty(JTextField salarytextFieldfaculty) {
		SalarytextFieldfaculty = salarytextFieldfaculty;
	}
	public JComboBox<String> getJobstarttimingcomboBoxfaculty() {
		return jobstarttimingcomboBoxfaculty;
	}
	public void setJobstarttimingcomboBoxfaculty(JComboBox<String> jobstarttimingcomboBoxfaculty) {
		this.jobstarttimingcomboBoxfaculty = jobstarttimingcomboBoxfaculty;
	}
	public JComboBox<String> getJobEndtimingcomboBoxfaculty() {
		return jobEndtimingcomboBoxfaculty;
	}
	public void setJobEndtimingcomboBoxfaculty(JComboBox<String> jobEndtimingcomboBoxfaculty) {
		this.jobEndtimingcomboBoxfaculty = jobEndtimingcomboBoxfaculty;
	}
	public JComboBox<String> getBatch_start_time1() {
		return Batch_start_time1;
	}
	public void setBatch_start_time1(JComboBox<String> batch_start_time1) {
		Batch_start_time1 = batch_start_time1;
	}
	public JComboBox<String> getBatch_start_time2() {
		return Batch_start_time2;
	}
	public void setBatch_start_time2(JComboBox<String> batch_start_time2) {
		Batch_start_time2 = batch_start_time2;
	}
	public JComboBox<String> getBatch_start_time3() {
		return Batch_start_time3;
	}
	public void setBatch_start_time3(JComboBox<String> batch_start_time3) {
		Batch_start_time3 = batch_start_time3;
	}
	public JComboBox<String> getBatch_start_time4() {
		return Batch_start_time4;
	}
	public void setBatch_start_time4(JComboBox<String> batch_start_time4) {
		Batch_start_time4 = batch_start_time4;
	}
	public JComboBox<String> getBatch_start_time5() {
		return Batch_start_time5;
	}
	public void setBatch_start_time5(JComboBox<String> batch_start_time5) {
		Batch_start_time5 = batch_start_time5;
	}
	public JComboBox<String> getBatch_start_time6() {
		return Batch_start_time6;
	}
	public void setBatch_start_time6(JComboBox<String> batch_start_time6) {
		Batch_start_time6 = batch_start_time6;
	}
	public JComboBox<String> getBatch_start_time7() {
		return Batch_start_time7;
	}
	public void setBatch_start_time7(JComboBox<String> batch_start_time7) {
		Batch_start_time7 = batch_start_time7;
	}
	public JComboBox<String> getBatch_start_time8() {
		return Batch_start_time8;
	}
	public void setBatch_start_time8(JComboBox<String> batch_start_time8) {
		Batch_start_time8 = batch_start_time8;
	}
	public JComboBox<String> getBatch_End_time1() {
		return Batch_End_time1;
	}
	public void setBatch_End_time1(JComboBox<String> batch_End_time1) {
		Batch_End_time1 = batch_End_time1;
	}
	public JComboBox<String> getBatch_End_time2() {
		return Batch_End_time2;
	}
	public void setBatch_End_time2(JComboBox<String> batch_End_time2) {
		Batch_End_time2 = batch_End_time2;
	}
	public JComboBox<String> getBatch_End_time3() {
		return Batch_End_time3;
	}
	public void setBatch_End_time3(JComboBox<String> batch_End_time3) {
		Batch_End_time3 = batch_End_time3;
	}
	public JComboBox<String> getBatch_End_time4() {
		return Batch_End_time4;
	}
	public void setBatch_End_time4(JComboBox<String> batch_End_time4) {
		Batch_End_time4 = batch_End_time4;
	}
	public JComboBox<String> getBatch_End_time5() {
		return Batch_End_time5;
	}
	public void setBatch_End_time5(JComboBox<String> batch_End_time5) {
		Batch_End_time5 = batch_End_time5;
	}
	public JComboBox<String> getBatch_End_time6() {
		return Batch_End_time6;
	}
	public void setBatch_End_time6(JComboBox<String> batch_End_time6) {
		Batch_End_time6 = batch_End_time6;
	}
	public JComboBox<String> getBatch_End_time7() {
		return Batch_End_time7;
	}
	public void setBatch_End_time7(JComboBox<String> batch_End_time7) {
		Batch_End_time7 = batch_End_time7;
	}
	public JComboBox<String> getBatch_End_time8() {
		return Batch_End_time8;
	}
	public void setBatch_End_time8(JComboBox<String> batch_End_time8) {
		Batch_End_time8 = batch_End_time8;
	}
	public JComboBox<String> getSelectcourse1() {
		return selectcourse1;
	}
	public void setSelectcourse1(JComboBox<String> selectcourse1) {
		this.selectcourse1 = selectcourse1;
	}
	public JComboBox<String> getSelectcourse2() {
		return selectcourse2;
	}
	public void setSelectcourse2(JComboBox<String> selectcourse2) {
		this.selectcourse2 = selectcourse2;
	}
	public JComboBox<String> getSelectcourse3() {
		return selectcourse3;
	}
	public void setSelectcourse3(JComboBox<String> selectcourse3) {
		this.selectcourse3 = selectcourse3;
	}
	public JComboBox<String> getSelectcourse4() {
		return selectcourse4;
	}
	public void setSelectcourse4(JComboBox<String> selectcourse4) {
		this.selectcourse4 = selectcourse4;
	}
	public JComboBox<String> getSelectcourse5() {
		return selectcourse5;
	}
	public void setSelectcourse5(JComboBox<String> selectcourse5) {
		this.selectcourse5 = selectcourse5;
	}
	public JComboBox<String> getSelectcourse6() {
		return selectcourse6;
	}
	public void setSelectcourse6(JComboBox<String> selectcourse6) {
		this.selectcourse6 = selectcourse6;
	}
	public JComboBox<String> getSelectcourse7() {
		return selectcourse7;
	}
	public void setSelectcourse7(JComboBox<String> selectcourse7) {
		this.selectcourse7 = selectcourse7;
	}
	public JComboBox<String> getSelectcourse8() {
		return selectcourse8;
	}
	public void setSelectcourse8(JComboBox<String> selectcourse8) {
		this.selectcourse8 = selectcourse8;
	}
	public JTextField getJobNametxtfieldother() {
		return jobNametxtfieldother;
	}
	public void setJobNametxtfieldother(JTextField jobNametxtfieldother) {
		this.jobNametxtfieldother = jobNametxtfieldother;
	}
	public JTextField getSalarytextFieldother() {
		return SalarytextFieldother;
	}
	public void setSalarytextFieldother(JTextField salarytextFieldother) {
		SalarytextFieldother = salarytextFieldother;
	}
	public JComboBox<String> getJobEndtimingcomboxother() {
		return jobEndtimingcomboxother;
	}
	public void setJobEndtimingcomboxother(JComboBox<String> jobEndtimingcomboxother) {
		this.jobEndtimingcomboxother = jobEndtimingcomboxother;
	}
	public JComboBox<String> getJobstarttimingcomboxBother() {
		return jobstarttimingcomboxBother;
	}
	public void setJobstarttimingcomboxBother(JComboBox<String> jobstarttimingcomboxBother) {
		this.jobstarttimingcomboxBother = jobstarttimingcomboxBother;
	}
	public ArrayList<String> getAllcourse() {
		return allcourse;
	}
	public void setAllcourse(ArrayList<String> allcourse) {
		this.allcourse = allcourse;
	}
	public DefaultComboBoxModel<String> getDefaultComboBoxModel() {
		return defaultComboBoxModel;
	}
	public void setDefaultComboBoxModel(DefaultComboBoxModel<String> defaultComboBoxModel) {
		this.defaultComboBoxModel = defaultComboBoxModel;
	}
	
	public Boolean validation(EmployeeRegistrationValidation registrationValidation)
	{
		if(super.validation(super.frame))
		{	
			if(Areyoucmbox.getSelectedItem().equals("Faculty"))
			{
							if(registrationValidation.Facultyvalidation(frame))
							{
									if(new ChkEmailValid().checkMail(frame.getEmail_id().getText())){
												if(!(email.searchEmail(email_id.getText().toUpperCase()))){
										        
													new InsertEmployeehelper().insertEmployee(frame);
												}	
												else{
														JOptionPane.showMessageDialog(this, "Email id already Exist");										
												}
									}
									else{
										JOptionPane.showMessageDialog(frame, "Use a Valid Email Address !");
										return false;
									}
							}				
			}
			else if(Areyoucmbox.getSelectedItem().equals("Other"))
			{
							if(registrationValidation.OtherEmpvalidation(frame)){
								     if(new ChkEmailValid().checkMail(frame.getEmail_id().getText())){
											
								    	 				if((!email.searchEmail(email_id.getText().toUpperCase()))){
												
								    	 								new InsertEmployeehelper().insertEmployee(frame);
								    	 				}		
								    	 				else{
								    	 						JOptionPane.showMessageDialog(this, "Email id already Exist");
								    	 				}
									}
									else{
												JOptionPane.showMessageDialog(frame, "Use a Valid Email Address !");
												return false;
									}
								
								
							}				
			}
			else 
			{
				JOptionPane.showMessageDialog(this, "Please Select Employee Type");
			}		
		}
		return false;		
	}	
	
	
	
	
private DefaultComboBoxModel<String> setcoursecomboboxmodel(ArrayList<String> allcourse)
{		
		defaultComboBoxModel=new DefaultComboBoxModel<>();	
		defaultComboBoxModel.addElement("Select course");		
		if(allcourse.size()==0)
		{
			defaultComboBoxModel.addElement("No Course Found");
		}
		else
		{			
			for(String course:allcourse)
		
			{			
				defaultComboBoxModel.addElement(course);
		
			}
		}
	
		return defaultComboBoxModel;
	}


@SuppressWarnings("deprecation")
	void otheremployee()
	{		
		Jobinformationfaculty.hide();		
		Jobinformationother.show();		
		setBounds(100, 100, 764, 592);
		btnSumbit.setBounds(258, 527, 89, 23);
  		Reset.setBounds(389, 527, 89, 23);
  		setLocationRelativeTo(null);
  		Backgroundimage.setBounds(0, 514, 758, 102);		
	}	
	void Faculty()
	{
			Jobinformationother.hide();
			Jobinformationfaculty.show();
			setBounds(100, 100, 764, 720); //frame size changed.
			setLocationRelativeTo(null);
			btnSumbit.setBounds(271, 660, 89, 23);
	  		Reset.setBounds(389, 660, 89, 23);
	  		Backgroundimage.setBounds(0, 648, 758, 67);
	}
	
	public RegistrationeEmployee(ArrayList<String> allcourse)
	{
		email=new ChkEmailAlreadyUse();
		employeeRegistrationValidation=new EmployeeRegistrationValidation();
		btnSumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
								validation(new EmployeeRegistrationValidation());
							
							
				
			}
		});
		this.allcourse=allcourse;		
		frame=this;
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setForeground(Color.ORANGE);
		setBounds(100, 100, 764, 493);
		setLocationRelativeTo(null);
		setTitle("New Employee Registration");	
		
		Jobinformationfaculty = new JPanel();
		Jobinformationfaculty.setLayout(null);
		Jobinformationfaculty.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Faculty Job Information ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		Jobinformationfaculty.setBackground(Color.ORANGE);
		Jobinformationfaculty.setBounds(0, 463, 758, 186);
		getContentPane().add(Jobinformationfaculty);
						
		btnSumbit.setBounds(258, 527, 89, 23);
  		Reset.setBounds(389, 527, 89, 23);
  		Backgroundimage.setBounds(0, 514, 758, 102);
  		
  		Areyoucmbox = new JComboBox<String>();
  		Areyoucmbox.addItemListener(new ItemListener(){
  			public void itemStateChanged(ItemEvent arg0) 
  			{ 				
  				if(Areyoucmbox.getSelectedItem().equals("Faculty"))
  				{  				
  					Faculty();
  				}
  				else if(Areyoucmbox.getSelectedItem().equals("Other"))
  				{
  					otheremployee();
  				}
  				else
  				{
  					setBounds(100, 100, 764, 493);
  					setLocationRelativeTo(null);
  				}
  			}
  		});
  	

	
  		Areyoucmbox.setModel(new DefaultComboBoxModel<String>(new String[] {"Registraton For", "Faculty", "Other"}));
  		Areyoucmbox.setBounds(0, 444, 122, 20);
  		getContentPane().add(Areyoucmbox);
  		

  		 JLabel lbljobtiming;
  	 JLabel Salartlbl;
  		 JLabel jobtypelblNewLabel;
  		 JLabel jobtypellblNewLabel;
  		 JLabel label_5;
  		 JLabel SalarylblNewLabel;
  			JLabel lblBatchTiming_3;
  	 JLabel jobTiminglblNewLabel;

  		 	JLabel lblBatchTiming;	
  		 	JLabel lblBatchTiming_1;
  		 	JLabel lblBatchTiming_2;
  		 	JLabel lblBatchTiming_4;
  		 	JLabel lblBatchTiming_5;
  		 	JLabel lblBatchTiming_6;  		
  			Jobinformationother = new JPanel();
  			Jobinformationother.setBounds(0, 463, 758, 53);
  			getContentPane().add(Jobinformationother);
  			Jobinformationother.setBackground(Color.ORANGE);
  			Jobinformationother.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Job information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
  			Jobinformationother.setLayout(null);
  			
  			jobtypellblNewLabel = new JLabel("Job Type *");
  			jobNametxtfieldfaculty = new JTextField();
  			jobNametxtfieldfaculty.setText("");
  			jobTiminglblNewLabel = new JLabel("Job Timing *");
  			jobEndtimingcomboBoxfaculty = new JComboBox<String>();
  			jobstarttimingcomboBoxfaculty = new JComboBox<String>();
  			SalarylblNewLabel = new JLabel("Salary *");
  			SalarytextFieldfaculty = new JTextField();
  			SalarytextFieldfaculty.setText("");
  			
  			
  
  		
  		
  		
  			lblBatchTiming_2 = new JLabel("Batch timing");
			Batch_start_time3 = new JComboBox<>();
			Batch_End_time3 = new JComboBox<>();
			selectcourse4 = new JComboBox<>();
			lblBatchTiming_4 = new JLabel("Batch timing");
			Batch_start_time4 = new JComboBox<>();
			Batch_End_time4 = new JComboBox<>();
			selectcourse5 = new JComboBox<>();
			lblBatchTiming_5 = new JLabel("Batch timing");
			Batch_start_time5 = new JComboBox<>();
			Batch_End_time5 = new JComboBox<>();
			selectcourse6 = new JComboBox<>();
			lblBatchTiming_6 = new JLabel("Batch timing");
			Batch_start_time6 = new JComboBox<>();
			Batch_End_time6 = new JComboBox<>();
			label_5 = new JLabel("Batch timing *");
			selectcourse7 = new JComboBox<>();
			Batch_start_time7 = new JComboBox<>();			
			Batch_End_time7 = new JComboBox<>();
			lblBatchTiming_3 = new JLabel("Batch timing");
			selectcourse8 = new JComboBox<>();
			Batch_start_time8 = new JComboBox<>();
			Batch_End_time8 = new JComboBox<>();	
			Batch_start_time1 = new JComboBox<>();
			Batch_End_time1 = new JComboBox<>();
			lblBatchTiming = new JLabel("Batch timing");
			selectcourse1 = new JComboBox<>();
			selectcourse2 = new JComboBox<>();
			lblBatchTiming_1 = new JLabel("Batch timing ");
			Batch_start_time2 = new JComboBox<>();
			Batch_End_time2 = new JComboBox<>();
			selectcourse3 = new JComboBox<>();

			jobEndtimingcomboxother = new JComboBox<>();
			jobstarttimingcomboxBother = new JComboBox<>();
			 lbljobtiming = new JLabel("Job Timing *");		
			Salartlbl	= new JLabel("Salary *");	
			jobNametxtfieldother = new JTextField();
			jobNametxtfieldother.setText("");
			SalarytextFieldother = new JTextField();
			
			
			jobtypelblNewLabel = new JLabel("Job Type *");			
	  		jobTiminglblNewLabel.setBounds(290, 28, 66, 14);
			Jobinformationfaculty.add(jobTiminglblNewLabel);
			
			jobtypellblNewLabel.setBounds(10, 28, 60, 14);			
			Jobinformationfaculty.add(jobtypellblNewLabel);			
			jobNametxtfieldfaculty.setBounds(91, 25, 186, 20);
			Jobinformationfaculty.add(jobNametxtfieldfaculty);
			jobNametxtfieldfaculty.setColumns(10);
			jobEndtimingcomboBoxfaculty.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			jobEndtimingcomboBoxfaculty.setBounds(452, 25, 60, 20);
			Jobinformationfaculty.add(jobEndtimingcomboBoxfaculty);
			jobstarttimingcomboBoxfaculty.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			jobstarttimingcomboBoxfaculty.setBounds(366, 25, 66, 20);
			Jobinformationfaculty.add(jobstarttimingcomboBoxfaculty);
			SalarylblNewLabel.setBounds(536, 28, 46, 14);
			Jobinformationfaculty.add(SalarylblNewLabel); 			
			
			SalarytextFieldfaculty.setBounds(605, 25, 123, 20);
			Jobinformationfaculty.add(SalarytextFieldfaculty);
			SalarytextFieldfaculty.setColumns(10);

			lblBatchTiming.setBounds(152, 160, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming);		
			
			selectcourse1.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse1.setBounds(10, 96, 123, 20);
			Jobinformationfaculty.add(selectcourse1);
			
			selectcourse2.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse2.setBounds(10, 124, 123, 20);
			Jobinformationfaculty.add(selectcourse2);
			
			lblBatchTiming_1.setBounds(152, 100, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_1);
			
			Batch_start_time2.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time2.setBounds(239, 126, 57, 20);
			Jobinformationfaculty.add(Batch_start_time2);
			
			Batch_End_time2.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time2.setBounds(318, 124, 57, 20);
			Jobinformationfaculty.add(Batch_End_time2);
			
			selectcourse3.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse3.setBounds(10, 155, 123, 20);
			Jobinformationfaculty.add(selectcourse3);
			
			lblBatchTiming_2.setBounds(152, 131, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_2);
			
			Batch_start_time3.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time3.setBounds(239, 157, 57, 20);
			Jobinformationfaculty.add(Batch_start_time3);
			
			Batch_End_time3.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time3.setBounds(318, 157, 57, 20);
			Jobinformationfaculty.add(Batch_End_time3);
			
			selectcourse4.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse4.setBounds(385, 96, 128, 20);
			Jobinformationfaculty.add(selectcourse4);
			lblBatchTiming_4.setBounds(525, 99, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_4);
		
			Batch_start_time4.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time4.setBounds(612, 96, 57, 20);
			Jobinformationfaculty.add(Batch_start_time4);
			
			Batch_End_time4.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time4.setBounds(691, 96, 57, 20);
			Jobinformationfaculty.add(Batch_End_time4);
			
			selectcourse5.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse5.setBounds(385, 124, 128, 20);
			Jobinformationfaculty.add(selectcourse5);
			

			
			lblBatchTiming_5.setBounds(525, 127, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_5);
			
			Batch_start_time5.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time5.setBounds(612, 124, 57, 20);
			Jobinformationfaculty.add(Batch_start_time5);
			

			
			Batch_End_time5.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time5.setBounds(691, 124, 57, 20);
			Jobinformationfaculty.add(Batch_End_time5);
			

			
			selectcourse6.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse6.setBounds(385, 155, 128, 20);
			Jobinformationfaculty.add(selectcourse6);
			
		 
			lblBatchTiming_6.setBounds(525, 158, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_6);
			

			Batch_start_time6.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time6.setBounds(612, 155, 57, 20);
			Jobinformationfaculty.add(Batch_start_time6);

			
			Batch_End_time6.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time6.setBounds(691, 155, 57, 20);
			Jobinformationfaculty.add(Batch_End_time6);
			

			label_5.setBounds(152, 75, 77, 14);
			Jobinformationfaculty.add(label_5);
			
			selectcourse7.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse7.setBounds(10, 67, 123, 20);
			Jobinformationfaculty.add(selectcourse7);
			

			
			Batch_start_time7.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time7.setBounds(239, 67, 57, 20);
			Jobinformationfaculty.add(Batch_start_time7);
			
			Batch_End_time7.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time7.setBounds(318, 67, 57, 20);
			Jobinformationfaculty.add(Batch_End_time7);
			
		
			lblBatchTiming_3.setBounds(525, 71, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_3);
			
		
			
			selectcourse8.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse8.setBounds(385, 65, 128, 20);
			Jobinformationfaculty.add(selectcourse8);
			
		
			Batch_start_time8.setModel(new DefaultComboBoxModel<>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time8.setBounds(612, 68, 57, 20);
			Jobinformationfaculty.add(Batch_start_time8);
			
			
			
			Batch_End_time8.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time8.setBounds(691, 68, 57, 20);
			Jobinformationfaculty.add(Batch_End_time8);
			
		
				Batch_start_time1.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Batch_start_time1.setBounds(239, 98, 57, 20);
				Jobinformationfaculty.add(Batch_start_time1);
				
				Batch_End_time1.setModel(new DefaultComboBoxModel<>(new String[] {"End","6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Batch_End_time1.setBounds(318, 98, 57, 20);
				Jobinformationfaculty.add(Batch_End_time1);
				
				
				jobNametxtfieldother.setBounds(95, 24, 166, 20);
				SalarytextFieldother.setBounds(640, 24, 86, 20);
				Salartlbl.setBounds(555, 27, 46, 14);
				lbljobtiming.setBounds(283, 27, 60, 14);
				jobstarttimingcomboxBother.setBounds(367, 24, 69, 20);
				jobEndtimingcomboxother.setBounds(456, 24, 69, 20);
				jobtypelblNewLabel.setBounds(10, 27, 60, 14);


				Jobinformationother.add(jobNametxtfieldother);
				jobNametxtfieldother.setColumns(10);

				Jobinformationother.add(Salartlbl);
				
				Jobinformationother.add(SalarytextFieldother);
				SalarytextFieldother.setColumns(10);
				
				Jobinformationother.add(lbljobtiming);
				
				jobstarttimingcomboxBother.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Jobinformationother.add(jobstarttimingcomboxBother);
				
				jobEndtimingcomboxother.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Jobinformationother.add(jobEndtimingcomboxother);		
				Jobinformationother.add(jobtypelblNewLabel);
							
  		Jobinformationfaculty.hide();
  		Jobinformationother.hide();
  		
	}
}
