package com.VTiger.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC002_BluestoneWithDelivery {
	@Test
	public void BDelivery() throws InterruptedException
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
	driver.findElement(By.name("submit_search")).click();
	Thread.sleep(2000);
	Actions ac=new Actions(driver);
	
	WebElement price = driver.findElement(By.id("Delivery Time-form"));
	ac.moveToElement(price).perform();
	 List<WebElement> count = driver.findElements(By.xpath("//span[@class='prcs-dlh']"));
	 
}
}
