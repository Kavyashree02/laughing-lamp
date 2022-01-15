package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Kavyashree/Desktop/Adv%20Selenium/element.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys(Keys.CONTROL+ "a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
	}
	

}
