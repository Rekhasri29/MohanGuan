package enabled_disabled_Atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enabled_Attribute {
	
	@Test
	public void VerifyUserAbleToLoginWithValidCredentials() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("Mohangunanithieee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
	}

}
