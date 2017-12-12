package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame_Next {

	WebDriver driver;

	public Frame_Next(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='mceu_15-open']/span")
	public WebElement File;

	@FindBy(id = "mceu_32-text")
	public WebElement Document;

	@FindBy(xpath = "//*[@id='mce_0_ifr']")
	public WebElement TextBox;

	public void clickFile() {
		File.click();
	}

	public void clickDocument() {
		Document.click();
	}

	public void insertText(String Text) {
		TextBox.sendKeys(Text);
	}

}
