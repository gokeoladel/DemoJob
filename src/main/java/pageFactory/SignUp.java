package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.Constants;

public class SignUp {
	WebDriver driver;

	public SignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='customer.firstName']")
	WebElement firstname;

	@FindBy(id = "customer.lastName")
	WebElement lastname;
	@FindBy(id = "customer.address.street")
	WebElement address;
	@FindBy(id = "customer.address.city")
	WebElement city;
	@FindBy(id = "customer.address.state")
	WebElement zipcode;
	@FindBy(id = "customer.address.zipCode")
	WebElement state;
	@FindBy(id = "customer.phoneNumber")
	WebElement phone;
	@FindBy(id = "customer.ssn")
	WebElement ssn;
	@FindBy(id = "customer.username")
	WebElement username;
	@FindBy(id = "customer.password")
	WebElement password;
	@FindBy(id = "repeatedPassword")
	WebElement repeatedPassword;

//By Method
	By signUpButton = By.xpath("//div[@id='loginPanel']/p[2]/a");
	By submitButton = By.xpath("//form[@id='customerForm']/table/tbody/tr[13]/td[2]/input");

	public void signUptoParaBank(String FirstName, String LastName, String Address, String City, String State,
			String ZipCode, String Phone, String SSN, String Username, String Password, String Confirm) {

		firstname.sendKeys(FirstName);
		lastname.sendKeys(LastName);
		address.sendKeys(Address);
		city.sendKeys(City);
		state.sendKeys(State);
		zipcode.sendKeys(ZipCode);
		phone.sendKeys(Phone);
		ssn.sendKeys(SSN);
		username.sendKeys(Username);
		password.sendKeys(Password);
		repeatedPassword.sendKeys(Confirm);
	}

	public void clickOnregisterButton() {
		driver.findElement(signUpButton).click();
	}

	public void clickOnSubmitButton() {
		driver.findElement(submitButton).click();
	}

}
