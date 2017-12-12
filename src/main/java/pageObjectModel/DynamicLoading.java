package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading {

	WebDriver driver;

	public DynamicLoading(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='content']/div/a[1]")
	public WebElement Example1;

	public void clickExample1() {
		Example1.click();
	}

}
