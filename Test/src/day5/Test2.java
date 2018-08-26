//WAP to clear the contents of a text box without using .clear method 
package day5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Downloads/Link2.html");
		WebElement txtBx1 = driver.findElement(By.id("a1"));
		int count = txtBx1.getAttribute("value").length();
		for (int i = 0; i < count; i++) {
			txtBx1.sendKeys(Keys.BACK_SPACE);
		}
		
		
		
	}
	

}
