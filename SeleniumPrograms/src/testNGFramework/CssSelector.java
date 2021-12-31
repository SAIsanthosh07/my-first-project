package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {
	WebDriver driver;
	@Test 
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
}
	@Test
	public void b_clicksignin() {
		WebElement butt=driver.findElement(By.id("signin_button"));
		butt.click();
		driver.findElement(By.cssSelector("signin_button")).click();
	}
}
