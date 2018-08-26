//Write a script to verify if dimension of username or email text box and pwd text box are same
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

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
		if ((s1.height==s2.height)&&(s1.width==s2.width)) {
			System.out.println("Same dimension");
		} else {
			System.out.println("Dimension is not same");


		}
		
	}

}
