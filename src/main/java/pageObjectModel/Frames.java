package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {

	WebDriver driver;

	public Frames(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='content']/div/ul/li[2]/a")
	public WebElement iFrame;

	public void clickIFrame() {
		iFrame.click();
	}
}
