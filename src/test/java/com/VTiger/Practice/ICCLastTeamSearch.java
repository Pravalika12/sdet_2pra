package com.VTiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCLastTeamSearch {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	String lastname = driver.findElement(By.xpath("//span@class='u-hide-phablet'])[last]")).getText();
	System.out.println(lastname);
	
}
}
