package com.example.dayone.taskfiveone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1_2 {
	public static void main(String[] hjk) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement l = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		l.sendKeys("401");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(5000);
		l.clear();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.switchTo().alert().accept();
		System.out.println("Successfully customer deleted");
	}
}
