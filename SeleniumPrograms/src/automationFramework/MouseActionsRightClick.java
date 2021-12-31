package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement cursor=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions act =new Actions(driver);
		act.contextClick(cursor).build().perform();;
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Alert aler=driver.switchTo().alert();
		aler.accept();

	}

}