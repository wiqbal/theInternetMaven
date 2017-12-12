package theInternetTestNG;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import pageObjectModel.Frame_Next;
import pageObjectModel.Frames;
import pageObjectModel.Home;

import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FramesTestNG {

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
		home.clickFrames();

		Frames frame = new Frames(driver);
		frame.clickIFrame();

		Frame_Next fn = new Frame_Next(driver);
		fn.clickFile();
		fn.clickDocument();
		fn.insertText("The Text Goes Here");
	}

	@After
	public void Result() {
		driver.close();
	}

}
