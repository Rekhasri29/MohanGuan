package parametersinTestNG_Part11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithOutParamters {
	@Test

	public void verifyUserAbleToLoginWithValidCredentials() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("mohangunanithieee@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mohan@1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
	
	}
}
