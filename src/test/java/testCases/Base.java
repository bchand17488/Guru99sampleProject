package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	static WebDriver driver;
    public static final String USERNAME = "bchand1748";
	public static final String ACCESS_KEY = "34d8513b-073b-4368-b79d-0a678e098458";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void setSacucelab() throws MalformedURLException {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "44.0");
		driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.demo.guru99.com/V4/");

	}
	
	
    
	
}
