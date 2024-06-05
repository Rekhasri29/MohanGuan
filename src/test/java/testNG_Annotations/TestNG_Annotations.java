package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Annotations {

	WebDriver driver;

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@Test(priority = 1)
	public void VerifyUserAbleToLoginWithValidCredentials() {

	
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mohangunanithieee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@Test(priority = 2)
	public void VerifyUserUnableToLoginWithinInvalidUserNameAndValidPassword() {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mohanl.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver
				.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText(),
				"Warning: No match for E-Mail Address and/or Password.");
	}

	@Test(priority = 3)
	public void VerifyUserUnableToLoginWithValidUsernameAndInvalidPassword() {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mohangunanithieee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("moha");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver
				.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText(),
				"Warning: No match for E-Mail Address and/or Password.");

	}

	@Test(priority = 4)
	public void VerifyUserUnableToLoginWithBlankUsernameAndPassword() {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver
				.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText(),
				"Warning: No match for E-Mail Address and/or Password.");
	}

	@Test(priority = 5)
	public void VerifyUserUnableToLoginWithInvalidUserNameAndPassword() {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("er@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver
				.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText(),
				"Warning: No match for E-Mail Address and/or Password.");
	}
}
