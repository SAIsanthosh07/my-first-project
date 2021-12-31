package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("D:\\sudha.txt");
        WebElement button=driver.findElement(By.id("terms"));
        button.click();
        driver.findElement(By.id("submitbutton")).click();
	}

}
