//To get height and width of any webElement
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement unTxtBx = driver.findElement(By.xpath("//input[@id='email']"));
		Dimension s1 = unTxtBx.getSize();
		System.out.println(s1.getHeight());
		System.out.println(s1.width);
		
		WebElement pwdTxtBx = driver.findElement(By.xpath("//input[@id='pass']"));
		Dimension s2 = pwdTxtBx.getSize();
		System.out.println(s2.height);
		System.out.println(s2.width);
		
	}

}
