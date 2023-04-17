package test_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.xpath("//input[@type='text']"));
		ts.sendKeys("maven");
		Thread.sleep(3000);
		WebElement tr=driver.findElement(By.xpath("(//div[@class='pcTkSc'])[3]"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.click(tr).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
