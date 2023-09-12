package com.web.demo.Assignment3Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	@Test
	public void testLogoPresent() {
		WebDriverManager.firefoxdriver().setup();
    	
		 WebDriver  driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/span/a/img"));
		String alt = element.getAttribute("alt");
		String tag = element.getTagName();
		System.out.println(alt);
		Assert.assertEquals(tag, "img");
		Assert.assertEquals(alt, "MMT's LOGO");
		
	}
}
