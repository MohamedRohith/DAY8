package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_03 {

	public static void main(String args[]) throws InterruptedException{
		 WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  driver.manage().window().maximize();
		  WebElement enter = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		  enter.sendKeys("401");
		  Thread.sleep(3000);
		  
		  WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		  submit.click();
		  Thread.sleep(3000);
		  
		  Alert a = driver.switchTo().alert();
		  a.dismiss();
		  Thread.sleep(3000);
		  
		  enter.clear();
		  Thread.sleep(3000);
		  
		  enter.sendKeys("402");
		  submit.click();
		  Thread.sleep(3000);
		  
		  a.accept();
		  
		  Thread.sleep(3000);
		  Alert b = driver.switchTo().alert();
		  String text= b.getText();
		  System.out.print(text);
		  Thread.sleep(3000);
		  
		  driver.quit();
	}
}
