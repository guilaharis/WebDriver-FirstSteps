


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	
	public void test() {
		System.setProperty("webdriver.chrome.driver","/Users/ivelinastoyanova/Desktop/untitled folder/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://training.skillo-bg.com:4300/posts/all");
	
		WebElement home = driver.findElement(By.id("nav-link-home"));
		home.click();
		WebElement login = driver.findElement(By.id("nav-link-login"));
		login.click();
		
		WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));
    	username.sendKeys("xmas");
    	WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
    	password.sendKeys("Christmas1");
    	WebElement signIn = driver.findElement(By.id("sign-in-button"));
    	signIn.click();
    	
		//driver.close();
	}
}
