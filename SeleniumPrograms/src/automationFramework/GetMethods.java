package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String page=driver.getTitle();
		System.out.println(page);
		driver.findElement(By.id("signin_button")).click();
		//page=driver.getCurrentUrl();
		//System.out.println(page);
		String login=driver.getCurrentUrl();
	    System.out.println(login);
	   String forgot= driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
	   System.out.println(forgot);
	   String login1=driver.findElement(By.xpath("//h3[contains(text(),'Log')]")).getText();
	   System.out.println(login1);
	   String LOGIN=driver.findElement(By.id("user_login")).getTagName();
	   System.out.println(LOGIN);
	   String attri=driver.findElement(By.id("user_login")).getAttribute("autocomplete");
	   System.out.println(attri);
	   String forgotattri= driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getAttribute("href");
	   System.out.println(forgotattri);
	   String css= driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getCssValue("font-size");
	   System.out.println(css);
	   
	}

}
