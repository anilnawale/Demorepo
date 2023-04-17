package test_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
  
		driver.get("https://www.google.com/");
		WebElement name=driver.findElement(By.xpath("// input[@class='gLFyf']"));
		name.sendKeys("punam");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	}

}
