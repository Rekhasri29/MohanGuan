package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PauseExecutionInSelenium {
	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.get("www.tutorialsninja.com/demo/index.php?route=account/login");
			synchronized(driver){
				driver.wait(10000);
			}
			
			driver.findElement(By.id("input-email")).sendKeys("Mohan@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Mohan@34");

		}
	

}
