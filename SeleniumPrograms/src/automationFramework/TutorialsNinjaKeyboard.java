package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TutorialsNinjaKeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("Laptop");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();;
		String pagename=driver.getCurrentUrl();
		System.out.println(pagename);
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String searchname=driver.findElement(By.xpath("//h1[contains(text(),'Search')]")).getText();
		System.out.println(searchname);

	}

}
