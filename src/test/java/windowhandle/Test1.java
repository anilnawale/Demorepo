package windowhandle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/WindowHandle.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		System.out.println("print id of window="+parent);
		driver.findElement(By.linkText("Orange HRM")).click();

		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.name("fname")).sendKeys("anil");
		Thread.sleep(3000);
		driver.findElement(By.name("lname")).sendKeys("nawale");
		Thread.sleep(3000);
		
		Set<String> rt=driver.getWindowHandles();
		int a=rt.size();
		System.out.println(a);
		System.out.println(rt);
		driver.findElement(By.linkText("Visit Facebook")).click();
		Set<String> b=driver.getWindowHandles();
		int m=b.size();
		System.out.println(m);
		System.out.println(b);
		Thread.sleep(5000);
		
		ArrayList<String> abc=new ArrayList<String>(b);
		driver.switchTo().window(abc.get(0));
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(5000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		String RM=RandomString.make(5);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\ "+RM+".png"));
		Thread.sleep(5000);
		
		driver.switchTo().window(abc.get(1));
		File src1=ts.getScreenshotAs(OutputType.FILE);
		String RM1=RandomString.make(3);
		FileUtils.copyFile(src1, new File("C:\\Users\\hp\\Screenshot\\ "+RM1+".png"));
		Thread.sleep(5000);
		driver.switchTo().window(abc.get(2));
		File src2=ts.getScreenshotAs(OutputType.FILE);
		String RM2=RandomString.make(2);
		FileUtils.copyFile(src2, new File("C:\\Users\\hp\\Screenshot\\ "+RM2+".png"));
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
