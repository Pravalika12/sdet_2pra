package com.VTiger.POMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericutil.FileUtil;

public class LoginPage {
	WebDriver driver;

	@FindBy(name="user_name")
	private WebElement username;

	@FindBy(name="user_password")
	private WebElement userpassword;

	@FindBy(id="submitButton")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getLogin() {
		return login;
	}

	public LoginPage(WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Rule 6
	//login credentials
	public void loginToApp() throws IOException
	{
		getUsername().sendKeys(FileUtil.objforFileUtil().readDataFromPropfile("username"));
		getUserpassword().sendKeys(FileUtil.objforFileUtil().readDataFromPropfile("password"));
		login.click();
	}

	//
}







