//Write a script to close only child browsers
package day6;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String mTitle = driver.getTitle()	;
		Set<String> allWh = driver.getWindowHandles();
		for (String wh : allWh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if (mTitle.equalsIgnoreCase(title)) {
				System.out.println("The title of main browser = " +mTitle);
			}
			else {
				System.out.println("The title of child browser is = " +title);
				driver.close();

			}
		}
	}

}
