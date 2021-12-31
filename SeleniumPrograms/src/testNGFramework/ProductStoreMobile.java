package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductStoreMobile {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.demoblaze.com/");
	    driver.manage().window().maximize();
	}
	@Test
	public void b_mobileClick() throws InterruptedException {
		Thread.sleep(9000);
		WebElement mouse= driver.findElement(By.xpath("(//a[contains(text(),'Samsung')])[1]"));
		mouse.click();
	}
	@Test
	public void c_printing() throws InterruptedException {
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String name=driver.getTitle();
		System.out.println(name);
		String pname=driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']")).getText();
		System.out.println(pname);
		String ptag=driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']")).getTagName();
		System.out.println(ptag);
		String price =driver.findElement(By.xpath("//h3[contains(text(),'360')]")).getText();
		System.out.println(price);	
	}
	@Test
	public void d_addToCart() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
		String tag=driver.findElement(By.xpath("//a[contains(text(),'Add')]")).getTagName();
		System.out.println(tag);
		String css=driver.findElement(By.xpath("//a[contains(text(),'Add')]")).getCssValue("line-height");
		System.out.println(css);
		String attri=driver.findElement(By.xpath("//a[contains(text(),'Add')]")).getAttribute("onclick");
		System.out.println(attri);
		Thread.sleep(2000);
		Alert aler=driver.switchTo().alert();
		aler.accept();
		driver.close();
	}
}
