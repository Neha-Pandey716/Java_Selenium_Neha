package com.training.actiTime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/dropdown");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.linkText("Radio Button")).click();
		
	}
}
