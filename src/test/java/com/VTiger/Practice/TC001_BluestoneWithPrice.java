package com.VTiger.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001_BluestoneWithPrice {
	
	public static void main(String args[]) throws InterruptedException
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
	driver.findElement(By.name("submit_search")).click();
	Thread.sleep(2000);
	Actions ac=new Actions(driver);
	WebElement price = driver.findElement(By.xpath("//span[@class='title style-fill i-right']"));
	ac.moveToElement(price).perform();
	driver.findElement(By.xpath("//span[@class='prcs-dlh'])[1]")).click();
	List<WebElement> all = driver.findElements(By.xpath("//a[@class='link-overlay']"));
	System.out.println(all.size());
	
//for(WebElement id:all)
//{
	//System.out.println(id.getText());
//	String actualtitle=driver.switchTo().window(null)
//	System.out.println(actualtitle);
//	if(actualtitle.contains(actualtitle))
//	{
//		break;
//	}
	}
}

	