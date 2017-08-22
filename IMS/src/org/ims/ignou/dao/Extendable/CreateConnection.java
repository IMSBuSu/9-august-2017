package org.ims.ignou.dao.Extendable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class CreateConnection 
{
	private static String url;
	private static String uname;
	private static String upassword;
	
	public  void loadDriver() throws ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	
	public  Connection createconnection() throws SQLException, ClassNotFoundException
	{
		loadDriver();
		url="jdbc:oracle:thin:@localhost:1521:ims";
		uname=Loadbundle.getValue("userid");
		upassword=Loadbundle.getValue("password");
		return DriverManager.getConnection(url,uname,upassword);		
		
	}
	
}
