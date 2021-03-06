package test_spring2020B18Automation.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		//Set up the web driver
		WebDriverManager.chromedriver().setup();
		//Create the instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Test if driver is working
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com");
		
		
		
	}
	

}
