package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		actionMovements();
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
			oBrowser.get("https://www.dsce.edu.in/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void actionMovements()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
			Thread.sleep(2000);
			Actions oMouse=new Actions(oBrowser);
			WebElement oEle1=oBrowser.findElement(By.xpath("//span[text()='Academics']"));
			oMouse.moveToElement(oEle1).build().perform();
			Thread.sleep(2000);
			WebElement oEle2=oBrowser.findElement(By.xpath("//span[text()='PG Programs']"));
			oMouse.moveToElement(oEle2).build().perform();
			Thread.sleep(2000);
			WebElement oEle3=oBrowser.findElement(By.xpath("//span[text()='Master of Computer Applications']"));
			oMouse.moveToElement(oEle3).build().perform();
			Thread.sleep(2000);
			oMouse.click(oEle3).build().perform();
			Thread.sleep(4000);
			WebElement oEle4=oBrowser.findElement(By.xpath("//img[@class='dj-image']"));
			oMouse.contextClick(oEle4).build().perform();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
