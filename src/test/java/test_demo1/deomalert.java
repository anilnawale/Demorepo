package test_demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deomalert {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.id("alertButton"));
		ts.click();
		Alert fr=driver.switchTo().alert();
		String g=fr.getText();
		Thread.sleep(3000);
		System.out.println("print= "+g);
		fr.accept();
		Thread.sleep(3000);
		driver.close();

	}

}
