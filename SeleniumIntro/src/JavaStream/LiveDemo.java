package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//capture all webElements into a list
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all WebElements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all WebElements into new (original) list
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price = elementsList.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		
	}
	
	private static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
}
