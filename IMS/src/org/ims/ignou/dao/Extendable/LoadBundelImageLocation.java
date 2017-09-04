package org.ims.ignou.dao.Extendable;

import java.util.ResourceBundle;

public class LoadBundelImageLocation {

	private static ResourceBundle databasebundle;
	static{
		databasebundle=ResourceBundle.getBundle("ImageLocation");
	}

	
	public static String getImagepath(String key){
		return 	databasebundle.getString(key);
	}
}
