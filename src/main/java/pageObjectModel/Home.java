package pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='content']/ul/li[5]/a")
	public WebElement Checkboxes;

	@FindBy(xpath = "//*[@id='content']/ul/li[2]/a")
	public WebElement Basic_Auth;

	@FindBy(xpath = "//*[@id='content']/ul/li[9]/a")
	public WebElement DropDown;

	@FindBy(xpath = "//*[@id='content']/ul/li[11]/a")
	private WebElement DynamicControl;

	@FindBy(xpath = "//*[@id='content']/ul/li[12]/a")
	public WebElement DynamicLoading;

	@FindBy(xpath = "//*[@id='content']/ul/li[17]/a")
	public WebElement ForgotPassword;

	@FindBy(xpath = "//*[@id='content']/ul/li[19]/a")
	public WebElement Frames;

	@FindBy(xpath = "//*[@id='content']/ul/li[22]/a")
	public WebElement Hovers;

	@FindBy(xpath = "//*[@id='content']/ul/li[25]/a")
	public WebElement JavaScriptAlerts;

	public void clickCheckboxes() {
		Checkboxes.click();
	}

	public void clickBasic_Auth() {
		Basic_Auth.click();
	}

	// For inserting Credentials into the pop-up window
	public void insertCred(String userName, String password) {
		String URL = "http://" + userName + ":" + password + "@"
				+ "the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
	}

	public void clickDropdown() {
		DropDown.click();
	}

	public void clickDynamicControl() {
		DynamicControl.click();
	}

	public void clickDynamicLoading() {
		DynamicLoading.click();
	}

	public void clickForgotPassowrd() {
		ForgotPassword.click();
	}

	public void clickFrames() {
		Frames.click();
	}

	public void clickHovers() {
		Hovers.click();
	}

	public void clickJavaScriptAlerts() {
		JavaScriptAlerts.click();
	}

}
