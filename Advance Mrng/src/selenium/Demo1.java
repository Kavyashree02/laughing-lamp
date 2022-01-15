package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
		public static void main(String [] args)
		{
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.close();
		}
}
