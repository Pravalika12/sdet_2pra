package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.WebDriverUtil;

public class ContactInfo {

    WebDriver driver;
	

	@FindBy(xpath="//a[text()='Contacts']")//rule 2
	private WebElement contactlink;//rule 3
	@FindBy(xpath="//img['@title=Create Contact...']")
	private WebElement Createcontactlink;
	


	@FindBy(id="search_text")
	private WebElement searchintextfield;
	
	@FindBy(name="search_field")
	private WebElement searchforcontactDD;
	//click on search button
	@FindBy(name="search")
	private WebElement clickonsearch;

	public WebElement getContactlink() {
		return contactlink;
	}


	public WebElement getCreatecontactlink() {
		return Createcontactlink;
	}


	public WebElement getSearchintextfield() {
		return searchintextfield;
	}


	public WebElement getSearchfororgDD() {
		return searchforcontactDD;
	}


	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}


	@FindBy(name="submit")
	private WebElement searchnowbtn;

public  ContactInfo(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void searchforcontact(String contactamesearchfor,String text)
{
	 searchintextfield.sendKeys(contactamesearchfor);
	 WebDriverUtil webutil=new WebDriverUtil(driver);
	 webutil.selectValueFromDD2(text,searchforcontactDD);
	 searchnowbtn.click();
}










}