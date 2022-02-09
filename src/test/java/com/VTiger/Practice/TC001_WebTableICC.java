package com.VTiger.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_WebTableICC {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	String teamName="Australia";
	List<WebElement> teamnames=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	for(int i=1;i<=teamnames.size();i++)
	{
		String dd = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
		if(dd.equalsIgnoreCase(teamName))
		{
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText());
		}
	}
}
}
