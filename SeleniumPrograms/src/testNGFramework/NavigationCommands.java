package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
	WebDriver driver;
	@Test
	public void a_pageload() {
	System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("http://zero.webappsecurity.com/index.html");
    driver.manage().window().maximize();
}
	@Test
	public void b_navigationCommands() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
} 
