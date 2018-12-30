package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/nt/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("google"));

	}

}
