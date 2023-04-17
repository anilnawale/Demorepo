package test_demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("C:\\Users\\hp\\Downloads\\StaticTable.html");
		Thread.sleep(3000);
		//table count
		//table row count
		//table head count
		//table data count
		
		List<WebElement> ls=driver.findElements(By.tagName("table"));
		
		int a=ls.size();
		System.out.println("table count is= " +a);
		
		for(WebElement abc : ls) {
			String b=abc.getText();
			System.out.println("table value= "+b);
		}
		System.out.println("------------------------------------------");
		
		List<WebElement> ls1=driver.findElements(By.tagName("tr"));
		int c=ls1.size();
		System.out.println("Row count is= "+c);
		for(WebElement row : ls1) {
			String d=row.getText();
			System.out.println("row value is= "+d);
		}
		System.out.println("-----------------------------------------------");
		List<WebElement> ls2=driver.findElements(By.tagName("th"));
		int f=ls2.size();
		System.out.println("head count is= "+f);
		for(WebElement head : ls2) {
			String g=head.getText();
			System.out.println("head value="+g);
		}
		System.out.println("----------------------------------------------");
		
		List<WebElement> ls3=driver.findElements(By.tagName("td"));
		int h=ls3.size();
		System.out.println("data count= "+h);
		for(WebElement data : ls3) {
			String j=data.getText();
			System.out.println("data value is= "+j);
		}
		System.out.println("--------------------------------------------");
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
