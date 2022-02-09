package com.VTiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lenskartsymbolmouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement lens = driver.findElement(By.xpath("//img[@alt='Lenskart']"));
		ac.moveToElement(lens).perform();
		System.out.println(lens.getAttribute("title"));
}
}
