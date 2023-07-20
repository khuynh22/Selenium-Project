package ECommerceSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();

		// expected checking Array
		String[] items = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItem(driver, items);
	}

	public static void addItem(WebDriver driver, String[] items) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText().split("-")[0].trim();
			List itemsList = Arrays.asList(items);
			if (itemsList.contains(name)) {
				j++;
				// click on "ADD TO CART"
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == items.length) {
					break;
				}
			}
		}
	}

}
