package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double' )]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		Alert alr = driver.switchTo().alert();
		String text = alr.getText();
		System.out.println(text);
		alr.accept();
		

	}

}
