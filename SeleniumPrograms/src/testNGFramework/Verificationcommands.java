package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verificationcommands {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}
	@Test
	public void b_radioButton() {
		WebElement education = driver.findElement(By.id("radio-button-2"));
		education.click();
		System.out.println(education.isEnabled());
	}
	@Test
	public void c_gender() {
		WebElement gender = driver.findElement(By.id("checkbox-3"));
		gender.click();
		System.out.println(gender.isSelected());
	}
   @Test
   public void d_text() {
	   WebElement text =driver.findElement(By.xpath("//h1[contains(text(),'Complete')]"));
	   System.out.println(text.isDisplayed());
   }
}
