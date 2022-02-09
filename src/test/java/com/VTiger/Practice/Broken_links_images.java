package com.VTiger.Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_links_images {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com");
	List<WebElement> links = driver.findElements(By.tagName("img"));
	System.out.println("total links"+links.size());
	for(int i=0;i<links.size();i++)
	{
		WebElement ele=links.get(i);
		String url=ele.getAttribute("src");
		verifyLinkActive(url);
	}
}
public static void verifyLinkActive(String linkUrl) throws IOException
{
	URL url=new URL(linkUrl);
	HttpURLConnection httpUrlconnect = (HttpURLConnection)url.openConnection();
	httpUrlconnect.connect();
	if(httpUrlconnect.getResponseCode()==200)
	{
		System.out.println(linkUrl+""+httpUrlconnect.getResponseMessage());
	}
	else if(httpUrlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{
		System.out.println(linkUrl+"........"+httpUrlconnect.getResponseMessage()+"........");
	}
}
}
