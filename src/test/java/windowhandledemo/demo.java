package windowhandledemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		Thread.sleep(4000);

//		String windowid = driver.getWindowHandle();
//		System.out.println("Current window id=:" + windowid);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();

		Thread.sleep(2000);

		Set<String> windowid = driver.getWindowHandles();

		List<String> windowlist = new ArrayList<String>(windowid);

		String pwindow = windowlist.get(0);
		System.out.println("Parent window id=:" + pwindow);

		String cwindow = windowlist.get(1);
		System.out.println("Child window id=:" + cwindow);

		Thread.sleep(5000);
		driver.switchTo().window(pwindow);
		Thread.sleep(4000);

		driver.switchTo().window(cwindow);

		Thread.sleep(3000);
		driver.quit();
	}

}
