package org.ims.ignou.helper.employee.find;


import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.view.employee.find.ShowEmpDetailView;

public class ShowEmp  {
	
	private void setDetail(EmployeeFinddto employeeFinddto,ShowEmpDetailView detailView,String id){
	
				LoadBundelImageLocation.getImagepath("imgPath");
				detailView.setTextEMPname(employeeFinddto.getEmployeeName());
				detailView.setTextempid(id);
				detailView.setTextEmailid(employeeFinddto.getEmailId());
				detailView.setTextfatherName(employeeFinddto.getFatherName());
				detailView.setTextempdob(employeeFinddto.getDob());
				detailView.setempImage(new ImageIcon(LoadBundelImageLocation.getImagepath("imgPath")+employeeFinddto.getImage()));
	}

	public void showEmpDetail(EmployeeFinddto empDetail,String id){
						ShowEmpDetailView detailView=new ShowEmpDetailView();
						setDetail(empDetail,detailView, id);
						detailView.setVisible(true);
	}

}
