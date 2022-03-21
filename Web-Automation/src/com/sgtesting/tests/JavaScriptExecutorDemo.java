package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getTitle();
		getURL();
		getNumberOfLinks();
		//	enterDataInTextFiled1();
		//	enterDataInTextFiled2();
		//	clickOnButton1();
		//	clickOnButton2();
		//  clickOnCheckBox1();
		//	clickOnCheckBox2();
		//	clickOnRadioButton1();
		//	clickOnRadioButton2();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation1\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///E:/HTML/Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void getTitle()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title :"+title);
	}

	private static void getURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL :"+url);
	}

	private static void getNumberOfLinks()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long links=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links :"+links);
	}
	// identifying text field
	private static void enterDataInTextFiled1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	// Use WebElement for identifying text field
	private static void enterDataInTextFiled2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
		js.executeScript("arguments[0].value='Welcome123';",oEle);
	}

	// identifying button field
	private static void clickOnButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	// Use WebElement for identifying button field
	private static void clickOnButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		js.executeScript("arguments[0].click();",oEle);
	}

	// identifying checkBox field
	private static void clickOnCheckBox1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	// Use WebElement for identifying checkBox field
	private static void clickOnCheckBox2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
		js.executeScript("arguments[0].click();",oEle);
	}

	// identifying Radio Button field
	private static void clickOnRadioButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	// Use WebElement for identifying Radio Button field
	private static void clickOnRadioButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		js.executeScript("arguments[0].click();",oEle);
	}
}
