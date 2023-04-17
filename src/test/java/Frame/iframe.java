package Frame;

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

import net.bytebuddy.utility.RandomString;

public class iframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?help-doc.html");
		Thread.sleep(3000);
//		WebElement ts=driver.findElement(By.name("packageListFrame"));
//		driver.switchTo().frame(ts);
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("org.openqa.selenium")).click();
//		Thread.sleep(3000);
		
		
//		driver.switchTo().frame(2);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[text()='Overview'])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("org.openqa.selenium.bidi.browsingcontext")).click();
		//Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);
		driver.findElement(By.linkText("ActiveSession")).click();
		Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("(//a[text()='Deprecated'])[1]")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(3000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		String RM="Red";
		DateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		Thread.sleep(3000);
		Date date=new Date();
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\ "+ RM + dateformat.format(date) +".png"));
		System.out.println("execution completed");
		Thread.sleep(3000);
		driver.close();
		
	}

	

}
