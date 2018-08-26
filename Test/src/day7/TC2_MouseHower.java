package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC2_MouseHower {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ejazah.com/");
		WebElement ele=driver.findElement(By.xpath("//h4[contains(@class, 'txt hidden-xs') and text()='Things To Do']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}

}
