package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionTabEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("sasjdhdd30595@gmail.com");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB,"pandi").build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
	}

}
