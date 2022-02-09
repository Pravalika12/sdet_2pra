package log4J;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class logToTest {
	public WebDriver driver;
	Logger log=Logger.getLogger(logToTest.class);
@BeforeSuite
public void connecttoDatabase()
{
	log.info("connect to database");
}
@BeforeClass
public void launchBrowser()
{
	log.info("open the browser");
	 driver=new ChromeDriver();
}
@Test
public void loginToapp()
{
	log.info("login");
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("12345");
	driver.findElement(By.id("submitButton")).click();
}
@AfterClass
public void closeBrowser()
{
	log.info("close the browser");
	driver.close();
}
@AfterSuite()
public void closeTheConnection()
{
	log.info("close the connection");
}

}
