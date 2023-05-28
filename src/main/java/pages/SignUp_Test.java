package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import library.Constants;
import pageFactory.SignUp;

public class SignUp_Test {
	WebDriver driver;

	@Test
	public void testcase1() {

		SignUp reg = new SignUp(driver);
		reg.clickOnregisterButton();
		reg.signUptoParaBank(Constants.FIRSTNAME, Constants.LASTNAME, Constants.ADDRESS, Constants.CITY,
				Constants.STATE, Constants.ZIPCODE, Constants.PHONE, Constants.SSN, Constants.USERNAME,
				Constants.PASSWORD, Constants.CONFIRM);

		SignUp submit = new SignUp(driver);
		submit.clickOnSubmitButton();
	}

	@Before
	public void before() {
		driver = library.Browsers.launch("firefox");
		driver.get(Constants.URL);

//	Thread.sleep(2000);
		// driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr/td[2]")).click();

	}

	@After
	public void after() {
		driver.quit();
	}

}
