package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class jpet {
    WebDriver driver;
	@Test (priority=1)
	public void pageload() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
	}
	@Test (priority=2)
	public void userInfo() {
		driver.findElement(By.name("username")).sendKeys("pandi");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("repeatedPassword")).sendKeys("1234");
	}
	@Test (priority=3)
	public void accountInfo() throws InterruptedException {
		driver.findElement(By.name("account.firstName")).sendKeys("santhosh");
		driver.findElement(By.name("account.lastName")).sendKeys("pandi");
		driver.findElement(By.name("account.email")).sendKeys("santhosh@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("1234567890");
		driver.findElement(By.name("account.address1")).sendKeys("north street");
		driver.findElement(By.name("account.address2")).sendKeys("vadapalani");
		driver.findElement(By.name("account.city")).sendKeys("chennai");
		driver.findElement(By.name("account.state")).sendKeys("tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("600001");
		Thread.sleep(3000);
		driver.findElement(By.name("account.country")).sendKeys("india");
	}
	@Test (priority=4)
	public void profileInfo() {
		Select language= new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("japanese");
		Select category= new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("BIRDS");
		WebElement button =driver.findElement(By.name("account.listOption"));
		button.click();
		WebElement button2 = driver.findElement(By.name("account.bannerOption"));
		button2.click();
		driver.findElement(By.name("newAccount")).click();
		driver.close();
	}		
	}


