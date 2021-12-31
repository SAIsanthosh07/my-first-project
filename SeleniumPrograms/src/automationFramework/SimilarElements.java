package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Vijay_(actor)");
		driver.manage().window().maximize();
        int link=driver.findElements(By.tagName("a")).size();
        System.out.println(link);
      int image=  driver.findElements(By.tagName("img")).size();
      System.out.println(image);
	}

}
