package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Kavyashree/Desktop/Adv%20Selenium/Keyboard.html");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@value='Hello']"));
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@value='World']"));
		
		WebElement ele3 = driver.findElement(By.xpath("//a"));
		ele1.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(3000);
		ele2.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(3000);
		ele3.sendKeys(Keys.ENTER);
		
	}
}
