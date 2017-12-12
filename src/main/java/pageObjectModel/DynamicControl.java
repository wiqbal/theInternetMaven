package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControl {
	WebDriver driver;

	public DynamicControl(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkbox")
	public WebElement Checkbox;
	@FindBy(xpath = "//*[@id='btn']")
	public WebElement Remove;

	public void clickCheckbox() {
		Checkbox.click();
	}

	public void clickRemove() {
		Remove.click();
	}

}
