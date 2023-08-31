import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class SelProject implements WebDriver {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> Methods close
		// Firefox - FirefoxDriver -> Methods close
		// Safari - SafariDriver -> Methods close
		// WebDriver close get
		// WebDriver methods + class methods
		
		
		// Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.khang-nguyen-huynh.com/");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();
		driver1.quit();
		
//		// Microsoft Edge browser
//		System.setProperty("webdriver.gecko.driver", "/Users/khangnguyenhuynh/Desktop/Selenium/msedgedriver");
//		WebDriver driver3 = new EdgeDriver();
//		driver3.get("https://www.khang-nguyen-huynh.com/");
//		System.out.println(driver3.getTitle());
//		System.out.println(driver3.getCurrentUrl());
//		driver3.close();
//		driver3.quit();
//		
//		// Firefox browser
//		System.setProperty("webdriver.gecko.driver", "/Users/khangnguyenhuynh/Downloads/geckodriver");
//		WebDriver driver2 = new FirefoxDriver();
//		driver2.get("https://www.khang-nguyen-huynh.com/");
//		System.out.println(driver2.getTitle());
//		System.out.println(driver2.getCurrentUrl());
//		driver2.close();
//		driver2.quit();

	}

}
