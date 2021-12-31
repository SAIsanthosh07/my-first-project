package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductStoreContact {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.demoblaze.com/");
	    driver.manage().window().maximize();
	}
	@Test
	public void b_contact() throws InterruptedException {
		Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Contact']")).click();
    driver.findElement(By.id("recipient-email")).sendKeys("santhos342@gmail.com");
    driver.findElement(By.id("recipient-name")).sendKeys("santhosh");
    driver.findElement(By.id("message-text")).sendKeys("hi everyone");
    driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
		}
	@Test
	public void c_alert() throws InterruptedException {
		Thread.sleep(3000);
		Alert aler= driver.switchTo().alert();	
		aler.accept();
		driver.close();
	}
}
