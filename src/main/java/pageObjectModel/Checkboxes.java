package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkboxes {
	
	public WebDriver driver;
	
		//Constuctor
		public Checkboxes(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Instantiate WEbElement
		@FindBy(xpath = "//*[@id='checkboxes']/input[1]")
		public WebElement CheckboxOne;
		@FindBy(xpath = "//*[@id='checkboxes']/input[2]")
		public WebElement CheckboxTwo;
		
		
		//Method for clicking the Checkbox-One
		public void clickCheckboxOne() {
			CheckboxOne.click();
		}
		
		//Deselecting Checkbox-Two
		public void clickCheckboxTwo() {
			CheckboxTwo.click();
		}

}
