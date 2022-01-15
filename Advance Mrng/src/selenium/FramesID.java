package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesID {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Kavyashree/Desktop/Adv%20Selenium/mainpage.html");
		Thread.sleep(2000);
		//switch the control from main page to subpage using index
		driver.switchTo().frame("f1");
		driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("123");
		Thread.sleep(2000);
		driver.close();
	}
}
