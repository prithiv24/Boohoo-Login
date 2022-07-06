package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.boohoo.com/");
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	driver.findElement(By.xpath("(//a[@class='b-header_login-icon b-header_button'])")).click();
	driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("prithiv.nov24@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Prithiv@24");
	driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	System.err.println(driver.getTitle());
}
}
