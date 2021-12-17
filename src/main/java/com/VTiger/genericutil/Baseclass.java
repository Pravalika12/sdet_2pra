package com.VTiger.genericutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.LoginPage;


public class Baseclass {

	public WebDriver driver;
	public static WebDriver sdriver;
	
	public LoginPage lp;
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void beforesuite()
	{
		System.out.println("connect to database");

	}
 //@Parameters("Browser")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void launchBrowser_url() throws IOException
	{
		
		FileUtil prop=  FileUtil.objforFileUtil();
		String browser = prop.readDataFromPropfile("browser");
		String browser1=System.getProperty("BROWSER");
		System.out.println(browser1);

		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{  
			driver=new SafariDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}


		//get Burl
		driver.get(FileUtil.objforFileUtil().readDataFromPropfile("url"));
		WebDriverUtil util=new WebDriverUtil(driver);
		util.windowMaximize();
		util.pageLoadTimeout();
		sdriver=driver;
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void loginToApp() throws IOException
	{
		lp=new LoginPage(driver);
		lp.loginToApp();

	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void logoutFromApp() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.logoutfromapp();
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void closeBrowser()
	{
		driver.close();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void disconnectFromDatabase()
	{
		System.out.println("disconnect from database");
	}
	
	public static void takescreenshot(String name) throws IOException
	{
		File srcfile=((TakesScreenshot) sdriver).getScreenshotAs(OutputType.FILE);
		
		String destfile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest=new File(destfile);
		FileUtils.copyFile(srcfile,finaldest);
	}
}

