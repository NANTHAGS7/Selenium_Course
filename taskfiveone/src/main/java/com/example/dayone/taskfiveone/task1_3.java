package com.example.dayone.taskfiveone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1_3 {
	public static void main(String[] jhkl) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Bangalore");
//		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
//		datepicker.click();
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
//		Select select = new Select(datepicker);
//		select.selectByValue("25");
	}

}
