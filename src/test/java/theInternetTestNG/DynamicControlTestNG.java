package theInternetTestNG;

import java.util.concurrent.TimeUnit;

import org.junit.After;



import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjectModel.DynamicControl;
import pageObjectModel.Home;

public class DynamicControlTestNG {

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
		home.clickDynamicControl();

		DynamicControl dc = new DynamicControl(driver);
		dc.clickCheckbox();
		dc.clickRemove();

	}

	@After
	public void Result() {
		driver.close();
	}

}
