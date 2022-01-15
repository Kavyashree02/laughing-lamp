package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {

			public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.instagram.com/");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("kavyashree");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("hello");

}
	}
