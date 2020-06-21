package testnglistenerstakingscreenshotfailure;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		String url = "http://www.google.com";
		driver.get(url);

	}

	public void failed() {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:/Users/kesava/workspace/Selenium/FailedScreenshots"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
