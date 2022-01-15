package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {
	public static void main(String [] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Thread.sleep(8000);
	 Set<String> p_id = driver.getWindowHandles();
	Set<String> allwh = driver.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	allwh.remove(p_id);
	int c1 = allwh.size();
	System.out.println(c1);
	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}
	}
}
