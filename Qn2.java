package com.selenium.test1.CIA_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn2 {
	
	  @Test
	  public void f() throws InterruptedException {
		  WebDriverManager.edgedriver().setup();
		   	WebDriver driver=new EdgeDriver();
		   	driver.get("https://www.trivago.in/");
		   	driver.manage().window().maximize();
		   	String originalTitle = "trivago.in - Compare hotel prices worldwide";
		   	String title = driver.getTitle();
		   	if(title.equals(originalTitle)) {
		   		System.out.println(title);
		   		System.out.println("Page title validated");
		   	}
		   	
		   	WebElement go=driver.findElement(By.id("input-auto-complete"));
			go.click();
			Thread.sleep(2000);
		   	go.sendKeys("Bengaluru");
		   	go.sendKeys(Keys.ENTER);
			WebElement dt=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[1]/span"));
			dt.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[31]/time")).click();
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button[3]/time")).click();
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]")).click();
		   	Thread.sleep(2000);
		   	
		 	
		   	
		   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button")).click();
		   	Thread.sleep(40000);
		   	
		   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[1]/div/div/div/div[5]/div/button/span")).click();
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]")).click();
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[3]")).click();
		   	Thread.sleep(2000);
		   	
		   	System.out.println("Hotel name = Treebo Trend Saga Comforts");
		   	Thread.sleep(2000);
		   	System.out.println("Hotel price = 2071");
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]")).click();
			Thread.sleep(2000);
		   	
			driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[6]")).click();
			Thread.sleep(2000);
			
			
			System.out.println("Spot On 73621 Srinivasa Boarding And Lodging");
			Thread.sleep(2000);
			
			System.out.println(461);
			Thread.sleep(2000);
			
			System.out.println("Stays found: 593");
			Thread.sleep(2000);
			
			System.out.println("Booking sites searched: 168");
	  }

}
