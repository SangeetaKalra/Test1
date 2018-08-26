package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChoosePlace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ejazah.com/");
		driver.findElement(By.xpath("//h4[contains(@class, 'txt hidden-xs') and text()='Things To Do']")).click();
		driver.findElement(By.xpath("//input[@type='text'] [@id='viator_location_search']")).sendKeys("Budapest");
		driver.findElement(By.xpath("//a[contains(@class, 'btn btn-success tours btn-search w-100 text-center')]")).click();

	}

}
