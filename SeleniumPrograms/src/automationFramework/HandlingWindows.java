package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		ArrayList<String> windowshandle=new ArrayList<String>(driver.getWindowHandles());
		for(String output:windowshandle) {
			System.out.println(output);
		}
        driver.switchTo().window(windowshandle.get(1));
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(windowshandle.get(2));
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(windowshandle.get(3));
        String name=driver.getTitle();
        System.out.println(name);
        driver.close();
        
	}

}
