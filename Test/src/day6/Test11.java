//Write a script to find number of checkboxes in a web page.
package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Downloads/Link2.html");
	//Finds number of checkboxes
		
		List<WebElement> allChkBx = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count = allChkBx.size();
	System.out.println("Total number of checkbox = "+count);
	
	//To click on all the checkboxes present in the html page 
	
	for (int i = 0; i < count; i++) {
		Thread.sleep(2000);
		allChkBx.get(i).click();
		Thread.sleep(2000);
	}
	
	
	
	}

}
