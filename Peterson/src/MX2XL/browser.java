package MX2XL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static WebDriver driver;
	public static WebDriver invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Peterson\\browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
