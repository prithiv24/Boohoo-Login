package UserRegistrationTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegistrationPage {

	static WebDriver driver;
	/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.boohoo.com/");

		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

		WebElement clickAccount = driver.findElement(By.xpath("//div[@class='b-header_login']"));
		clickAccount.click();*/
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.boohoo.com/");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		WebElement clickAccount = driver.findElement(By.xpath("//div[@class='b-header_login']"));
		clickAccount.click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@Test
	public void registrationPageTest() {
		
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("123");

	}
	//@AfterClass
//	public void tearDown() {
//		driver.close();
	//}

}
