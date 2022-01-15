package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Kavyashree/Desktop/Adv%20Selenium/multiple%20DD.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("BBQ"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("l");
		Thread.sleep(2000);
		s.selectByVisibleText("Veg Biryani");
		Thread.sleep(2000);
		s.deselectAll();

}
}
