package test_dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement tr=driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		tr.click();
		Alert ts=driver.switchTo().alert();
		Actions act=new Actions(driver);
		act.sendKeys("anil");
		Thread.sleep(5000);
		driver.close();
		
	}

}
