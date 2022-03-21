package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCSSSelector();
	//	relCSSUsingTagName();
	//	relCSSUsingTagNameWithIDAttributeValue();
	//	relCSSUsingIDAttributeValueAlone();
	//	relCSSUsingTagNameWithClassAttributeValue();
	//	relCSSUsingClassAttributeValueAlone();
	//	relCSSUsingTagNameWithAttributeNameAndValue();
	//	relCSSUsingTagNameWithMultipleAttributeNameAndValue();
	//	relCSSUsingTagNameWithPartialMatchingOfAttributeValue();
	//	relCSSUsingTagNameWithAttributeNameAlone();
	//	relCSSUsingTagNameWithAttributeNameAlone_1();
	//	relCSSUsingTagNameWithAttributeNameAlone_2();
	//	relCSSUsingParentElement();
	//	relCSSUsingNthChildConcept();
		relCSSUsingSiblingConcept();
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
	
	private static void absoluteCSSSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	/*
	 * Case 1: Identify the Element based on tagName
	 * Syntax: <tagName>
	 */
	private static void relCSSUsingTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}

	/*
	 * Case 2: Identify the Element based on tagName
	 *         with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relCSSUsingTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/*
	 * Case 3: Identify the Element based on 
	 *         id attribute value alone
	 * Syntax: #<id attribute value>
	 */
	private static void relCSSUsingIDAttributeValueAlone()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/*
	 * Case 4: Identify the Element based on tagName
	 *         with ClassName attribute value
	 * Syntax: <tagName>#<Class attribute value>
	 */
	private static void relCSSUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
	}
	
	/*
	 * Case 5: Identify the Element based on 
	 *         ClassName attribute value
	 * Syntax: #<Class attribute value>
	 */
	private static void relCSSUsingClassAttributeValueAlone()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
	}
	
	/*
	 * Case 6: Identify the Element based on TagName with
	 *         AttributeName and attribute value
	 * Syntax: <tagName>[attributename='attributevalue']
	 */
	private static void relCSSUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/*
	 * Case 7: Identify the Element based on TagName with
	 *         Multiple AttributeName and attribute value
	 * Syntax: <tagName>[attributename='attributevalue'][attributename='attributevalue']
	 */
	private static void relCSSUsingTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
	}
	
	/*
	 * Case 8: Identify the Element based on TagName with
	 *         Partial matching of attribute value
	 * Syntax: <tagName>[attributename ^= 'attributevalue']
	 * Syntax: <tagName>[attributename $= 'attributevalue']
	 * Syntax: <tagName>[attributename *= 'attributevalue']
	 */
	private static void relCSSUsingTagNameWithPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
		
	}
	
	/*
	 * Case 9: Identify the Element based on TagName with
	 *         AttributeName 
	 * Syntax: <tagName>[attributename]
	 */
	private static void relCSSUsingTagNameWithAttributeNameAlone()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relCSSUsingTagNameWithAttributeNameAlone_1()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linetext=link.getText();
			if(linetext.endsWith("Apache"))
			{
				link.click();
				break;
			}
		}
	}
	//StaleElementReferenceException:
	private static void relCSSUsingTagNameWithAttributeNameAlone_2()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String linetext=link.getText();
				if(linetext.endsWith("Apache"))
				{
					link.click();
					Thread.sleep(3000);
				}
			}
			oBrowser.navigate().back();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Case 10: Identify the Element based on Parent Element
	 * Syntax: <tagName> >: childElement
	 */
	private static void relCSSUsingParentElement()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	
	/*
	 * Case 11: Identify the Element based on nth Child concept
	 */
	private static void relCSSUsingNthChildConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 >:nth-child(5)")).sendKeys("DemoUser1");
	}
	
	/*
	 * Case 12: Identify the Element based on Siblings concept
	 */
	private static void relCSSUsingSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input + input")).sendKeys("DemoUser1");
	}
}
