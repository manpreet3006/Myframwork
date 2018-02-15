package com.companyname.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyFile {
    
	
	public static Map LoadPlaceHolder(String filename) throws FileNotFoundException{
		
		FileInputStream fis= null;
		Map<String,String> map = new HashMap<String,String>();
		
		try{
		fis= new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\companyname\\config\\"+filename));
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		for(Object keys:prop.keySet()){
			map.put(keys.toString(), prop.getProperty((String)keys));
			
		}
		
		return Collections.unmodifiableMap (map);
		
		
	}
}
