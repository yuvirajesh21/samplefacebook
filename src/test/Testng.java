import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {

	WebDriver driver;

	@BeforeClass
	private void baseclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\radha\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	private void afterclass() {
		java.util.Date date = new java.util.Date();
		System.out.println(date);

	}

	@BeforeMethod
	private void beforemethod() {
		java.util.Date date = new java.util.Date();
		System.out.println(date);

	}

	@Test
	private void login() {
		driver.findElement(By.id("username")).sendKeys("Krishnan5553");
		driver.findElement(By.id("password")).sendKeys("7598249359");
		driver.findElement(By.id("login")).click();

	}

}
