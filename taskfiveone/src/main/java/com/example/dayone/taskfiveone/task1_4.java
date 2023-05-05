package com.example.dayone.taskfiveone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1_4 {
	public static void main(String[] dfg) {
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		WebDriver driv = new EdgeDriver();
		ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
		WebDriver chromedriver = new ChromeDriver(co);
		chromedriver.get("https://www.google.com/");
		driver.get("https://www.google.com/");
		driv.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber",Keys.ENTER);
		driver.navigate().back();
		
		driver.close();
		
		driv.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);
		driv.navigate().back();
		driv.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
		driv.navigate().back();
		driv.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber",Keys.ENTER);
		driv.navigate().back();
		
		driv.close();
		
		chromedriver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber",Keys.ENTER);
		chromedriver.navigate().back();
		chromedriver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
		chromedriver.navigate().back();
		chromedriver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);
		chromedriver.navigate().back();
		chromedriver.close();
		
		
		
		
	}
}
