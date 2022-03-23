package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice {

    String directoryApp;
    String app;

    public Android(String directoryApp,String app){
        this.directoryApp = directoryApp;
        this.app = app;
    }

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Camilo");
        capabilities.setCapability("platformVersion","9 PKQ1. 180729.001");
        capabilities.setCapability("appPackage",directoryApp);
        capabilities.setCapability("appActivity",app);
        capabilities.setCapability("platformName","Android");
        AppiumDriver appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return appiumDriver;
    }

}
