package org.sample;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	public static WebDriver driver;
	public static Select select;
	public static Actions action;
	public static Robot robot;

	public static void chromeBrowserObject() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
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
