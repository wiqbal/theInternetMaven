package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='email']")
	public WebElement Email;
	@FindBy(xpath = "//*[@id='form_submit']")
	public WebElement RetrievePassword;

	public void clickEmail() {
		Email.click();
	}

	public void insertEmail(String userEmail) {
		Email.sendKeys(userEmail);
	}

	public void clickRetrievePassword() {
		RetrievePassword.click();
	}
}
