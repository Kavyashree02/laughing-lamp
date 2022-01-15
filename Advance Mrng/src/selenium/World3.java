package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class World3 {

		public static void main(String[] args) throws InterruptedException
		{
			String key1="webdriver.gecko.driver";
			String value1="./software/geckodriver.exe";
			System.setProperty(key1,value1);
			FirefoxDriver d1=new FirefoxDriver();
			Thread.sleep(2000);
			d1.close();
			d1.quit();
		}
}
