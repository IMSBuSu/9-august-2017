package org.ims.ignou.view.student.fees.submit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.ims.ignou.helper.student.fees.submit.ShowStuFeesUpdatehelper;
import org.ims.ignou.helper.student.find.SearchStudent;
import org.ims.ignou.helper.student.find.StuFindValidation;
import org.ims.ignou.view.student.find.StudentSearchView;

public class StudentSearchFeesUpdate extends StudentSearchView{
	
	private String btnClick;
	
	@Override
	public void validation() {
		StuFindValidation deleteValidation=new StuFindValidation();
		if(deleteValidation.canNotblank(this)){
						int id=Integer.parseInt(txtStudentIFld.getText());
						SearchStudent student=new SearchStudent();
						Boolean found=student.chkIdDb(id);
						if(!found){
									JOptionPane.showMessageDialog(this, "Student Not Found");
						}
						else{
										this.setVisible(false);
										int pdenfingfees=Integer.parseInt(student.getstudentFinddto().getRemainFees());
										if(pdenfingfees!=0)
										{		
												if(btnClick==""){
													new ShowStuFeesUpdatehelper().showEmpDetail(student.getstudentFinddto(), txtStudentIFld.getText());;	
												}
												else{
													JOptionPane.showMessageDialog(null, "Fees ReaminIng  : "+student.getstudentFinddto().getRemainFees());
													return;
												}
										}
										else{
											if(btnClick==""){
											JOptionPane.showMessageDialog(null, "There No Fees Pending ");
											
											}
										}
										if(btnClick=="Check Status"){
													if(pdenfingfees==0){
														JOptionPane.showMessageDialog(null, "There No Fees Pending ");
													}
										}
		
						}
		}
	}
	public StudentSearchFeesUpdate(String btnClick) {
		this.btnClick=btnClick;
		btnSearch.setLocation(365, 181);
		
		this.remove(btnSearch);
		
		JButton btnNewButton = new JButton("Search Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						validation();
			}
		});

		btnNewButton.setBounds(362, 147, 123, 23);
		getContentPane().add(btnNewButton);
		
		
		
	}

	
			
	
	
	
	
	
}
