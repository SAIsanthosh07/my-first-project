package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert aler=driver.switchTo().alert();
		String popup=aler.getText();
		System.out.println(popup);
		aler.accept();
		//aler.dismiss(); if you click cancel button using this method
		String result=driver.findElement(By.id("confirmResult")).getText();
		System.out.println(result);
	}

}
