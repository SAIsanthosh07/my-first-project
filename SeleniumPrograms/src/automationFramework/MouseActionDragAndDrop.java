package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Element1 = driver.findElement(By.id("draggable"));
		WebElement Element2 = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Element1, Element2).build().perform();
		driver.switchTo().newWindow(WindowType.TAB);
		
		

	}

}
