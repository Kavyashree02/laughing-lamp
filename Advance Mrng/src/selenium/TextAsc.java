package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextAsc {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Kavyashree/Desktop/Adv%20Selenium/multiple%20DD.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("BBQ"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		ArrayList<String> arr=new ArrayList<String>();
		for(WebElement option:options)
		{
			String text = option.getText();
			arr.add(text);
		}
		Collections.sort(arr);
		for(String t:arr)
		{
			System.out.println(t);
		}
	}
	
		

}
