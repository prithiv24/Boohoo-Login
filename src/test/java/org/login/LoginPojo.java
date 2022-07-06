package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends loginCommonFunctions {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement acceptPopUp;
	@FindBy(xpath="(//a[@class='b-header_login-icon b-header_button'])")
	private WebElement clickAccount;
	public WebElement getClickAccount() {
		return clickAccount;
	}
	@FindBy(xpath="(//input[@type='email'])[2]")
	@CacheLookup
	private WebElement email;
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement login;
	public WebElement getAcceptPopUp() {
		return acceptPopUp;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
}
