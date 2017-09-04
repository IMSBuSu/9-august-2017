package org.ims.ignou.helper.employee.registration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CopyEmployeeImage {

		public FileInputStream readImage(String imagePath){
			
			File image=new File(imagePath);
				FileInputStream fileInputStream = null;
				try {
					fileInputStream = new FileInputStream(image);
					return fileInputStream;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return fileInputStream;
		}
		
	
		public void writeImage(String imagePath,String destinationPath){
			FileInputStream fileInputStream=readImage(imagePath);
			if(fileInputStream!=null){
						File destiNation=new File(destinationPath);
						FileOutputStream fileOutputStream;
						try {
									fileOutputStream = new FileOutputStream(destiNation);
										int byt = fileInputStream.read();
											while(byt!=(-1))
											{
														fileOutputStream.write(byt);
														byt=fileInputStream.read();
											}
						} catch (FileNotFoundException e) {			
									e.printStackTrace();
						} catch (IOException e) {
								
							e.printStackTrace();
						}
		
			}				
			
		}
	
	
	

}
