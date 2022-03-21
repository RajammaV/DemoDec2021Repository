package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXpathTagNameAlone();
	//	relativeXpathUsingTagNameWithIndex();
	//	relXpathUsingTagNameWithAttributeNameValueCombination();
	//	relXpathUsingAttributeNameValueCombination();
	//	relXpathUsingAttributeValueAlone();
	//	relXpathUsingTagNameWithMultipleAttributeNameValueCombination();
	//	relXpathUsingTagNameWithMultipleAttributeNameValueUsingOrOperator();
	//	relXpathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator();
	//	relXpathUsingPartialMatchingOfAttributeNameValue();
	//	relXpathUsingTagNameWithAttributeName();
	//	relXpathUsingTagNameWithAttributeName_1();
	//	relXpathUsingTagNameWithAttributeName_2();
	//	relXpathUsingTagNameWithAttributeName_3();
	//	relXpathUsingTextContent();
		relXpathUsingPartialTextContent();
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
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	/**
	 * Case 1: Identify the element based on tagName
	 * Syntax: //<tagName>
	 *  
	 */
	private static void relativeXpathTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify the element based on tagName with index
	 * Syntax: //<tagName>[index]
	 *  
	 */
	private static void relativeXpathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify the element based on tagName with 
	 *         Attribute name and value combination
	 * Syntax: //<tagName>[@attributename='attribute value']
	 *  
	 */
	private static void relXpathUsingTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: Identify the element based on  
	 *         Attribute name and value combination
	 * Syntax: //*[@attributename='attribute value']
	 *  
	 */
	private static void relXpathUsingAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@name='pass1word1']")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 5: Identify the element based on  
	 *         Attribute value alone
	 * Syntax: //*[@*='attribute value']
	 *  
	 */
	private static void relXpathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='pass1word1']")).sendKeys("DemoUser1");
	}

	/**
	 * Case 6: Identify the element based on tagName with 
	 *         Multiple Attribute name and value combination
	 * Syntax: //<tagName>[@attributename='attribute value'][@attributename='attribute value']
	 *  
	 */
	private static void relXpathUsingTagNameWithMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();
	}
	
	/**
	 * Case 7: Identify the element based on tagName with 
	 *         Multiple Attribute name and value combination
	 *         using or operator
	 * Syntax: //<tagName>[@attributename='attribute value' or @attributename='attribute value']
	 *  
	 */
	private static void relXpathUsingTagNameWithMultipleAttributeNameValueUsingOrOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
	}
	
	/**
	 * Case 8: Identify the element based on tagName with 
	 *         Multiple Attribute name and value combination
	 *         using and operator
	 * Syntax: //<tagName>[@attributename='attribute value' and @attributename='attribute value']
	 *  
	 */
	private static void relXpathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
	}
	
	/**
	 * Case 9: Identify the element based on tagName with 
	 *         Partial Matching of Attribute value
	 * Syntax: //<tagName>[starts-with(@attributename,'attribute value')]
	 *  Syntax: //<tagName>[ends-with(@attributename,'attribute value')]
	 *  Syntax: //<tagName>[contains(@attributename,'attribute value')]
	 */
	private static void relXpathUsingPartialMatchingOfAttributeNameValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	
	/**
	 * Case 10: Identify the element based on tagName with 
	 *         Attribute name alone
	 * Syntax: //<tagName>[@attributename]
	 *  
	 */
	private static void relXpathUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relXpathUsingTagNameWithAttributeName_1()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String name=link.getText();
			System.out.println(name);
		}
	}
	
	private static void relXpathUsingTagNameWithAttributeName_2()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String name=link.getText();
				if(name.endsWith("Testing"))
				{
					link.click();
					Thread.sleep(3000);
					break;
				}
			}
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//StaleElementReferenceException:
	private static void relXpathUsingTagNameWithAttributeName_3()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String name=link.getText();
				if(name.endsWith("Testing"))
				{
					link.click();
					Thread.sleep(3000);
				}
			}
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 11: Identify the element based on text content
	 * Syntax: //<tagName>[text()='text content']
	 *  
	 */
	private static void relXpathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='SeleniumHQ']")).click();
	}
	
	/**
	 * Case 12: Identify the element based on partial text content
	 * Syntax: //<tagName>[starts-with(text(),'text content')]
	 * Syntax: //<tagName>[ends-with(text(),'text content')]
	 * Syntax: //<tagName>[contains(text(),'text content')]
	 *  
	 */
	private static void relXpathUsingPartialTextContent()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
	}
}
