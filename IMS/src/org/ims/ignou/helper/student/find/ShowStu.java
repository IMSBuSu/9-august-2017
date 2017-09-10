package org.ims.ignou.helper.student.find;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.dto.student.find.StudentFindDto;
import org.ims.ignou.view.student.find.ShowStudentDetailView;

public class ShowStu  {
	
	private void setDetail(StudentFindDto studentFinddto,ShowStudentDetailView detailView,String id){
	
		

				detailView.setTextteachername(studentFinddto.getEmployeeName());
				detailView.setTextstudenid(id);
				detailView.setTextStudentName(studentFinddto.getStudentName());
				detailView.setTextBatchTimeing(studentFinddto.getBatchTimeing());
				detailView.setTextFieldCourseName(studentFinddto.getCourseName());
				detailView.setTextEmailid(studentFinddto.getEmailId());
				detailView.setTextfatherName(studentFinddto.getFatherName());
				detailView.setTextstudob(studentFinddto.getDob());
				detailView.setLabelstuimage(new ImageIcon(LoadBundelImageLocation.getImagepath("imgStud")+studentFinddto.getImage()));
				detailView.setTextremainFees(studentFinddto.getRemainFees());
	
	}

	public void showEmpDetail(StudentFindDto empDetail,String id){
						ShowStudentDetailView detailView=new ShowStudentDetailView();
						setDetail(empDetail,detailView, id);
						detailView.setVisible(true);
	}

}
