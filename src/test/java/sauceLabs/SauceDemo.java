package sauceLabs;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceDemo {

	public static final String USERNAME = "mohanasian2912";
	public static final String ACCESS_KEY = "0c968fec88274febaff1de8c8bdbc6bb";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "88.0");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https:google.com");
		driver.getTitle();
	}

}
