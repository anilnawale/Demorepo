package test_demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot)driver;//downcasting
		String TR=RandomString.make(5);
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Screenshot\\"+ TR + " .jpg"));
		
		
		
		driver.close();
		
		
	}

}
