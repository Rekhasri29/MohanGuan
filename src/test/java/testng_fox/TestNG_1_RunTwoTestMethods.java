package testng_fox;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_1_RunTwoTestMethods {

	@Test(priority=1)
	public void verifyLoginWithValidCredentials() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mohangunanithieee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		driver.quit();
		}
		
		@Test (priority=2)
		public void verifyLoginWithInValidCredentials() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys(generateEmailTimeStamp());
			driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		}
		
		public String generateEmailTimeStamp() {
			Date date = new Date();
			return date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";			
		}

}
