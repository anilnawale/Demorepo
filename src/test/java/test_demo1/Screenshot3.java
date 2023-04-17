package test_demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.redbus.in/");
		
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 String RM= RandomString.make(3);
		 
		 FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\" +RM  +" .png"));
		 
		 
		 driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
