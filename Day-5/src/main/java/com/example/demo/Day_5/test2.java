package com.example.demo.Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	public static void main(String[]args) throws InterruptedException {
		
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement dragg =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement dropp =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(dragg, dropp).build().perform();
        Thread.sleep(2000);
        //switching to parent
        driver.switchTo().defaultContent();
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[8]/a"));
        btn.click();
        driver.close();
	}
}
