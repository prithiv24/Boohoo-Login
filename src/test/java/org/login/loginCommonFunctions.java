package org.login;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginCommonFunctions {
	public static WebDriver driver;
	public static Select select;
	public static Actions action;
	public static Robot robot;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void fireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void pageLoadOutTime() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void implicityTimeOuts() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void enterUrl(String url) {
		driver.get(url);
	}

	public static void enterValues(WebElement element,String text) {
		element.sendKeys(text);
	}

	public static  void buttonClick(WebElement element) {
		element.click();
	}
}
