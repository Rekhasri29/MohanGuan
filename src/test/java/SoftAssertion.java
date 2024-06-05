import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	SoftAssert softAssert = new SoftAssert();

//HARD ASSERTION CODE
	@Test
	public void TestCase1() {
		// SOFT ASSERTION CODE
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert softAssert = new SoftAssert();
		driver.get("https://tutorialsninja.com/demo/");
		String ActualTitle1 = driver.getTitle();
		String ExpectedTitle1 = "Your Store123";
		softAssert.assertEquals(ActualTitle1, ExpectedTitle1);

		String actualPageUrl1 = driver.getCurrentUrl();
		String expectedPageUrl1 = "https://tutorialsninja.com/demo/ER";

		softAssert.assertEquals(actualPageUrl1, expectedPageUrl1);

		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP", Keys.ENTER);

		softAssert.assertTrue(driver.findElement(By.xpath("//a[text()='HP LP3065']")).isDisplayed());

		softAssert.assertAll();
		

	}
}