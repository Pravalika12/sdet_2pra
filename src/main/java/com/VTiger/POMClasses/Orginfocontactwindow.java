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
	
	@FindBy(name="search_field")
	private WebElement orgnamedd;
	
	@FindBy(name="search")
	private WebElement searchnowbtn;
	
	@FindBy(id="7")
	private WebElement chooseorg;
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
    	searchtxtfield.sendKeys(orgname);
    	WebDriverUtil util=new WebDriverUtil(driver);
    	util.selectValueFromDD(text, orgnamedd);
    	searchnowbtn.click();
    	chooseorg.click();
    	
    }
}
