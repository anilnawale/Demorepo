package test_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		WebElement rt=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		Thread.sleep(3000);
		rt.sendKeys("maven");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("pcTkSc")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(3000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		String maven="google";
		Thread.sleep(3000);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\" + maven + ".png"));
		Thread.sleep(3000);
		System.out.println("excution complete");
		
	}

}
