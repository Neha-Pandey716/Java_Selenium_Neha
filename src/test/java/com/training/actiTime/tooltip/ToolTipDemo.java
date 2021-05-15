package com.training.actiTime.tooltip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo
{
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			WebElement googleAppsIcon = driver.findElement(By.xpath("//a[@class='gb_D']"));
			WebElement searchByVoiceIcon = driver.findElement(By.xpath("//div[@class='hpuQDe']"));
			
			System.out.println(" googleAppsIcon " + googleAppsIcon.getAttribute("aria-label"));
			System.out.println(" searchByVoiceIcon " + searchByVoiceIcon.getAttribute("aria-label"));
			
		
		}
}