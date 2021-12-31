package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Herokuapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("5");
		Actions act = new Actions(driver);
		for(int i=5;i<10;i++) {
		act.sendKeys(Keys.ARROW_UP).build().perform();
		}
		Thread.sleep(3000);
		for(int i=10;i>5;i--) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			}
		
		
	}

}