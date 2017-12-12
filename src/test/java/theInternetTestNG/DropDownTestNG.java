package theInternetTestNG;

import java.util.concurrent.TimeUnit;

//import org.junit.After;





import org.junit.After;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.DropDown;
import pageObjectModel.Home;

public class DropDownTestNG {
	WebDriver driver;

	@BeforeClass
	public void pathConnection() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
	}

	@Test
	public void Navigate() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
	}

	@Test
	public void test() {

		Home home = new Home(driver);
		home.clickDropdown();

		DropDown dd = new DropDown(driver);
		dd.clickDropDown();
		dd.selectOption(driver);
	}

	@After
	public void Result() {
		driver.close();
	}

}
