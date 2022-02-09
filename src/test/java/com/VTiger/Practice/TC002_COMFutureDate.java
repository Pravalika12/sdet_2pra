package com.VTiger.Practice;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC002_COMFutureDate {
	public static void main(String[] args) throws InterruptedException {
		Date d1=new Date();
		String todaysdate=d1.toString();
		String[] arr=todaysdate.split(" ");
		//Tue Dec 21 11:39:42 IST 2021
		//Tue Dec 21 2021
		String day=arr[0];
		String month=arr[1];
		String date=arr[2];
		String year=arr[5];
		String currentdate=day+" "+month+" "+date+" "+year;
		System.out.println(currentdate);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(currentdate));
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		//driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Actions ac=new Actions(driver);
		
		ac.moveByOffset(10, 10).click();
		driver.findElement(By.id("fromCity")).sendKeys("HYD");
		driver.findElement(By.xpath("//div[.='HYD']")).click();
		driver.findElement(By.xpath("//p[@class='font12 greyText appendBottom3']")).click();
		driver.findElement(By.id("toCity")).sendKeys("DEL");
		driver.findElement(By.xpath("//div[.='DEL']")).click();
		driver.findElement(By.xpath("//p[@class='pushRight font14 lightGreyText latoBold]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class= 'latoBold appendBottom10']")).click();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		//driver.findElement(By.xpath("//div[@aria-label='Tue Dec 21 2021']")).click();
		for(int i=0;i<11;i++)
		{
			try {
				driver.findElement(By.xpath("//p[@aria-label='Fri Apr 01 2022']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//p[@aria-label='Next Month']")).click();
			}
		}
	}
}
