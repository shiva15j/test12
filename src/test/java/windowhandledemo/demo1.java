package windowhandledemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("The title of the current page=:" + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(5000);
		// String windowid = driver.getWindowHandle();
		// System.out.println(windowid);
		System.out.println("The title of the current page=:" + driver.getTitle());

		Set<String> windowid = driver.getWindowHandles();

		List<String> windowlist = new ArrayList<String>(windowid);

		String pwindow = windowlist.get(0);
		System.out.println("The Pranet window id is=:" + pwindow);

		String cwindow = windowlist.get(1);
		System.out.println("The child window id =:" + cwindow);

		Thread.sleep(2000);

		driver.switchTo().window(pwindow);
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

//		driver.switchTo().window(cwindow);
//		System.out.println("The title of the current page=:" + driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}

}
