package org.ims.ignou.helper.employee.find;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ims.ignou.dao.employee.find.SearchInDb;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.view.employee.find.ShowEmpDetailView;

public class SearchEmployee {

				
	
				private EmployeeFinddto employeeFinddto;
				
	
				
				public EmployeeFinddto getEmployeeFinddto() {
					return employeeFinddto;
				}

				public void showEmpDetail(){
					
									ShowEmpDetailView detailView=new ShowEmpDetailView();
									detailView.setVisible(true);
					
				}

				public Boolean chkIdDb(int id)
				{
									
							SearchInDb search=new SearchInDb();
							Boolean isFound=search.search(id);
								if(isFound){
									
											employeeFinddto=search.getEmployeeFinddto();
											return true;
								}
					
							
					return false;
				}
}
