

package org.ims.ignou.helper.message;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException; 

public class CheckInternetConnection{
 
	
	public static Boolean checkinternet()
	{	
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
	    	try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} 
	    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
						    	//theme not supported	
			}	    
	    	
		}

		try 
	
		{
					URL url = new URL("https://www.google.co.in");
 
						URLConnection connection = url.openConnection();
						connection.connect();   
 							return true;
						
		}catch (UnknownHostException e){
			JOptionPane.showMessageDialog(null, "Internet Connection not Avaiable");
			return false;
		} 
		catch (MalformedURLException e ) {
			JOptionPane.showMessageDialog(null, "Internet Connection not Avaiable");
			return false;
			
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Internet Connection not Avaiable");
			return false;
		}
		
	}
}
