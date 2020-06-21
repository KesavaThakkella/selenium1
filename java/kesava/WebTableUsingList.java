package kesava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableUsingList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/sql/sql_update.asp");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * String value =
		 * driver.findElement(By.xpath("(//table)/tbody/tr[2]/td[6]")).getText()
		 * ; System.out.println(value);
		 */
	}

}
