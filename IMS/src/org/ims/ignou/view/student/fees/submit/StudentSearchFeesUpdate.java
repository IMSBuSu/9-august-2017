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
										if(student.getstudentFinddto().)
										new ShowStuFeesUpdatehelper().showEmpDetail(student.getstudentFinddto(), txtStudentIFld.getText());;	
						}
		}
	}
	public StudentSearchFeesUpdate() {
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
