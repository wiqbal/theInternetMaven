package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlert {

	WebDriver driver;

	public JavaScriptAlert(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='content']/div/ul/li[1]/button")
	public WebElement JSAlert;

	public void clickJSAlert() {
		JSAlert.click();
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

}
