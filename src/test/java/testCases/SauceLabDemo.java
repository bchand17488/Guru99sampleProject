package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabDemo {

	public static WebDriver driver;

	 public static final String USERNAME = "bchand1748";
	 public static final String ACCESS_KEY = "34d8513b-073b-4368-b79d-0a678e098458";
	 public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 7");
	    //caps.setCapability("version", "43.0");
	    driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://bbc.com");
	    driver.quit();
	
	}

}
