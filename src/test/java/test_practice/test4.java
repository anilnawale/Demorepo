package test_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		int a=list.size();
		System.out.println("print no."+a);
		Thread.sleep(3000);

	}

}
