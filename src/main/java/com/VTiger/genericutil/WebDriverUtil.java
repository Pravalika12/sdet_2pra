package com.VTiger.genericutil;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {
	WebDriver driver;
	public WebDriverUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	/**
	 * @author lenovo
	 * description:maximizing window
	 * 
	 * @parm driver
	 */
	public void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	/**
	 * @author lenovo
	 * 
	 * Description :implicitly wait time
	 */
	public void pageLoadTimeout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * @author lenovo
	 * Description:selecting value from dropdown using value or index or text
	 * 
	 * @param element
	 * @param value
	 */
	public void selectValueFromDD(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public void selectValueFromDD1(WebElement text,int ddfield)
	{
		Select select=new Select(text);
		select.selectByIndex(ddfield);
	}
	public void selectValueFromDD2(String text,WebElement element)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * @author lenovo
	 * Description:mouse over actions using movetoelement or movebyoffset
	 * 
	 * @param element
	 */
	public void moveToElement(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public void clickByOffset(int xoffset,int yoffset)
	{
		Actions a=new Actions(driver);
		a.moveByOffset(xoffset,yoffset);
	}
	public void rightClick(WebElement element)
	{
		Actions a= new Actions(driver);
		a.contextClick(element);
	}
	/**
	 * @author lenovo
	 * Description:Handling popups by alert
	 * 
	 */

	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	public void dismissAlert()
	{
		driver.switchTo().alert().dismiss();
	}
	public void sendKeysAlert(String keys)
	{
		driver.switchTo().alert().sendKeys(keys);
	}
	public void getTextAlert()
	{
		driver.switchTo().alert().getText();
	}
	/**
	 * @author lenovo
	 * Description:handling frame by index or text or webelement
	 * @param index
	 */
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String text)
	{
		driver.switchTo().frame(text);
	}
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * @author lenovo
	 * Description :handling multiple windows 
	 * @param expected title
	 */
	public void switchToWindow(String expectedtitle)
	{
		Set<String> winids=driver.getWindowHandles();
		for(String id:winids)
		{
			String actualtitle=driver.switchTo().window(id).getTitle();
			System.out.println(actualtitle);
			if(actualtitle.contains(expectedtitle))
			{
				break;
			}
		}
	}



}


