package com.selenium.test1.CIA_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn1 {
  @Test
  public void f() throws Exception{
	WebDriverManager.edgedriver().setup();
   	WebDriver driver=new EdgeDriver();
   	driver.get("https://www.trivago.in/");
   	driver.manage().window().maximize();
   	String originalTitle = "trivago.in - Compare hotel prices worldwide";
   	String title = driver.getTitle();
   	if(title.equals(originalTitle)) {
   		System.out.println("Page title validated");
   	}
   	WebElement destination = driver.findElement(By.id("input-auto-complete"));
   	destination.click();
   	Thread.sleep(3000);
   	destination.sendKeys("Pondicherry");
   	destination.sendKeys(Keys.ENTER);
   	Thread.sleep(2000);
   	WebElement dt=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[1]/span"));
	dt.click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[31]/time")).click();
   	Thread.sleep(2000);
   	
   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button[3]/time")).click();
   	Thread.sleep(2000);
   	WebElement pet = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]"));
   	pet.click();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]")).click();
   	Thread.sleep(2000);
   	driver.findElement(By.className("py-4 px-8 text-white text-l font-bold bg-blue-800 active:bg-blue-900 hover:bg-blue-900 rounded-r-md")).click();
   	Thread.sleep(50000);
   	List<WebElement> list = driver.findElements(By.xpath("//span[@itemprop='name']"));
	int i=0;
	for(WebElement link:list) {
		System.out.println(link.getText());
		i++;
		if(i==5) {
			break;
		}
	}
  }
}
