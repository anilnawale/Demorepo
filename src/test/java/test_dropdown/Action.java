package test_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://example.testproject.io/web/");
		driver.findElement(By.id("name")).sendKeys("anil");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.id("login"));
		Actions act =new Actions(driver);
		act.click(login).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
