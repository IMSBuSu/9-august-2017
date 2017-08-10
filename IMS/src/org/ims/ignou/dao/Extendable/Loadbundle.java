package org.ims.ignou.dao.Extendable;

import java.util.ResourceBundle;

public class Loadbundle
{
	private static ResourceBundle databasebundle;
	static{
		databasebundle=ResourceBundle.getBundle("database");
	}

	
	public static String getValue(String key){
		return 	databasebundle.getString(key);
	}
	
}
