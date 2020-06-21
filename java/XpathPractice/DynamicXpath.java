package XpathPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import library.Utility;

public class DynamicXpath {

	/* https://classic.crmpro.com/index.html?e=1 */

	@Test
	public void xpathpractice() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of the test " + title);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@data-type='text' and @name='firstname']")).sendKeys("kesavasubash");
		Utility.capturescreenshot(driver, "firstname");
		driver.findElement(By.xpath("//input[@data-type='text' and @name='lastname']")).sendKeys("subash");
		Utility.capturescreenshot(driver, "lastname");
		driver.findElement(By.xpath("//input[@data-type='text' and @id='u_0_r']")).sendKeys("9951522573");
		Utility.capturescreenshot(driver, "phone_No");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("vishal");
		Utility.capturescreenshot(driver, "password");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// *******************Check Box Click*****X-Path*******************

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(day);
		select.selectByVisibleText("8");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("Apr");
		driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']")).click();
		Utility.capturescreenshot(driver, "Checkbox");

	}

}
