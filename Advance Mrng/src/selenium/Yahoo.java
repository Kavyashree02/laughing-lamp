package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=login-username]")).sendKeys("shree199602");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=login-signin]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=login-passwd]")).sendKeys("stellamaris1996");
		Thread.sleep(3000);
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[role=button]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=message-to-field]")).sendKeys("pragathi024@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[spellcheck=true]")).sendKeys("hello");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[role=textbox]")).sendKeys("how are you");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-test-id=compose-send-button]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[role=presentation]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id=profile-signout-link]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[title=Mail]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[role=button]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=login-username]")).sendKeys("pragathi024");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=login-signin]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=login-passwd]")).sendKeys("7829070586");
		Thread.sleep(3000);
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(3000);
		
		
		
	}

}
