package org.ims.ignou.helper.student.find;

import org.ims.ignou.dao.student.find.SearchStudentInDb;
import org.ims.ignou.dto.student.find.StudentFindDto;

public class SearchStudent {

				
	
				private StudentFindDto studentFinddto;
				
	
				
				public StudentFindDto getstudentFinddto() {
					return studentFinddto;
				}
				

				public Boolean chkIdDb(int id)
				{
									
							SearchStudentInDb search=new SearchStudentInDb();
							Boolean isFound=search.search(id);
								if(isFound){
									
									studentFinddto=search.getstudentFinddto();
											return true;
								}
					
							
					return false;
				}



	


}
