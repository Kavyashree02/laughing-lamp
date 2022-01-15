package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String [] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Thread.sleep(8000);
	 String p_id = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		if(wh.equals(p_id))
		{
			driver.close();
		}
	}
	}
}

	

