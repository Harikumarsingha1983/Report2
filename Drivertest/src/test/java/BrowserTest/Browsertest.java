package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {
	public static void main(String[] args) throws Throwable {
		System.out.println("HelloWorld");
		System.setProperty("webdriver.chrome.driver","D:\\ECLIPSE\\Testing_project\\Drivertest\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("gorilka");
		driver.findElement(By.name("btnK")).click();
		
		}

}
