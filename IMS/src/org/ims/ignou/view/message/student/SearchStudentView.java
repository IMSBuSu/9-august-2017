package org.ims.ignou.view.message.student;

import javax.swing.JOptionPane;
import org.ims.ignou.helper.message.FetchSenderEmailId;
import org.ims.ignou.helper.student.find.SearchStudent;
import org.ims.ignou.helper.student.find.StuFindValidation;
import org.ims.ignou.view.student.find.StudentSearchView;

public class SearchStudentView extends StudentSearchView {

	StuFindValidation searchValidation=new StuFindValidation();


	
@Override
public void validation() 
{
	if(searchValidation.canNotblank(this))
	{
		int id=Integer.parseInt(txtStudentIFld.getText());
		SearchStudent student=new SearchStudent();
		Boolean found=student.chkIdDb(id);
		if(!found){
					JOptionPane.showMessageDialog(this, "Student Not Found");
		}
		else{
			this.setVisible(false);
			System.out.println(student.getstudentFinddto().getEmailId());
			 FetchSenderEmailId fetchemail = new FetchSenderEmailId();
			if(fetchemail.senderEmail()){
				new SendEmailViewStudent(fetchemail.getsenderPassword(),fetchemail.getReciverEmail(),student.getstudentFinddto().getEmailId()).setVisible(true);
			}
			
		}
	}
}
	
	
	public SearchStudentView() {
		

	}

}
