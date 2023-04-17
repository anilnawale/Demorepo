package test_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.xpath("//input[@type='text']"));
		ts.sendKeys("maven");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
			if(text.equals("maven dependency")) {
				list.get(i).click();
				break;
			}
			
		}
		
		driver.close();

	}

}
