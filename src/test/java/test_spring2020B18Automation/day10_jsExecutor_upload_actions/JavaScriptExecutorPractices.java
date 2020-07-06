package test_spring2020B18Automation.day10_jsExecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Utilities.Driver;

public class JavaScriptExecutorPractices {
	
	@Test
	public void jsexecutor_test() throws InterruptedException{
		
		Driver.getDriver().get("http://practice.cybertekschool.com/");
		
		WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
		
		Thread.sleep(4000);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", cybertekSchoolLink);
		
		
		
	}
	
	
	
}