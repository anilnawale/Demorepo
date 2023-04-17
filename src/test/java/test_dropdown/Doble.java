package test_dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doble {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		WebElement btn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);

		act.doubleClick(btn).build().perform();
		Thread.sleep(3000);
		Alert ts=driver.switchTo().alert();
		Thread.sleep(3000);
		String tr=ts.getText();
		System.out.println("print="+tr);
		Thread.sleep(3000);
		ts.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
