package pageObjectModel;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hovers {

	public WebDriver driver;

	public Hovers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

		
	@FindBy(xpath = "//*[@id='content']/div/div[1]/img")
	public WebElement Image;

	@FindBy(xpath = "//*[@id='content']/div/div[1]/div/a")
	public WebElement ViewProfile;

	public void HoverImage(WebDriver driver) {
		WebElement element = Image;
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	public void clickViewProfile() {
		ViewProfile.click();
	}

}
