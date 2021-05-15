package com.training.actiTime.sync;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	
	public static <T> void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("file:///D:/SynechronJavaSelenium_07_05/html/tiimeout.html");

		driver.findElement(By.tagName("button")).click();
		
		//STEP-1
		// create a fluent wait object by passing input as an argument 
		//input - webelement, max time, polling time, exceptions to ignore
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		
		//STEP-2
		//WRITE YOUR WAIT OWN LOGIC INSIDE APPLAY METHOD PRESENT INSIDE FUNCTION INSTERFACE
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
				
				if(ele.getText().equals("Hello")) {
					System.out.println("Element is visible !!!!");
					return true;
				}
				else {
					System.out.println("Waiting!!!!!!!!!!!");
					return false;
				}
			}
		};
		
		
		//Step-3
		
		wait.until(fun);
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());
	
	
	}
}
