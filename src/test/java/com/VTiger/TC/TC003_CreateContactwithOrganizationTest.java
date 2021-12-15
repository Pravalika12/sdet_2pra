package com.VTiger.TC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
				
				
				Createcontactinfo cci=new Createcontactinfo(driver);
				cci.getCreatecontactlink().click();
				String firstname=JavaUtil.objJavaUtil().getfirstName();
				String lastname=JavaUtil.objJavaUtil().getlastName();
				cci.createcontact(firstname, lastname, "Mrs.");
				
				Orginfocontactwindow ccw=new Orginfocontactwindow(driver);
				ccw.Organizationforcontact("sdeterr","Organization name");
				WebDriverUtil util=new WebDriverUtil(driver);
				util.switchToWindow("contacts");
				cci.getPlusbutton().click();
				
				hp.getContactslink().click();
				ci.searchforcontact(lastname, "Last name");
				
	//validating contact
String text=driver.findElement(By.xpath("//a[text()='"+lastname+"' and @title='Contacts']")).getText();
Assert.assertEquals(lastname,text);
//	driver.findElement(By.className("txtBox")).sendKeys("ramya");	
//	WebElement dd4 = driver.findElement(By.id("bas_searchfield"));
//	Select s4=new Select(dd4);
//	s4.selectByVisibleText("Organization Name");
//	driver.findElement(By.name("button")).click();
//String orgname=driver.findElement(By.xpath("//a[text()='sdtest1']")).getText();
//	Assert.assertEquals(orgname,"sdtest1");
//	if(orgname.equalsIgnoreCase("sdtest1"))
//	{
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail"); 
//		
//}
	}
	@Test(groups="smokeTest",retryAnalyzer=com.VTiger.genericutil.RetryAnalyzer.class)
	public void createContactwithLastname() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		ContactInfo ci=new ContactInfo(driver);
		
		
		Createcontactinfo cci=new Createcontactinfo(driver);cci.getCreatecontactlink().click();
		String lastname=JavaUtil.objJavaUtil().getlastName();
		cci.createcontactwithln(lastname);
		hp.getContactslink().click();
		ci.searchforcontact(lastname, "Last name");
		
//validating contact
String text=driver.findElement(By.xpath("//a[text()='"+lastname+"' and @title='Contacts']")).getText();
Assert.assertEquals(lastname,text);
//		driver.findElement(By.xpath("//input[@title='save[Alt+S]']")).click();
//		//validating contact
//		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		driver.findElement(By.className("txtBox")).sendKeys("ramya");	
//		WebElement dd4 = driver.findElement(By.id("bas_searchfield"));
//		Select s4=new Select(dd4);
//		s4.selectByVisibleText("Contact Id");
//		driver.findElement(By.name("button")).click();
//		String orgname=driver.findElement(By.xpath("//a[text()='sdtest4']")).getText();
//		Assert.assertEquals(orgname,"sdtest4");
//		if(orgname.equalsIgnoreCase("sdtest1"))
//		{
//			System.out.println("pass");
//		}
//		
//		else
//		{
//		System.out.println("fail"); 
//		}
	}
}

