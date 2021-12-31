package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductStore {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.demoblaze.com/");
	    driver.manage().window().maximize();
	}
	@Test 
	public void b_signUp() {
		WebElement cursor=driver.findElement(By.id("signin2"));
		cursor.click();
	}
	@Test
	public void c_userInfo() throws InterruptedException {
		driver.findElement(By.id("sign-username")).sendKeys("santhoss");
		driver.findElement(By.id("sign-password")).sendKeys("Pandi@123");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(4000);
		Alert aler= driver.switchTo().alert();
		String popup=aler.getText();
		System.out.println(popup);
		Thread.sleep(2000);
		aler.accept();
		driver.close();
	}	
}
