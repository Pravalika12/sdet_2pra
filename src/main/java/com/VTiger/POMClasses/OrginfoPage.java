package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.WebDriverUtil;

public class OrginfoPage {//rule 1

	WebDriver driver;


	@FindBy(xpath="//img[@title='Create Organization...']")//rule 2
	private WebElement createorglink;//rule 3

	@FindBy(name="search_text")
	private WebElement searchintextfield;

	@FindBy(id="bas_searchfield")
	private WebElement searchfororgDD;
	
	@FindBy(name="submit")
	private WebElement searchnowbtn;
	
	public WebElement getCreateorglink() {
		return createorglink;
	}
	public WebElement getSearchintextfield() 
	{
		return searchintextfield;
	}
	public WebElement getSearchfororgname() {
		return searchfororgDD;
	}
	public WebElement getSaveorginfo() {
		return searchnowbtn;
	}
	

	public OrginfoPage(WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void searchfororg(String orgnamesearchfor,String text)
	{
		searchintextfield.sendKeys(orgnamesearchfor);
		WebDriverUtil webutil=new WebDriverUtil(driver);
		webutil.selectValueFromDD(text,searchfororgDD);
		searchnowbtn.click();
	}
}

