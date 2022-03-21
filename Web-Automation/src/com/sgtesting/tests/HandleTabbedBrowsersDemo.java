package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabbedBrowsersDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handleChildBrowers();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation1\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void handleChildBrowers()
	{
		WebElement oLink=null;
		try
		{
			oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before Click on the Link the availalbe Child Browers count:"+getPopupsCount());
			Thread.sleep(2000);
			oLink.click();
			Thread.sleep(2000);
			System.out.println("After Click on the Link the availalbe Child Browers count:"+getPopupsCount());
			Thread.sleep(2000);
			if(getPopupsCount()>0)
			{
				windowHandler();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupsCount()
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	private static void windowHandler()
	{
		String parentBrowser=null;
		Object popups[]=null;
		try
		{
			parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser:"+parentBrowser);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser:"+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Start Free Trial")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
