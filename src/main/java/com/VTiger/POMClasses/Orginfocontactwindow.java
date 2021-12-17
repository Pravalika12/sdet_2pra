package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.WebDriverUtil;

public class Orginfocontactwindow {
	WebDriver driver;
	@FindBy(id="search_txt")
	private WebElement searchtxtfield;
	
	@FindBy(id="13")
	private WebElement chooseorg;
	
	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement selectorg;
	
	public WebElement getSelectorg() {
		return selectorg;
	}
	@FindBy(name="search_field")
	private WebElement orgnamedd;
	
	@FindBy(name="search")
	private WebElement searchnowbtn;
	
	
	public WebElement getSearchtxtfield() {
		return searchtxtfield;
	}

	public WebElement getOrgnamedd() {
		return orgnamedd;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public WebElement getChooseorg() {
		return chooseorg;
	}
    public Orginfocontactwindow(WebDriver driver)
    {
    	this.driver = driver;
		PageFactory.initElements(driver, this);

}
    public void Organizationforcontact(String orgname,String text)
    {
    	
    	WebDriverUtil util=new WebDriverUtil(driver);
    	searchtxtfield.sendKeys(orgname);
    	util.selectValueFromDD2(text, orgnamedd);
    	searchnowbtn.click();
    	chooseorg.click();
    	
    }
}
