package theInternetTestNG;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.Checkboxes;
import pageObjectModel.Home;

public class CheckboxesTestNG {

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
		home.clickCheckboxes();

		Checkboxes checkboxes = new Checkboxes(driver);
		checkboxes.clickCheckboxOne();
		checkboxes.clickCheckboxTwo();
	}

	@After
	public void Result() {
		driver.close();
	}

}
