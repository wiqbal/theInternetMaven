package theInternetTestNG;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import pageObjectModel.Home;
import pageObjectModel.JavaScriptAlert;

import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JavaScriptAlertTestNG {

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
		home.clickJavaScriptAlerts();

		JavaScriptAlert jsa = new JavaScriptAlert(driver);
		jsa.clickJSAlert();
		jsa.acceptAlert(driver);

	}

	@After
	public void Result() {
		driver.close();
	}

}
