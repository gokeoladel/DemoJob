package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import library.Constants;

public class LoginPF { 
	WebDriver driver;

	public LoginPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='loginPanel']/form/div[1]/input")
	WebElement userid;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	By loginButton = By.xpath("//div[@id='loginPanel']/form/div[3]/input");

	public void loginToParaBank(String username, String passwrd) {
		userid.sendKeys(username);
		password.sendKeys(passwrd);

	}

	public void signInButton() {
		driver.findElement(loginButton).click();
	}

}
