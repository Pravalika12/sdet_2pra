package com.VTiger.genericutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenerImplementation.class)
public class ExtentReportfortc {

WebDriver driver;
static WebDriver sdriver;
@Test
public void getTitlefromfb()
{
	
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	sdriver=driver;
	driver.get("https://facebook.com");
	Assert.assertEquals(true, true);
}
@Test
public void getTitlefrommvn()
{

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	sdriver=driver;
	driver.get("https://facebook.com");
	Assert.assertEquals(false, true);
}
@Test
public void skipt()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	sdriver=driver;
	driver.get("https://facebook.com");
	throw new SkipException("IM skipping");	
}
public static String takescreenshot(String name) throws IOException
{
	File srcfile=((TakesScreenshot)sdriver).getScreenshotAs(OutputType.FILE);
	
	String destfile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
	File finaldest=new File(destfile);
	FileUtils.copyFile(srcfile,finaldest);
	
return destfile;

}
}
