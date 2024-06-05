package headlessmode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-- headless");
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get(
				"https://www.google.com/search?q=what+is+selenium+webdriver&sca_esv=1a54e3a5b2edf263&sca_upv=1&sxsrf=ADLYWIJG8iyFMS4QgzQqeHXPoIk6fciP1Q%3A1717475790167&source=hp&ei=zpleZtfLBYjR2roP__Cs-Aw&iflsig=AL9hbdgAAAAAZl6n3rogcoc7jqcP-3CFjMgbpOrNPAE6&oq=What+is+selebium&gs_lp=Egdnd3Mtd2l6IhBXaGF0IGlzIHNlbGViaXVtKgIIADIHECMYsAIYJzINEAAYgAQYsQMYgwEYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDUi6G1AAWP8QcAB4AJABAJgBswGgAaUTqgEEMC4xNrgBA8gBAPgBAZgCEKAC_hPCAgoQIxiABBgnGIoFwgILEAAYgAQYkQIYigXCAgsQABiABBixAxiDAcICDhAAGIAEGLEDGIMBGIoFwgIOEC4YgAQYsQMYgwEYigXCAggQABiABBixA8ICChAAGIAEGBQYhwLCAgUQABiABMICDhAAGIAEGJECGMkDGIoFwgILEAAYgAQYkgMYigXCAgoQABiABBixAxgKwgIHEAAYgAQYCpgDAJIHBDAuMTagB76KAQ&sclient=gws-wiz");
		System.out.println("wORKING FINE");
	}

}
