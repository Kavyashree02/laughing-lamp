package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KannadaElement {
	public static void main(String [] args) throws InterruptedException
	{		
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	String url = ele.getAttribute("href");
	System.out.println(url);

}
}