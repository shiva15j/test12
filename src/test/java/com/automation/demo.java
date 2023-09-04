package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("user-name"));

		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();

		String expectedurl = "https://www.saucedemo.com/inventory.html";

		String actualurl = driver.getCurrentUrl();

		if (expectedurl.equals(actualurl)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login failed");
		}

//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.close();

	}

}
