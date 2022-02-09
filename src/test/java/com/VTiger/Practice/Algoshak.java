package com.VTiger.Practice;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Algoshak {
public static void main(String[] args) throws IOException {
//	FileInputStream fis=new FileInputStream("./excelpath");
//	Workbook wb=WorkbookFactory.create(fis);
//
//	String a=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
//	String b=wb.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
//	String c=wb.getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitWait(Duration.ofseconds);
//	driver.get("ABC.com");
//	driver.findElement(By.id("username")).sendKeys("pra");
//	driver.findElement(By.id("password")).sendKeys("pra123");
//	driver.findElement(By.id("loginbutton")).click();
//	
//	driver.findElement(By.xpath("xletter")).sendKeys(a);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("yletter")).sendKeys(b);
//	driver.findElement(By.xpath("zletter")).sendKeys(c);
//	Thread.sleep(2000);
//	
//		Driver dref=new Driver();		
//		DriverManager.registerDriver(dref);
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
//		Statement stm=con.createStatement();
//		ResultSet	res=stm.executeQuery("select * from student");
//		while(res.next())
//		{
//			if(res.getString(2).equals("x"))
//			{
//				System.out.println("it is present inside the Data Base");				
//			}
//
//			else if(res.getString(2).equals("y"))
//			{
//				System.out.println("it is present inside the Data Base");				
//			}
//			else if(res.getString(2).equals("z"))
//			{
//				System.out.println("it is present inside the Data Base");				
//			}
//		}
//		con.close();
	//}
//	String s="amERTreTU";
//	for(char ch='A';ch<='Z';ch++)
//	{
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)==ch)
//			{
//				System.out.println(ch);
//			}
//		}
//	}
//	int a[]= {10,24,54,45,65};
//	int min=a[0];
//	int secmax=a[0];
//	for(int i=1;i<a.length;i++)
//	{
//		if(a[i]<min)
//		{
//			secmax=min;
//			min=a[i];
//		}
//		else if(a[i]<secmax)
//		{
//			secmax=a[i];
//		}
//	}
//		System.out.println("max"+min);
//		System.out.println("second"+secmax);
	
	
//	String s1="test engineer";
//	char s2[]=s1.toCharArray();
//	for(char ch='A';ch<='Z';ch++)
//	{
//		int count=0;
//		for(int i=0;i<s2.length;i++)
//		{
//			if(s2[i]==ch)
//			{
//				count++;
//			}
//		}
//			if(count>0)
//			{
//				System.out.println("count"+count);
//			}
//		}
	}
}
