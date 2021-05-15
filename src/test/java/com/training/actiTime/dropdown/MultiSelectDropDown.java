package com.training.actiTime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\Neha.Pandey\\eclipse-workspace\\html\\multiSelect.html");
		
		Select sel = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByValue("volvo");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(3000);
		
		sel.deselectByIndex(0);
		Thread.sleep(3000);
		sel.deselectByValue("mercedes");
		Thread.sleep(3000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByValue("volvo");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(3000);
	
		sel.deselectAll();
		
	}
}