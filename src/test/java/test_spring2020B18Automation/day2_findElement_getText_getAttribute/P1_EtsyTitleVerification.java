package test_spring2020B18Automation.day2_findElement_getText_getAttribute;
/*
1: Etsy Title Verification1.Open Chrome browser
2.Go to https://www.etsy.com
3.Search for “wooden spoon”
4.Verify title: Expected: “Wooden spoon | Etsy
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_EtsyTitleVerification {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com");
		
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" );
		driver.findElement(By.className("wt-input-btn-group__btn")).click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Wooden spoon | Etsy";
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Etsy title verification PASSED!");
		}
		else
		{
			System.out.println("Etsy title verification FAILED!!!");
		}
	}
}
