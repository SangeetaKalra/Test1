//Write a script to display text of all the links present in the webpage.
package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Downloads/Link1.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());

		}
		driver.close();
	}

}
