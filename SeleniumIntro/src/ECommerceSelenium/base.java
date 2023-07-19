package ECommerceSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		//expected checking Array
		String[] items = {"Cucumber", "Brocolli", "Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			List itemsList = Arrays.asList(items);
			if (itemsList.contains(name)) {
				// click on "ADD TO CART"
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}

	}

}
