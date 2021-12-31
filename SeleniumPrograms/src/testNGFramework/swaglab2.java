package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class swaglab2 {
	WebDriver driver;
	@BeforeSuite
	public void a_pageload() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com");
	  driver.manage().window().maximize();
	}
	@Test
	public void b_userLogin() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.name("password")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Test(enabled=false)
	public void c_userLogout() throws InterruptedException {
		 Thread.sleep(5000);
		  driver.findElement(By.id("react-burger-menu-btn")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.id("logout_sidebar_link")).click();
		  driver.close();
	}
	@AfterSuite
	public void d_browserCloser() {
		driver.close();
	}
}
