package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.WebDriverUtil;

public class Createcontactinfo {
WebDriver driver;
	

	@FindBy(xpath="//a[text()='Contacts']")//rule 2
	private WebElement contactlink;//rule 3
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcontactlink;
	//dropdown selection in name
	
	@FindBy(name ="salutationtype")
	private WebElement ddfield;
	@FindBy(name ="firstname")
	private WebElement firstnametextfield;
	@FindBy(name ="lastname")
	private WebElement lastnametextfield;
	
	@FindBy(xpath ="//img[@title='Select']")
	private WebElement savebutton;
	
	public WebElement getContactlink() {
		return contactlink;
	}
	public WebElement getCreatecontactlink() {
		return createcontactlink;
	}
	public WebElement getDdfield() {
		return ddfield;
	}
	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}
	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}
	public WebElement getPlusbutton() {
		return savebutton;
	}
	//for entering orgname we have to click on plus button
		public Createcontactinfo(WebDriver driver)
		{
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
		public void createcontactwithln(String lastname)
		{
			lastnametextfield.sendKeys(lastname);
			savebutton.click();
		}
	     public void createcontact(String firstname,String lastname,String text)
	     {
	    	 
	    	 WebDriverUtil util=new WebDriverUtil(driver);
	    	 util.selectValueFromDD(text, ddfield);
	    	 firstnametextfield.sendKeys(firstname);
	    	lastnametextfield.sendKeys(lastname); 
	     }	
		
		
		
		
		
		
		
		
	
	
	
}
