package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("customer.firstName")).sendKeys("santhosh");
		driver.findElement(By.id("customer.lastName")).sendKeys("pandi");
		driver.findElement(By.id("customer.address.street")).sendKeys("north street");
		driver.findElement(By.id("customer.address.city")).sendKeys("chennai");
		driver.findElement(By.id("customer.address.state")).sendKeys("Tamilnadu");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("625503");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7010911215");
		driver.findElement(By.id("customer.ssn")).sendKeys("4232-23-455");
		driver.findElement(By.id("customer.username")).sendKeys("santhoshpandi");
		driver.findElement(By.id("customer.password")).sendKeys("pandi");
		driver.findElement(By.id("repeatedPassword")).sendKeys("pandi");
		driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("santhoshpandi");
		driver.findElement(By.name("password")).sendKeys("pandi");
		driver.findElement(By.xpath("(//input[@class='button'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		try {Thread.sleep(2000);}catch (InterruptedException e) {}
			
		driver.close();
			
		
	}

}
