//Write a script Print the contents of all the cells in the table 
package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akalra/Downloads/Table.html");
		List<WebElement> allCells = driver.findElements(By.xpath("//td"));
		
		for (int i = 0; i < allCells.size(); i++) {
			
			System.out.println(allCells.get(i).getText());
		}
		
		
	}

}
