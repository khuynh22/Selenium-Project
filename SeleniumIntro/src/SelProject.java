import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelProject implements WebDriver {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> Methods close
		// Firefox - FirefoxDriver -> Methods close
		// Safari - SafariDriver -> Methods close
		// WebDriver close get
		// WebDriver methods + class methods
		// chromeddriver.exe -> Chrome browser
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
//		WebDriver driver = new ChromeDriver();

		// Firefox Launch
		// geckodriver

		System.setProperty("webdriver.gecko.driver", "/Users/khangnguyenhuynh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.khang-nguyen-huynh.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
