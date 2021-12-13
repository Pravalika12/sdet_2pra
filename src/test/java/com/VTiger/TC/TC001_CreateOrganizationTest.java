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

public class TC001_CreateOrganizationTest extends Baseclass {

	@Test(groups="smokeTest" ,retryAnalyzer=com.VTiger.genericutil.RetryAnalyzer.class)
	public void createOrganizationTest() throws InterruptedException
	{

		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
		String orgname = JavaUtil.objJavaUtil().getfirstName()+JavaUtil.objJavaUtil().genericRandomNumber();
		System.out.println(orgname);
		//create organizations
		OrginfoPage oip = new OrginfoPage(driver);
		oip.getCreateorglink().click();

		CreateOrgPage cop= new CreateOrgPage(driver);
		cop.getOrgnametextfield().sendKeys(orgname);

		//save organization
		cop.getSavebutton().click();

		driver.navigate().refresh();
		Thread.sleep(2000);
		//again click on organization is created successfully
		hp.getOrglink().click();

		oip.getSearchintextfield().sendKeys(orgname);

		WebDriverUtil util = new WebDriverUtil(driver);
		util.selectValueFromDD("Organization Name",oip.getSearchfororgname());
		//select organization name
		oip.getSaveorginfo().click();
		//validating data
		String val=driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+orgname+"']")).getText();
		Assert.assertEquals(val,orgname);
		
//		if(val.equalsIgnoreCase(orgname))
//		{
//			System.out.println("pass");
//		}
//		{
//			System.out.println("fail"); 
//		}
//		Thread.sleep(2000);
//		
	}
	
	@Test(groups="regressionTest",retryAnalyzer=com.VTiger.genericutil.RetryAnalyzer.class)
	public void createOrganizationTestwithphonenumber() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
		String orgname = JavaUtil.objJavaUtil().getfirstName()+JavaUtil.objJavaUtil().genericRandomNumber();
		String phonenumber = JavaUtil.objJavaUtil().getPhonenumber();
		System.out.println(orgname);
		//create organizations
		OrginfoPage oip = new OrginfoPage(driver);
		oip.getCreateorglink().click();

		CreateOrgPage cop= new CreateOrgPage(driver);
		cop.getOrgnametextfield().sendKeys(orgname);
		cop.getPhonenumbertextfield().sendKeys(phonenumber);

		//save organization
		cop.getSavebutton().click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		hp.getOrglink().click();

		oip.getSearchintextfield().sendKeys(orgname);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.selectValueFromDD("Organization Name",oip.getSearchfororgname());
		//select organization name
		oip.getSaveorginfo().click();
		
		//validating data
		String val=driver.findElement(By.xpath("//a[@title='Organizations' and [text()='"+orgname+"']")).getText();
		Assert.assertEquals(val,orgname);
//		if(val.equalsIgnoreCase(orgname))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail"); 
//		}
//		
	
	}
}


