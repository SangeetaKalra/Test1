//Write a script to write x and y coordinates of any webElement 
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement unTxtBx = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pwdTxtBx = driver.findElement(By.xpath("//input[@id='pass']"));
		Point p1 = unTxtBx.getLocation();
		Point p2 = pwdTxtBx.getLocation();
		int y1 = p1.getY();
		int y2 = p2.getY();
		System.out.println("X-coordinate" +y1);
		System.out.println("Y-coordinate" +y2);
		if (y1==y2) {
			System.out.println("Y coordinates are same");
		}else {
			System.out.println("Y coordinates are not same");
		}
		
		driver.close();

	}

}
