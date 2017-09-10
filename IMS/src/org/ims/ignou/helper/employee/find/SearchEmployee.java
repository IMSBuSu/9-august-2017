package org.ims.ignou.helper.employee.find;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import org.ims.ignou.dao.Extendable.LoadBundelImageLocation;
import org.ims.ignou.dao.employee.find.SearchInDb;
import org.ims.ignou.dto.employee.find.EmployeeFinddto;
import org.ims.ignou.view.employee.find.ShowEmpDetailView;

public class SearchEmployee {

				
	
				private EmployeeFinddto employeeFinddto;
				
	
				
				public EmployeeFinddto getEmployeeFinddto() {
					return employeeFinddto;
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
