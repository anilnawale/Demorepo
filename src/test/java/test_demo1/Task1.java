package test_demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.id("promtButton"));
		ts.click();
		Thread.sleep(3000);
		Alert rt=driver.switchTo().alert();
		rt.sendKeys("Bug");
		
		Thread.sleep(5000);
		rt.accept();
		System.out.println("task end");
		

	}

}
