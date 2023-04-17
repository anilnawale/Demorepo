package test_demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demt {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement tr=driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		tr.click();
		Thread.sleep(3000);
		Alert ts=driver.switchTo().alert();
		ts.dismiss();
		Thread.sleep(3000);
		System.out.println("task is end");
		driver.close();

	}

}
