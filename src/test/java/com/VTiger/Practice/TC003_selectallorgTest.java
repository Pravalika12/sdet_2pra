package com.VTiger.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_selectallorgTest {
	public void orgClickAll()
	 {
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost:8888");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("12345");
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		   List<WebElement> chkbox= driver.findElements(By.xpath("//table[@class='lvt small']/tr[*]/td[1]/input"));
		  // System.out.println(orglist.size());
		   for(int i=3;i<=chkbox.size()+2;i++)
		   {
			   driver.findElement(By.xpath("//table[@class='lvt small']/tr[*]/td[1]/input")).click();
		   }
		   
}
}
