package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.net.MalformedURLException;
import java.net.URL;

import pageFactory.ElementLocators;

public class Day1 extends Base {

	//WebDriver driver;

/*	@BeforeTest

	public void setup() throws MalformedURLException {
		// use FF Driver
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}*/

	@Test

	public void login() throws IOException {

		setSacucelab();
		ElementLocators day1 = new ElementLocators(driver);
		day1.provideLoginInfo("mngr115814", "mYvymen");
		day1.clickLoginButton();
	}

	

	@Test
	public void verifyTitle() throws IOException {

		String expectedTitle = "Guru99 Bank Manager HomePage";
		String titleonwebpage = driver.getTitle();
		Assert.assertEquals(expectedTitle, titleonwebpage);

	}

	
	@AfterTest()
	public void teardown() { 
		driver.quit();
	}
}
