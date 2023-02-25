package lt.Ramunas.BaigiamasisDarbas.POM.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    private void takeScreenshot() {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
            String directory = "./screenshots/";
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_SSS");
            File screenshotFinalFile = new File(
                    directory + dateTime.format(formatter) + "_screenshot_" + ".jpg"
            );

            FileUtils.copyFile(screenshotFile, screenshotFinalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
