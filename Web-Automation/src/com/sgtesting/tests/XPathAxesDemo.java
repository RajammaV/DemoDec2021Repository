package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextToRahulDravid();
	//	makeStatusAsActiveForIndianFreedomFighter();
	//	fromSachinTendulkarHisPrevioousSecondRecordMakeStatusAsActive();
	//	basedOnTextFiledGetAttributeValueOfTable();
		basedOnTableFor5thRecordEnterSalary();
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
			oBrowser.get("file:///E:/HTML/WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * following-sibling
	 */
	private static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
	}
	
	/**
	 * following
	 */
	private static void enterSalaryForPersonWhoIsNextToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("25000");
	}
	
	/**
	 * preceding-sibling
	 */
	private static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 * preceding
	 */
	private static void fromSachinTendulkarHisPrevioousSecondRecordMakeStatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
	
	/**
	 * ancestor
	 */
	private static void basedOnTextFiledGetAttributeValueOfTable()
	{
		String str=oBrowser.findElement(By.xpath("//input[@id='edit2']/ancestor::td/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println(str);
	}
	
	/**
	 * descendant
	 */
	private static void basedOnTableFor5thRecordEnterSalary()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("25000");
		
	}
}
