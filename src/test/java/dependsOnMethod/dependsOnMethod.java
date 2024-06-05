package dependsOnMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependsOnMethod {
	WebDriver driver;
	
	@Test(priority=1)
	public void verifyUserAbleToLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("mohangunanithieee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
	}

	
	@Test (dependsOnMethods= {"verifyUserAbleToLogin"})
	public void VerifyUserAbleToSearchProduct() {
		
		driver.findElement(By.name("search")).sendKeys("hp",Keys.ENTER);
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement wishListElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("wish list")));
		wishListElement.click();
		Assert.assertTrue(driver.getTitle().equals("My Wish List"));
	}
	
	
	@Test(dependsOnMethods= {"verifyUserAbleToLogin","VerifyUserAbleToSearchProduct"} , alwaysRun=true)
	public void removeTheItemFromCart() {
		driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id,'content')]")).getText().contains("Your wish list is empty."));
	}
	
	
}
