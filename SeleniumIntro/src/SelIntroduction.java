import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction implements WebDriver{

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> Methods close
		// Firefox - FirefoxDriver -> Methods close
		// Safari - SafariDriver -> Methods close
		// WebDriver close get
		// WebDriver methods + class methods
		WebDriver driver = new ChromeDriver();
		driver.resetInputState();
	}

}
