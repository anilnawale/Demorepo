package test_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel=new Select(date);
		//sel.selectByValue("1");
		sel.selectByIndex(0);
		Thread.sleep(3000);
		
		WebElement mon=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1=new Select(mon);
		sel1.selectByIndex(0);
		Thread.sleep(3000);
		
		
		
		
		
		driver.close();
		
	}

}
