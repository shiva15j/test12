package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// step1:- comman xpath

		// step 2:- list

		// step 3:- loop iterate
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println(ele.size());

		for (WebElement vl : ele) {

			vl.click();
		}

		Thread.sleep(2000);
		driver.close();
	}

}
