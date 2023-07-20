package tests;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.xpath("//span[contains(text(),' User')]")).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webdwait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText().contains("Okay"));
		alert.accept();

	}

}
