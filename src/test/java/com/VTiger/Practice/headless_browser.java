package com.VTiger.Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_browser {
public static void main(String[] args) {
	//HtmlUnitDriver driver = new HtmlUnitDriver();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headers");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
}
}
