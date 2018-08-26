//Write a code to print a value present in the text box
package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proj {

	public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.get("file:///C:/Users/akalra/Downloads/Link2.html");
  WebElement txtBx1 = driver.findElement(By.id("a1"));
  String txtBx1Val = txtBx1.getAttribute("value");
  System.out.println(txtBx1Val);
 	}

}
