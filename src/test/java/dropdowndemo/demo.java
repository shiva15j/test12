package dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));

		Select drp = new Select(ele);

		// drp.selectByValue("Boston");

		Thread.sleep(2000);

		drp.selectByValue("Mexico City");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));

		Select drp1 = new Select(ele1);
		// drp1.selectByValue("Berlin");
		Thread.sleep(2000);
		drp1.selectByValue("London");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("creditCardMonth"));
		
		ele2.clear();
		ele2.sendKeys("12");
		Thread.sleep(3000);
		driver.close();

	}

}
