package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StoreSignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("email_create")).sendKeys("sdfgh23@gmail.com");
	    driver.findElement(By.xpath("//input[@id='email_create']/following::span[1]")).click();
	    Thread.sleep(3000);
	    WebElement gender= driver.findElement(By.id("id_gender1"));
	    gender.click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("sanhosh");
	    driver.findElement(By.id("customer_lastname")).sendKeys("pandi");
	    driver.findElement(By.id("passwd")).sendKeys("santhosh122");
	    Thread.sleep(3000);
	    driver.findElement(By.id("days")).sendKeys("15");;

	   driver.findElement(By.id("months")).sendKeys("May");;

	   driver.findElement(By.id("years")).sendKeys("1990");
	
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.id("optin")).click();
	    Select state=new Select(driver.findElement(By.id("id_state")));
	    state.selectByVisibleText("Indiana");

	}

}
