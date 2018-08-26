//Write a script to print all the text
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Documents/Link1.html");
		String link1Txt = driver.findElement(By.id("i1")).getText();
		String link2Txt = driver.findElement(By.id("i2")).getText();
		String link3Txt = driver.findElement(By.id("i3")).getText();
		String link4Txt = driver.findElement(By.id("i4")).getText();
		System.out.println(link1Txt);
		System.out.println(link2Txt);
		System.out.println(link3Txt);
		System.out.println(link4Txt);


	}

}
