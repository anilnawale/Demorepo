package resolution;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dime {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Dimension d=new Dimension(300,500);
		driver.manage().window().setSize(d);
		int ht=d.getHeight();
		int wt=d.getWidth();

		System.out.println("print height="+ht+ " print width="+wt);
	}

}
