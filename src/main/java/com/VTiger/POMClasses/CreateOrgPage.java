package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.ExcelUtil;
import com.VTiger.genericutil.WebDriverUtil;

public class CreateOrgPage {
	WebDriver driver;
	WebDriverUtil util = new WebDriverUtil(driver);

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorgimg;

	@FindBy(name="accountname")
	private WebElement orgnametextfield;
	@FindBy(id="phone")
	private WebElement phonenumbertextfield;

	
	@FindBy(name="industry")
	private WebElement industrydd;
	@FindBy(name="accounttype")
	private WebElement accounttypedd;
	@FindBy(name="rating")
	private WebElement ratingdd;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;

	public WebElement getOrgnametextfield() {
		return orgnametextfield;
	}
	public WebElement getPhonenumbertextfield() {
		return phonenumbertextfield;
	}
	public WebElement getcreateorgimg() {
		return createorgimg;
	}
	public WebElement getIndustrydd() {
		return industrydd;
	}
	public WebElement getAccounttypedd() {
		return accounttypedd;
	}
	public WebElement getRatingdd() {
		return ratingdd;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}


	public CreateOrgPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Accounttypedropdown(String sheetname,int cellvalue,String value) throws Throwable
	{
		String dd1=ExcelUtil.objOfExcelUtil().selectValueFromDD(sheetname, cellvalue, value);
		util.selectValueFromDD(accounttypedd, dd1);
		
		
	}
	public void industrydropdown(String sheetname,int cellvalue,String value) throws Throwable
	{
		String dd2=ExcelUtil.objOfExcelUtil().selectValueFromDD(sheetname, cellvalue, value);
		util.selectValueFromDD(industrydd, dd2);
		
	}
	public void ratingdropdown(String sheetname,int cellvalue,String value) throws Throwable
	{
		String dd3=ExcelUtil.objOfExcelUtil().selectValueFromDD(sheetname, cellvalue, value);
		util.selectValueFromDD(ratingdd, dd3);
	}
}
