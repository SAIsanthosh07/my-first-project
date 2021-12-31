package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("santhospandi30595@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("password")).sendKeys("9843926295");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		driver.findElement(By.name("to")).sendKeys("Keerthanastat16@gmail.com");
		driver.findElement(By.id(":yi")).sendKeys("LOVE LETTER");
		driver.findElement(By.id(":zo")).sendKeys("i am sry ena manichuru ammu love u d pondatti");
		driver.findElement(By.id(":y8")).click();
		
	}

}
