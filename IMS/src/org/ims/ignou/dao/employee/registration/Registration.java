package org.ims.ignou.dao.employee.registration;

import java.sql.Connection;
import java.sql.SQLException;

import org.ims.ignou.dao.Extendable.CreateConnection;

public class Registration  extends CreateConnection
{

		public Connection createConnection() throws ClassNotFoundException, SQLException{
			
			return createconnection();			
		}
		
		
		
		
		
		
}
