import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hard_SoftAssertion {
	SoftAssert softAssert = new SoftAssert();

//HARD ASSERTION CODE
	@Test
	public void TestCase1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://tutorialsninja.com/demo/");
		String ActualTitle = driver1.getTitle();
		String ExpectedTitle = "Your Store";

		Assert.assertEquals(ActualTitle, ExpectedTitle);

		String actualPageUrl = driver1.getCurrentUrl();
		String expectedPageUrl = "https://tutorialsninja.com/demo/";

		Assert.assertEquals(actualPageUrl, expectedPageUrl);

		driver1.findElement(By.xpath("//input[@name='search']")).sendKeys("HP", Keys.ENTER);

		Assert.assertTrue(driver1.findElement(By.xpath("//a[text()='HP LP3065']")).isDisplayed());

		driver1.quit();

	}
}