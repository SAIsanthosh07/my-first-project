package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("santhosh");
		driver.findElement(By.id("last-name")).sendKeys("pandi");
		driver.findElement(By.id("job-title")).sendKeys("testing");
        WebElement education=driver.findElement(By.id("radio-button-2"));
        education.click();
        WebElement gender=driver.findElement(By.id("checkbox-3"));
        gender.click();
        Select experience=new Select(driver.findElement(By.id("select-menu")));
        experience.selectByVisibleText("5-9");
        //experience.selectByValue("3");// if u want to using select by value any one use to automated
        driver.findElement(By.id("datepicker")).sendKeys("01/01/2020");
        driver.findElement(By.xpath("//a[text()='Submit']")).click();
	}

}
