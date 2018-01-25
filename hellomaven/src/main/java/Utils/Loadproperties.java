package Utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.Test;

public class Loadproperties {
	public static Map loadProperties(String fileName) throws IOException{
		Map<String,String> propMap = new HashMap<String,String>();
		String basePath=System.getProperty("user.dir");
		String sep=System.getProperty(File.separator);
		String filePath = basePath+sep+"src"+sep+"main"+sep+"java"+sep+"com"+sep+"manpreet"+sep+"config"+sep+fileName;
System.out.println(filePath);
		
		FileInputStream fis = new FileInputStream(new File(filePath));
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		for(String key: prop.stringPropertyNames()){
			propMap.put(key, prop.getProperty(key));			
		}
		
		return propMap;
	}

	
	@Test
	public void m1() throws IOException{
		 Map<String,String> map=loadProperties("env.properties");
		 
		 System.out.println(map.get("os"));
		 System.out.println(map.get("browser"));
	}
	
	

}
