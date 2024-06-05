package fox;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCommands {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().window().minimize();
		driver.get("https://omayo.blogspot.com/");
		// driver.findElement(By.id("alert1")).click();
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		String classValue = search.getAttribute("class");
		String titleValue = search.getAttribute("title");
		String typeValue = search.getAttribute("type");
		String AttributeValue = search.getAttribute("value");
		System.out.println(classValue);
		System.out.println(titleValue);
		System.out.println(AttributeValue);
		System.out.println(typeValue);

		Boolean isSelected = driver.findElement(By.id("checkbox2")).isSelected();
		if (isSelected) {
			System.out.println("Button is selected");
		} else {
			System.out.println("Button is not selected state");
		}

		driver.navigate().to("https://chatgpt.com/c/c5d49877-ff93-458e-9195-2ea84aa9aea4");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String ps = driver.getPageSource();
		System.out.println(ps);

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("mohangunanithieee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mohan@1989");
		driver.findElement(By.id("input-password")).submit();

		WebElement tagName = driver.findElement(By.id("input-password"));
		String tagName1 = tagName.getTagName();
		System.out.println(tagName1);

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.id("input-telephone")).submit();

		String cssValue = driver.findElement(By.xpath("//label[text()='First Name']")).getCssValue("max-width");
		System.out.println(cssValue);

		Dimension getSize = driver.findElement(By.xpath("//label[text()='First Name']")).getSize();
		System.out.println("The Height " + getSize.height);
		System.out.println("The Width " + getSize.width);

		Point getLocation = driver.findElement(By.xpath("//label[text()='First Name']")).getLocation();
		System.out.println("The x axis "+ getLocation.x);
		System.out.println("The Y axis "+ getLocation.y);
		
		Rectangle rect = driver.findElement(By.xpath("//label[text()='First Name']")).getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		driver.manage().window().fullscreen();
		
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		
		String simpleName = driver.getClass().getSimpleName();
		System.out.println(simpleName);
	}

}
