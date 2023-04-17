package test_demo1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		//Down-Casting
				//converting WebDriver object into TakesScreenshot
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		// Create an object of SimpleDateFormat & decide format
	DateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh-mm-ss ");
	
		// to get the current time with date
	Date date=new Date();
		String name1="redbus";
	
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\"+name1 + dateformat.format(date)+" .jpg"));
		
	    driver.close();
		
		
		
		
		
	}

}
