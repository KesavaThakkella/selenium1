package kesava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.mercurytravels.co.in/";
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'No, thanks')]")).click();

		List<WebElement> tags1 = new ArrayList<WebElement>();

		tags1 = driver.findElements(By.tagName("a"));
		System.out.println(tags1.size());

		/*
		 * List<WebElement> tags = driver.findElements(By.tagName("input"));
		 * 
		 * System.out.println(tags.size());
		 */

		Set<Object> tag2 = new HashSet<Object>();
		/*
		 * 
		 * tag2 = driver.findElements(By.tagName("a"));
		 * System.out.println(tags1.size());
		 * 
		 */
		List<String> tag = new ArrayList<String>();
		tag.add("Kesava");
		tag.add("Nani");
		tag.add("Ruoendra");
		for (int i = 0; i < tag.size(); i++) {

			driver.findElement(By.xpath("//input[@id='holiday_category_id']")).sendKeys(tag.get(i));
		}

	}

}
