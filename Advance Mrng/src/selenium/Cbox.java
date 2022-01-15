package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cbox {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Kavyashree/Desktop/Adv%20Selenium/CboxSelected.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean b = ele.isSelected();
		
		if(b)
		{
			System.out.println("cbox selected");
		}
		else
		{
			System.out.println("cbox not selected");
		}
	}

}
