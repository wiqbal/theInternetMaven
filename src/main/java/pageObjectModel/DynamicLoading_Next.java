package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading_Next {

	WebDriver driver;

	public DynamicLoading_Next(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='start']/button")
	public WebElement Start;

	public void clickStart() {
		Start.click();
	}

}
