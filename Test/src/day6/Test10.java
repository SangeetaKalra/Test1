//Write a script to make sure a text box has no value
package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Downloads/Link2.html");
		WebElement TxtBx2 = driver.findElement(By.id("a2"));
		String txtBxVal = driver.findElement(By.id("a2")).getAttribute("value");
		if (txtBxVal.length()==0) {
			System.out.println("No value");
} 	else {
		System.out.println("Value present");
}
		driver.close();
	}

}
