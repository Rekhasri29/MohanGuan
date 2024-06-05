package parametersinTestNG_Part11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionalParamter {
	@Parameters({"url","username","password"})
	@Test
	public void verufyUserAbleToLogin(@Optional("https://tutorialsninja.com/demo/index.php?route=account/login")String URL,String un,String pw) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.id("input-email")).sendKeys(un);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
	}

}
