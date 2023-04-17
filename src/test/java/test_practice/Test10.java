package test_practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement ts=driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(ts).build().perform();
		driver.findElement(By.linkText("Your Account")).click();
		driver.navigate().back();
		WebElement rt=driver.findElement(By.id("icp-nav-flyout"));
	
		act.moveToElement(rt).build().perform();
		act.click(rt).build().perform();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[2]")).click();
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src=scr.getScreenshotAs(OutputType.FILE);
		DateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		Date date=new Date();
		String g="pho1";
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\"+g + dateformat.format(date)+" .jpg"));
		
		driver.close();
		

	}

}
