package com.VTiger.TC;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClasses.CreateOrgPage;
import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.OrginfoPage;
import com.VTiger.genericutil.Baseclass;
import com.VTiger.genericutil.JavaUtil;
import com.VTiger.genericutil.WebDriverUtil;

public class TC002_CreateOrganizationWithDropdownTest extends Baseclass{
	@Test(groups="regressionTest",retryAnalyzer=com.VTiger.genericutil.RetryAnalyzer.class)
	public void createOrganizationWithDropdownTest() throws Throwable
	{

		HomePage hp=new HomePage(driver);
		//organization link
		hp.getOrglink().click();
		OrginfoPage oip=new OrginfoPage(driver);
		//create organization link
		oip.getCreateorglink().click();
		//create organization
		String orgname = JavaUtil.objJavaUtil().genericRandomNumber()+JavaUtil.objJavaUtil().getfullname();

		oip.getSearchintextfield();
		oip.getSearchfororgname();
		oip.getSaveorginfo();

		CreateOrgPage cop= new CreateOrgPage(driver);
		cop.getOrgnametextfield().sendKeys(orgname);
		//select dropdown
        cop.Accounttypedropdown("Sheet1", 1, "Analyst");
		cop.industrydropdown("Sheet1", 0, "Education");
		cop.ratingdropdown("Sheet1", 2,"Active");
		//save organization
		cop.getSavebutton().click();
      driver.navigate().refresh();
		Thread.sleep(2000);
		//again click on organization is created successfully
		hp.getOrglink().click();
    oip.getSearchintextfield().sendKeys(orgname);
    WebDriverUtil util = new WebDriverUtil(driver);
		util.selectValueFromDD2("Organization Name",oip.getSearchfororgname());
		//click on submit
		oip.getSaveorginfo().click();
		//validating data//a[@title='Organizations' and [text()='"+orgname+"']
		String val=driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+orgname+"']")).getText();
		
		Assert.assertEquals(val,orgname);
	}
}