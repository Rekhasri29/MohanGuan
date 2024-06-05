import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_True {

	@Test
	public void MethodTwo() {
		String s1 = "Hello my name is mohan gunanithi";
		Assert.assertTrue(s1.contains("Hello"));
	}

	@Test
	public void searchHpLaptop() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");

		 if(driver.findElement(By.xpath("//a[text()='MacBook']")).isDisplayed()) {
		 Assert.fail("Mac book shouls not be displayed");
		 }

	//	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Hp", Keys.ENTER);

	//	WebElement searchResult = driver.findElement(By.linkText("HP LP3065"));

	//	Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	//}
	}
}
