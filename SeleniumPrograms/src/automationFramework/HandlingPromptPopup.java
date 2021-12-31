package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("promtButton")).click();
		Alert aler=driver.switchTo().alert();
		String popup=aler.getText();
		System.out.println(popup);
		aler.sendKeys("santhoshPandi");
		aler.accept();
		String result =driver.findElement(By.id("promptResult")).getText();
		System.out.println(result);
	}

}
