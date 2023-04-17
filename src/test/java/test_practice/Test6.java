package test_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		wb.sendKeys("maven");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		int a=list.size();
		System.out.println("print no="+a);
		Thread.sleep(3000);

		for(int i=0;i<=list.size();i++) {
			String b=list.get(i).getText();
			System.out.println("print value " +b);
			if(b.equalsIgnoreCase("maven dependency")) {
				
				list.get(i).click();
				break;
			}
		}


		Thread.sleep(3000);
		
	
		System.out.println("execution completed");
		Thread.sleep(3000);
		driver.close();
	}

}
