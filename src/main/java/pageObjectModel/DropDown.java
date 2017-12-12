package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;

public class DropDown {

	public WebDriver driver;

	public DropDown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "dropdown")
	public WebElement Options;

	@FindBy(xpath = "//*[@id='dropdown']/option[2]")
	public WebElement Option1;

	/*
	 * public DropDown(WebDriver driver){ this.driver = driver;
	 * PageFactory.initElements(driver, DropDown.class); }
	 */

	public void clickDropDown() {
		Options.click();
	}

	public void selectOption(WebDriver driver) {
		Select option = new Select(driver.findElement(By.id("dropdown")));
		option.selectByIndex(1);

	}

}
