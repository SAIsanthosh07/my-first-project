package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframesDemo {
	WebDriver driver;
	@Test
	public void a_pageload() {
	System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("https://nunzioweb.com/index.shtml");
    driver.manage().window().maximize();
}
	@Test
	public void b_print() throws InterruptedException {
		Thread.sleep(10000);
	  driver.switchTo().frame("oddcouple");
	  String name=driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();
	  System.out.println(name);
	}
}
