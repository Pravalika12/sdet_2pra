package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.WebDriverUtil;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;

	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactslink;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutimg;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;

	public WebElement getOrglink() {
		return orglink;
	}



	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getSignoutimg() {
		return signoutimg;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}



	public HomePage(WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void logoutfromapp() throws InterruptedException
	{
		WebDriverUtil util=new WebDriverUtil(driver);
		util.moveToElement(signoutimg);
		Thread.sleep(2000);
		signoutlink.click();



	}
}










