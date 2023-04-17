package test_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement ts=driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		//ts.click();
		Select sel=new Select(ts);
		//sel.selectByIndex(3);
		sel.selectByValue("Android");
		Thread.sleep(3000);
		
		
	}

}
