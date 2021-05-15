package com.training.actiTime.sync;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSyncIssueDemo {

	static {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Synechron");

		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']"));
		System.out.println("Total suggestions displayed is "  + autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) 
		{
			System.out.println(suggestion.getText());
			
		}
		
	
	}
}
