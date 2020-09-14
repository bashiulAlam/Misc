/**
 * Created by Sabab on 2/28/2017.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class testClass {

    AndroidDriver androidDriver;

    @Parameters({ "deviceName_", "URL_" })
    @BeforeTest
    public void setUp(String deviceName_, String URL_) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName_);

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        capabilities.setCapability(CapabilityType.VERSION, "6.0.1");

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("appPackage", "com.konai.konamoney");

        capabilities.setCapability("appActivity", "com.konai.konamoney.ui.splash.SplashActivity");

        try {
            //androidDriver = new AndroidDriver(new URL("http://127.0.0.2:3456/wd/hub"), capabilities);
            androidDriver = new AndroidDriver(new URL("http://" + URL_), capabilities);
        } catch (MalformedURLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
