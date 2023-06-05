package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_04 {

	public static void main(String args[]) throws InterruptedException{
		 WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.abhibus.com/bus-ticket-booking");
		  driver.manage().window().maximize();
		  
		  WebElement test3= driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		  test3.sendKeys("10-06-2023",Keys.ENTER);
		  Thread.sleep(2000);
		  
		  WebElement test1= driver.findElement(By.xpath("//*[@id=\"source\"]"));
		  test1.sendKeys("Coimbatore");
		  Thread.sleep(2000);
		  
		  WebElement test2= driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		  test2.sendKeys("Chennai");
		  Thread.sleep(2000);
		  
		  
		  
		  driver.quit();
	
	}
}
