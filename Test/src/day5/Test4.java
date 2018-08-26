//Write a script to copy paste text from one text box to another
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/akalra/Downloads/Link2.html");
		
		WebElement txtBx1 = driver.findElement(By.id("a1"));
		WebElement txtBx2 = driver.findElement(By.id("a2"));

		txtBx1.sendKeys(Keys.CONTROL+"a");
		txtBx1.sendKeys(Keys.CONTROL+"x");	
		txtBx2.sendKeys(Keys.CONTROL+"v");
		
	}

}
