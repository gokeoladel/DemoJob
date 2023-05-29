package pages;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import library.Constants;
import pageFactory.LoginPF;

public class Login_page {
	WebDriver driver;

	@Test
	public void case1() {
		LoginPF login = new LoginPF(driver);
		login.loginToParaBank(Constants.USERNAME, Constants.PASSWORD);	
		login.signInButton();
		
	//Verification by URL using assertion
		String actualUrl=Constants.EXPECTED_URL;
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);

//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

	@Before
	public void before() {
		driver = library.Browsers.launch("Chrome");
		driver.get(Constants.URL);
	}

	@After
	public void after() {
	//	driver.quit();
	}
	
	@Ignore
	public void case2() {
		LoginPF login = new LoginPF(driver);
		login.loginToParaBank(Constants.USERNAME, Constants.PASSWORD);	
		login.signInButton();
		
	//Verification by URL using assertion
		String actualUrl=Constants.EXPECTED_URL;
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	

}
