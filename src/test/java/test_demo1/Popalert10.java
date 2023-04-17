package test_demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popalert10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		WebElement btn=driver.findElement(By.id("alertButton"));
		btn.click();
		Thread.sleep(5000);
		Alert ts=driver.switchTo().alert();
		Thread.sleep(3000);
		String name=ts.getText();
		System.out.println("print value is = "+name);
		ts.accept();
		Thread.sleep(3000);
		System.out.println("Alert handle completed");
		driver.close();

	}

}
