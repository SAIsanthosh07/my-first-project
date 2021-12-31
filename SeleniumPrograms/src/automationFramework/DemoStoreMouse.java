package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoStoreMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demostore.x-cart.com/");
		driver.manage().window().maximize();
		WebElement hotdeals=driver.findElement(By.xpath("(//span[text()='Hot deals'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(hotdeals).build().perform();
		Thread.sleep(4000);
		WebElement sale=driver.findElement(By.xpath("(//span[text()='Sale'])[2]"));
		Thread.sleep(3000);
		sale.click();
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		String title=driver.getTitle();
		System.out.println(title);
		String text=driver.findElement(By.id("page-title")).getText();
		System.out.println(text);
		String tag=driver.findElement(By.id("page-title")).getTagName();
		System.out.println(tag);
		String css=driver.findElement(By.id("page-title")).getCssValue("font-size");
		System.out.println(css);

	}

}
