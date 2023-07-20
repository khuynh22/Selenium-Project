package tests;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/khangnguyenhuynh/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles(); // parentWindowId and childWindowId will be stored here
		Iterator<String> it = windows.iterator();

		String parentId = it.next(); // gets the parentWindowId
		String childId = it.next(); // gets the childWindowId

		driver.switchTo().window(childId); // switch driver focus to childWindow
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.switchTo().window(parentId); // switch driver focus back to parentWindow
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

	}

}
