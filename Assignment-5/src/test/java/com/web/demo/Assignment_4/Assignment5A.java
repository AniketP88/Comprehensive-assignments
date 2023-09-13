package com.web.demo.Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5A {
	
  
  static WebDriver driver;
  
  @BeforeMethod
  public void setup() throws InterruptedException {
	  
	 
	  
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.makemytrip.com/");
  }
  @Test
  public void isLogoPresent() throws InterruptedException {
  WebElement element =
  driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
  Assert.assertNotEquals(element, null);
  }
  
  @AfterMethod
  public void teardown() {
  driver.quit();
  }

}
