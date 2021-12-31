package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StoreContactAs {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	}
	@Test
	public void b_contactus() throws InterruptedException{
		Thread.sleep(3000);
		WebElement mouse=driver.findElement(By.xpath("(//a[contains(text(),'Contact')])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).build().perform();
		mouse.click();
	}
	@Test
	public void c_dropDown() throws InterruptedException {
		Thread.sleep(5000);
		Select drop=new Select(driver.findElement(By.id("id_contact")));
		drop.selectByVisibleText("Customer service");
		driver.findElement(By.id("email")).sendKeys("santhois34@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("mobiles");
		WebElement file=driver.findElement(By.id("fileUpload"));
		file.sendKeys("C:\\eclipse\\emailable-report-productstoreContact.html");
		driver.findElement(By.id("message")).sendKeys("hi buddy");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		driver.close();
	}
}
