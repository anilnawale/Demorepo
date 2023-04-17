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

import net.bytebuddy.utility.RandomString;

public class demos {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//String RM=RandomString.make(3);
		//FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\ "+ RM +".png" ));
		
		DateFormat dateformat=new SimpleDateFormat("dd-mm-yy");
		Date date=new Date();
		String name1="redbus";
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\"+name1+ dateformat.format(date) +"  .png"));
		
		
		
		
		
		
		
		driver.close();

	}

}
