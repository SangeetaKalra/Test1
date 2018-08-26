package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement txtBx = driver.findElement(By.xpath("//input[@name='userName']"));
		Dimension s1 = txtBx.getSize();
		System.out.println(s1.height);
		System.out.println(s1.width);
		WebElement pwdTxtBx = driver.findElement(By.xpath("//input[@name='password']"));
		Dimension s2 = pwdTxtBx.getSize();
		System.out.println(s2.height);
		System.out.println(s2.width);
		if((s1.height==s2.height)&&(s1.width==s2.width)){
			System.out.println("Dimensions are same");
		}else {
			System.out.println("Dimensions are not same");
		}
		
		

	}
}
