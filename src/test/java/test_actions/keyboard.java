package test_actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(3000);
		act.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
