package org.ims.ignou.helper.employee.delete;

import javax.swing.ImageIcon;

import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.view.employee.delete.DeleteShowEmpView;

public class setDeleteEmpdetail {

	

	private void setDetail(EmployeeFinddto employeeFinddto,DeleteShowEmpView detailView,String id){
	
				
				detailView.setTextEMPname(employeeFinddto.getEmployeeName());
				detailView.setTextempid(id);
				detailView.setTextEmailid(employeeFinddto.getEmailId());
				detailView.setTextfatherName(employeeFinddto.getFatherName());
				detailView.setTextempdob(employeeFinddto.getDob());
				detailView.setempImage(new ImageIcon(LoadBundelImageLocation.getImagepath("imgPath")+employeeFinddto.getImage()));
	}

	public void showEmpDetail(EmployeeFinddto empDetail,String id){
		DeleteShowEmpView detailView=new DeleteShowEmpView();
						setDetail(empDetail,detailView, id);
						detailView.setVisible(true);
	}

}


