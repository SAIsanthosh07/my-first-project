package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialsninja {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("santhosh");
		driver.findElement(By.name("lastname")).sendKeys("pandi");
		driver.findElement(By.name("email")).sendKeys("santho35@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7010911215");
		driver.findElement(By.id("input-password")).sendKeys("pandi");
		driver.findElement(By.id("input-confirm")).sendKeys("pandi");
		WebElement button=driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]"));
		button.click();
		WebElement checkbox= driver.findElement(By.name("agree"));
		checkbox.click();
		driver.findElement(By.xpath("//input[@name='agree']/following::input[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
