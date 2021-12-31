package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
	    driver.findElement(By.name("q")).sendKeys("mobiles");
	    Actions act=new Actions(driver);
	    act.sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(3000);
	    WebElement mob=driver.findElement(By.xpath("//div[contains(text(),'C31')]"));
	    Actions mouse=new Actions(driver);
	    mouse.moveToElement(mob).build().perform();
	    mob.click();
	    ArrayList<String> flipkartWindows=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(flipkartWindows.get(1));
	    String title=driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    String txt=driver.findElement(By.xpath("//span[contains(text(),'C31')]")).getText();
	    System.out.println(txt);
	    String text=driver.findElement(By.xpath("(//div[contains(text(),'99')])[1]")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

	}

}
