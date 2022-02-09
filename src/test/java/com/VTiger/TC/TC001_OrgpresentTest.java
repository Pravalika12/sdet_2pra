package com.VTiger.TC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001_OrgpresentTest {
	@Test
 public void orgClickDelete()
 {
		WebDriver driver=new ChromeDriver();
		driver.get("https://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	   List<WebElement> orglist= driver.findElements(By.xpath("//table[@class='lvt small']/tr[*]/td[3]"));
	   System.out.println(orglist.size());
	   for(int i=1;i<=orglist.size();i++)
	   {
		   if(orglist.get(i).getText().equalsIgnoreCase("920Earline Gottlieb"))
		   {
			   System.out.println("org is present");
			   break;
		   }
		  
	   }
	   
 }
}
