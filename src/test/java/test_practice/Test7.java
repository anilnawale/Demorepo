package test_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		WebElement box1=driver.findElement(By.id("box1"));
		WebElement box101=driver.findElement(By.id("box101"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(box1).build().perform();
		Thread.sleep(5000);
		act.release(box1).build().perform();
		
		Thread.sleep(5000);
		act.dragAndDrop(box1, box101).build().perform();
		Thread.sleep(3000);
		driver.close();

	}

}
