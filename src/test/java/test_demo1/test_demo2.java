package test_demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		String tital=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println("Tital name= " +tital);
		System.out.println("Url name= " +url);
		
		//verify tital name
		if(tital.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
				{
					System.out.println("case is pass");
				}
				else {
					System.out.println("case is fail");
				}
		//verify url
		if(url.equals("https://www.flipkart.com/"))
		{
			System.out.println("case2 is pass");
		}
		else {
			System.out.println("case2 is fail");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
