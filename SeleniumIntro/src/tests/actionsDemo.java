package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[id = 'nav-link-accountList']"))).build().perform();
	}

}
