package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jpet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("pandi");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("repeatedPassword")).sendKeys("1234");
		driver.findElement(By.name("account.firstName")).sendKeys("santhosh");
		driver.findElement(By.name("account.lastName")).sendKeys("pandi");
		driver.findElement(By.name("account.email")).sendKeys("santhosh@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("1234567890");
		driver.findElement(By.name("account.address1")).sendKeys("north street");
		driver.findElement(By.name("account.address2")).sendKeys("vadapalani");
		driver.findElement(By.name("account.city")).sendKeys("chennai");
		driver.findElement(By.name("account.state")).sendKeys("tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("600001");
		driver.findElement(By.name("account.country")).sendKeys("india");
		Select language= new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("japanese");
		Select category= new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("BIRDS");
		Thread.sleep(3000);
		WebElement button =driver.findElement(By.name("account.listOption"));
		button.click();
		Thread.sleep(3000);
		WebElement button2 = driver.findElement(By.name("account.bannerOption"));
		button2.click();
		Thread.sleep(3000);
		driver.findElement(By.name("newAccount")).click();
		
		

	}

}
