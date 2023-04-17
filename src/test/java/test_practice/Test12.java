package test_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 {
	
public static void main(String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=409d5faf79a87436f5a10b7b06513ed3");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	WebElement ts=driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(ts).build().perform();
	Thread.sleep(3000);
   
	driver.findElement(By.linkText("Kids")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	
	
	
	
	
	
	
	
}


}
