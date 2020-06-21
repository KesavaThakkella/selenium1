package kesava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By
				.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/a[1]"))
				.click();
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);

		for (String child : allwindows) {

			if (!parent.equalsIgnoreCase(child))

				driver.switchTo().window(child);
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pavankalyanpictures");

		}

	}

}
