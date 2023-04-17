package test_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drp_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement box1=driver.findElement(By.id("box1"));
		WebElement box2=driver.findElement(By.id("box2"));
		WebElement box3=driver.findElement(By.id("box3"));
		WebElement box4=driver.findElement(By.id("box4"));
		WebElement box5=driver.findElement(By.id("box5"));
		WebElement box6=driver.findElement(By.id("box6"));
		WebElement box7=driver.findElement(By.id("box7"));
		
		WebElement box101=driver.findElement(By.id("box101"));
		WebElement box102=driver.findElement(By.id("box102"));
		WebElement box103=driver.findElement(By.id("box103"));
		WebElement box104=driver.findElement(By.id("box104"));
		WebElement box105=driver.findElement(By.id("box105"));
		WebElement box106=driver.findElement(By.id("box106"));
		WebElement box107=driver.findElement(By.id("box107"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(box1, box101).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box2, box102).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box3, box103).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box4, box104).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box5, box105).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box6, box106).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box7, box107).build().perform();
		
		Thread.sleep(5000);
		WebElement capitals=driver.findElement(By.id("capitals"));
		
		act.dragAndDrop(box1, capitals).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box2, capitals).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box3, capitals).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box4, capitals).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box5, capitals).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box6, capitals).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(box7, capitals).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
