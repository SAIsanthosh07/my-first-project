package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationPractice {
	public static WebDriver driver;
	@Test
	public void a_pageLoad() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    getScreenShot();
	}
   @Test
   public void b_signIn() throws InterruptedException, IOException {
	   driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.id("email_create")).sendKeys("sdfgh23@gmail.com");
	    driver.findElement(By.xpath("//input[@id='email_create']/following::span[1]")).click();
	    getScreenShot();
   }
   @Test
   public void c_registerForm() throws InterruptedException, IOException {
	   Thread.sleep(7000);
	    WebElement gender= driver.findElement(By.id("id_gender1"));
	    gender.click();
	    getScreenShot();
	    driver.findElement(By.id("customer_firstname")).sendKeys("sanhosh");
	    driver.findElement(By.id("customer_lastname")).sendKeys("pandi");
	    driver.findElement(By.id("passwd")).sendKeys("santhosh122");
	    Thread.sleep(3000);
	    Select day=new Select(driver.findElement(By.id("days")));
	    day.selectByVisibleText("15  ");
	    getScreenShot();
Select month=new Select(driver.findElement(By.id("months")));
month.selectByVisibleText("May ");
	   getScreenShot();
Select year=new Select(driver.findElement(By.id("years")));
year.selectByVisibleText("1999  ");
	getScreenShot();
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.id("optin")).click();
	    Select state=new Select(driver.findElement(By.id("id_state")));
	    state.selectByVisibleText("Indiana");
	    getScreenShot();
   }
   private static void getScreenShot() throws IOException, InterruptedException {
	   Thread.sleep(3000);
	   File srcfile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(srcfile,  new File("F:\\Selenium\\screenshotsDemo\\Screenshot" +System.currentTimeMillis()+ ".png"));
   }
}
