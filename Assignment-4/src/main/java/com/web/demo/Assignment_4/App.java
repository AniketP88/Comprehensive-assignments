package com.web.demo.Assignment_4;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
static WebDriver driver;
static void clickOnFlights() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[2]")).click();
	Thread.sleep(3000);
}
static void clickOnOneWay() {
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[1]")).click();
}
static void fromLocation() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Pune");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
Thread.sleep(3000);
}
static void toLocation() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/label/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("Delhi");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
Thread.sleep(3000);
}
static void clickSearch() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();
Thread.sleep(3000);
}
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://makemytrip.com/");
Thread.sleep(3000);
clickOnFlights();
clickOnOneWay();
fromLocation();
toLocation();
clickSearch();
driver.quit();
}
}


