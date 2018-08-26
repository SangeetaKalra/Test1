//Write a script to 
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Downloads/Link2.html");
	String txtBxVal = driver.findElement(By.id("a1")).getAttribute("value");
	System.out.println(txtBxVal);
	Thread.sleep(1000);
	driver.findElement(By.id("a1")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("a1")).sendKeys("webdriver");
		
		
		
	}

}
