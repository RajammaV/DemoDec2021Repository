package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

public class ObjectMap {
    public static Properties prop=null;
	public ObjectMap(String filename)
	{
		FileInputStream fin = null;
		
		try
		{
			String path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\ObjectMap\\"+filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String logicavalue=prop.getProperty(logicalname);
			String locator[]=logicavalue.split(",");
			String locatorname=locator[0];
			String locatorvalue=locator[1];
			switch(locatorname.toLowerCase())
			{
			case "id":
				by=By.id(locatorvalue);
				break;
			case "name":
				by=By.name(locatorvalue);
				break;
			case "xpath":
				by=By.xpath(locatorvalue);
				break;
			case "linktext":
				by=By.linkText(locatorvalue);
				break;
			case "tagname":
				by=By.tagName(locatorvalue);
				break;
			case "cssselector":
				by=By.cssSelector(locatorvalue);
				break;
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
