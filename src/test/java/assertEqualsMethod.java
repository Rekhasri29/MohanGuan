import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertEqualsMethod {
	
	@Test
	public void TestCaseOne() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
