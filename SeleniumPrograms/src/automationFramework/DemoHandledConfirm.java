package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHandledConfirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[3]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
		Alert aler=driver.switchTo().alert();
		String name=aler.getText();
		System.out.println(name);
		aler.accept();
		//aler.dismiss();
		String result=driver.findElement(By.id("demo")).getText();
		System.out.println(result);

	}

}
