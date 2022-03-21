package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FireFoxProfilesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "G:\\ExampleAutomation1\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
		/*	ProfilesIni profilesini=new ProfilesIni();
			FirefoxProfile ffprofile=profilesini.getProfile("default");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
		*/
			FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "http://sgtestinginstitute.com/");
			
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			
			oBrowser=new FirefoxDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
