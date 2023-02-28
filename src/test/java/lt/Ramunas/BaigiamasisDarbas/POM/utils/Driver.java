package lt.Ramunas.BaigiamasisDarbas.POM.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--force-device-scale-factor=0.75");
        driverThread.set(new ChromeDriver(chromeOptions));
        driverThread.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driverThread.get();
    }

    public static void closeDriver() {
        driverThread.get().quit();
        driverThread.remove();
    }
}
