package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	
	public static WebDriver launch(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}
	}
}
