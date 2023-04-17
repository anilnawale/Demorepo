package test_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movedemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.id("nav-link-accountList"));
		Actions act=new Actions(driver);
		act.moveToElement(ts).build().perform();
		Thread.sleep(3000);
		WebElement tr=driver.findElement(By.linkText("Your Account"));
		act.click(tr).build().perform();
		driver.close();
		

	}

}
