package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.saucedemo.com");
  driver.manage().window().maximize();
  driver.findElement(By.id("user-name")).sendKeys("standard_user");
  driver.findElement(By.name("password")).sendKeys("secret_sauce");
  driver.findElement(By.xpath("//input[@id='login-button']")).click();
  driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
  driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
  driver.findElement(By.xpath("(//button[text()='Add to cart'])[3]")).click();
  driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']/following::a[5]")).click();
  driver.findElement(By.xpath("(//button[text()='Remove'])[3]")).click();
  driver.findElement(By.id("checkout")).click();
  driver.findElement(By.id("first-name")).sendKeys("santhosh");
  Thread.sleep(2000);
  driver.findElement(By.id("last-name")).sendKeys("pandi");
  Thread.sleep(2000);
  driver.findElement(By.id("postal-code")).sendKeys("600015");
  Thread.sleep(2000);
  driver.findElement(By.id("continue")).click();
  Thread.sleep(2000);
  driver.findElement(By.id("finish")).click();
  String pagetitle=driver.getTitle();
  System.out.println(pagetitle);
  String pageUrl=driver.getCurrentUrl();
  System.out.println(pageUrl);
  String name=driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText();
  System.out.println(name);
  String para=driver.findElement(By.xpath("//div[starts-with(text(),'Your')]")).getText();
  System.out.println(para);
  String image=driver.findElement(By.xpath("//div[starts-with(text(),'Your')]/following::img[1]")).getTagName();
  System.out.println(image);
  String attri=driver.findElement(By.xpath("//div[starts-with(text(),'Your')]/following::img[1]")).getAttribute("alt");
  System.out.println(attri);
  String value=driver.findElement(By.xpath("//div[starts-with(text(),'Your')]/following::img[1]")).getCssValue("font-size");
  System.out.println(value);
  /**Thread.sleep(2000);
  driver.findElement(By.id("back-to-products")).click();
  Thread.sleep(2000);
  //System.out.println(driver.getTitle());
  //System.out.println(driver.getCurrentUrl());
  Thread.sleep(3000);
  driver.findElement(By.id("react-burger-menu-btn")).click();
  Thread.sleep(3000);
  driver.findElement(By.id("logout_sidebar_link")).click();
  Thread.sleep(3000);
  driver.close();*/
     
	}

}
