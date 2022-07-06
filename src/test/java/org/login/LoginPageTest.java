package org.login;

import java.util.concurrent.TimeUnit;

import org.excelUtilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends LoginPojo {
	static	LoginPojo p;
	
	@Parameters({"browsername"})
	@BeforeClass
	public void setUp(String browsername) {
		System.out.println("Browser name is :"+browsername + "Thread id :"+ Thread.currentThread().getId());
		if (browsername.equalsIgnoreCase("chrome")) {
			chromeBrowser();
			windowMaximize();
			pageLoadOutTime();
			implicityTimeOuts();
			enterUrl("https://www.boohoo.com/");
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			fireFoxBrowser();
			windowMaximize();
			pageLoadOutTime();
			implicityTimeOuts();
		}
		else {
			edgeBrowser();
		}


	}
	@DataProvider
public Object [][] getLoginData() {
Object data[][]=ExcelUtil.getTestData("login");
return data;
}
	@Test(dataProvider="getLoginData" )
	private void loginTestCase(String Email, String Password, String Expected_Result) {
		
		p=new LoginPojo();
		
		buttonClick(p.getAcceptPopUp());
		buttonClick(p.getClickAccount());
	
		enterValues(p.getEmail(), Email);
		enterValues(p.getPassword(),Password);
		
		buttonClick(p.getLogin());
		String expected_Title="boohoo | Womens and Mens Clothes | Shop Online Fashion";
		String actual_Title=driver.getTitle();
		
		if (Expected_Result.equals("valid")) {
			if (expected_Title.equals(actual_Title)) {
				Assert.assertTrue(true);
				driver.findElement(By.xpath("//a[@class='b-account-signout']")).click();
				
			}
			else {
				Assert.assertTrue(false);
			}
			
		}
		else if (Expected_Result.equals("invalid")) {
			if (expected_Title.equals(actual_Title)) {
				Assert.assertTrue(false);
				
			}
			
		}
		
	}
	@AfterClass
	public void tearDown() {
driver.close();
	}
}
