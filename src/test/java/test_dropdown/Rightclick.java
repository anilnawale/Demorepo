package test_dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act =new Actions(driver);
		act.contextClick(ts).build().perform();
		Thread.sleep(3000);
		WebElement tr=driver.findElement(By.xpath("//span[text()='Copy']"));
		Thread.sleep(3000);
		act.click(tr).build().perform();
		Thread.sleep(3000);
		Alert de=driver.switchTo().alert();
		Thread.sleep(3000);
		String g=de.getText();
		System.out.println("print="+g);
		Thread.sleep(3000);
		de.accept();
		driver.close();
		
		

	}

}
