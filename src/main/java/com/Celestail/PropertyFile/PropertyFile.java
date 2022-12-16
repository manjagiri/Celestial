package com.Celestail.PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	FileInputStream fis=null;
	 Properties prop=null;
	public String getProperties(String key) {
		
		 prop=new Properties();
		try {
		 fis=new FileInputStream(IConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
		}
	}
