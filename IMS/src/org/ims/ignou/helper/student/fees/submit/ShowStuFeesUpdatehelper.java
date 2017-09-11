package org.ims.ignou.helper.student.fees.submit;

import javax.swing.ImageIcon;

import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.student.find.StudentFindDto;
import org.ims.ignou.view.student.fees.submit.ShowStudentFeesUpdateView;

public class ShowStuFeesUpdatehelper 
{

	
	private void setDetail(StudentFindDto studentFinddto,ShowStudentFeesUpdateView detailView,String id){
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

			public void showEmpDetail(StudentFindDto empDetail, String id) {

				ShowStudentFeesUpdateView detailView=new ShowStudentFeesUpdateView();
				setDetail(empDetail,detailView, id);
				detailView.setVisible(true);

			
			}
	
}
