package test_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement dis=driver.findElement(By.className("lnXdpd"));
		Thread.sleep(3000);
		
		boolean a=dis.isDisplayed();
		boolean b=dis.isEnabled();
		boolean c=dis.isSelected();
		String g=dis.getText();
		
	
		System.out.println("print output= "+a);
		System.out.println("print output= "+b);
		System.out.println("print output= "+c);
		System.out.println("text value= "+g);
	String h=driver.getTitle();
	System.out.println("tital of page= "+h);
	String j=driver.getCurrentUrl();
	System.out.println("current url= "+j);
	
	if(h.contains("Google")) {
		
		System.out.println("case is pass");
		
	}
	else {
		System.out.println("case is fail");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
