package org.ims.ignou.helper.employee;

import org.ims.ignou.dto.employee.Employeedto;

public class FatchDB 
{
	
			public Employeedto employeeobject(){
				
				Employeedto employeedto=new Employeedto("bunty goswami","Shri krishan pal goswami","26/April/1995"
						,"male","obc","unmarried","A-1/91/77, East Gokal pur ,delhi-110094","9213120419","buntygoswami9@gmail.com"
						,"india",2010,2012,0,2014,2017,0,0,"cbse","cbse","0","ITI"
						,"Delhi univercity school of open learning","0","0","42.34","45.54","0","82","54","0","0",'a','b',
						'0','b','A','0','0',"ART","0","Sheet metal worker","B.A","0","0","Sfotware Devloper","9:00 AM - 7:00 PM",
						20000,					
						new String[]{"c++","java"},
						new String[]{"12:00 PM - 2:00 PM","9:00 AM - 11:00 AM"}
						);
			
				return employeedto;
			}
	
}
