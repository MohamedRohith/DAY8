package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_05 {

	public static void main(String args[]) throws InterruptedException{
		 WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  WebElement key =driver.findElement(By.name("q"));
		  key.sendKeys("Apple");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  Thread.sleep(5000);
		  String t1 = driver.getTitle();
		  String id1= driver.getWindowHandle();
		  System.out.println(t1);
		  System.out.println(id1);
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  WebElement key1 =driver.findElement(By.name("q"));
		  key1.sendKeys("Selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  Thread.sleep(5000);
		  String t2 = driver.getTitle();
		  String id2= driver.getWindowHandle();
		  System.out.println(t2);
		  System.out.println(id2);
		  
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  WebElement key2 =driver.findElement(By.name("q"));
		  key2.sendKeys("Selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  Thread.sleep(5000);
		  String t3 = driver.getTitle();
		  String id3= driver.getWindowHandle();
		  System.out.println(t3);
		  System.out.println(id3);
		  
		  Set<String> total = driver.getWindowHandles();
		  System.out.println("Total tabs "+total.size());
}
}