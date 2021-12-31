package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakingScreenshotMultiple {
	public static WebDriver driver;

	@Test
	public void screenshot() throws Exception{
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("SubmitCreate")).click();
		getscreenshot();
	}

	private static void getscreenshot() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        Thread.sleep(5000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\Selenium\\screenshotsDemo\\Screenshot" +System.currentTimeMillis()+ ".png"));

	}

}
