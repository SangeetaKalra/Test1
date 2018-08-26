//Write a script to close all the browsers including child browsers without using quit() method
package day6;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> allWh = driver.getWindowHandles();
		int count = allWh.size();
		System.out.println("Total number of browsers: " +count);
		for (String wh : allWh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}

}
