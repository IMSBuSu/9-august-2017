package org.ims.ignou.helper.student.delete;

import javax.swing.ImageIcon;

import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.dto.student.find.StudentFindDto;
import org.ims.ignou.view.employee.delete.DeleteShowEmpView;
import org.ims.ignou.view.student.delete.DeleteShowStudentView;

public class setDeleteStudetail {

	

	private void setDetail(StudentFindDto studentFinddto,DeleteShowStudentView detailView,String id){
		detailView.setTextEMPname(studentFinddto.getEmployeeName());
		detailView.setTextempid(id);
		detailView.setTextcoursename(studentFinddto.getCourseName());
		detailView.setTextEmailid(studentFinddto.getEmailId());
		detailView.setTextfatherName(studentFinddto.getFatherName());
		detailView.setTextstudob(studentFinddto.getDob());
		detailView.setempImage(new ImageIcon(LoadBundelImageLocation.getImagepath("imgStud")+studentFinddto.getImage()));
	
	}

	public void showEmpDetail(StudentFindDto empDetail,String id){
		DeleteShowStudentView detailView=new DeleteShowStudentView();
						setDetail(empDetail,detailView, id);
						detailView.setVisible(true);
	}


}


