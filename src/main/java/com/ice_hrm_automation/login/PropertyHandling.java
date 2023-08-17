package com.ice_hrm_automation.login;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyHandling {
	
	Properties properties;
	public PropertyHandling() 
	{
		try {
		String filePath=System.getProperty("user.dir")+"/confi.properties";
		FileInputStream inputstream=new FileInputStream(filePath);
		properties=new Properties();
		properties.load(inputstream);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public String getProperty(String key)
	{
		String value=properties.getProperty(key);
		System.out.println(value);
		return value;
	}

}
