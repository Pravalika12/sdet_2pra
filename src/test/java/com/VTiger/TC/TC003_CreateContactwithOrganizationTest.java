package com.VTiger.TC;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClasses.ContactInfo;

import com.VTiger.POMClasses.Createcontactinfo;
import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.Orginfocontactwindow;
import com.VTiger.genericutil.Baseclass;
import com.VTiger.genericutil.JavaUtil;
import com.VTiger.genericutil.WebDriverUtil;

public class TC003_CreateContactwithOrganizationTest extends Baseclass{
	@Test(groups="regressionTest",retryAnalyzer=com.VTiger.genericutil.RetryAnalyzer.class)
	public void createContactWithnames() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		ContactInfo ci=new ContactInfo(driver);
		//ci.getCreatecontactlink().click();
		Createcontactinfo cci = new Createcontactinfo(driver);
		cci.getCreatecontactlink().click();
		WebDriverUtil util=new WebDriverUtil(driver);
		Orginfocontactwindow og=new Orginfocontactwindow(driver);

		String firstname=JavaUtil.objJavaUtil().getfirstName();
		String lastname=JavaUtil.objJavaUtil().getlastName();
		cci.createcontact(firstname, lastname, "Mrs.");
		cci.getPlusbutton().click();
		String parent = driver.getWindowHandle();
		util.switchToWindow("Accounts&action");
		og.getSearchtxtfield().sendKeys("sdeterr");
		og.getSelectorg().click();
		driver.switchTo().window(parent);
		//cci.getPlusbutton().click();


		///Orginfocontactwindow oicw=new Orginfocontactwindow(driver);
		//	oicw.Organizationforcontact("Lamar343","Organization Name");

		//	util.switchToWindow("contacts");


//		hp.getContactslink().click();
//		ci.searchforcontact(lastname, "Last name");
//
//		//validating contact
//		String text=driver.findElement(By.xpath("//a[text()='"+lastname+"' and @title='Contacts']")).getText();
//		Assert.assertEquals(lastname,text);
	}
	@Test(groups="smokeTest",retryAnalyzer=com.VTiger.genericutil.RetryAnalyzer.class)
	public void createContactwithLastname() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		ContactInfo ci=new ContactInfo(driver);
		Createcontactinfo cci=new Createcontactinfo(driver);
		cci.getCreatecontactlink().click();
		String lastname=JavaUtil.objJavaUtil().getlastName();
		WebDriverUtil util=new WebDriverUtil(driver);
		Orginfocontactwindow og=new Orginfocontactwindow(driver);
		cci.createcontactwithln(lastname);
		cci.getPlusbutton().click();
		String parent = driver.getWindowHandle();
		util.switchToWindow("Accounts&action");
		og.getSearchtxtfield().sendKeys("sdeterr");
		og.getSelectorg().click();
		driver.switchTo().window(parent);
		//cci.getPlusbutton().click();
		//hp.getContactslink().click();
		//ci.searchforcontact(lastname, "Last name");

		//validating contact
		//String text=driver.findElement(By.xpath("//a[text()='"+lastname+"' and @title='Contacts']")).getText();
	//	Assert.assertEquals(lastname,text);

	}
}

