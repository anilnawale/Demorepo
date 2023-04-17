package test_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement rt=driver.findElement(By.id("icp-nav-flyout"));
		Actions act=new Actions(driver);
		act.click(rt).build().perform();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-row a-spacing-mini']"));
		System.out.println("list name="+list);
		int a=list.size();
		System.out.println(a);
		Select sel=new Select(rt);
		sel.selectByValue("मराठी - MR - भाषांतर");
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
	}

}
