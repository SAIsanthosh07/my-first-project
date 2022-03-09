package Medeilhq.MedeilLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Login {
	WebDriver driver;
  @BeforeSuite
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","src/main/java/testresource/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://medeilhq.medeil.io/medeilhq/#/userlogin/login");
  }
  @Test
  public void a_login() throws java.lang.InterruptedException   {
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name("username")).sendKeys("venkateshtitaniumhq@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys("Medeil");
	  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	  Thread.sleep(7000);
	  System.out.println(driver.getTitle());
  }
  @Test
  public void b_addemployee() throws InterruptedException {
	  Thread.sleep(7000);
	  driver.findElement(By.xpath("//label[contains(text(),'Account Payable')]//following::em[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='HRMS']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Employee Register']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
	  Thread.sleep(2000);
	  WebElement e_Title=driver.findElement(By.name("select"));
	  Select sel=new Select(e_Title);
	  Thread.sleep(2000);
	  sel.selectByVisibleText("Mr.");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//label[contains(text(),'First')]//following::input[1]")).sendKeys("pandi");
	  driver.findElement(By.xpath("//label[contains(text(),'First')]//following::input[2]")).sendKeys("pandi");
	  WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'First')]//following::input[3]"));
	  gender.click();
	  System.out.println(gender.isEnabled());
	  WebElement e_Mode=driver.findElement(By.xpath("(//select[@name='select'])[2]"));
	  Select sel1=new Select(e_Mode);
	  Thread.sleep(3000);
	  sel1.selectByVisibleText("Permanent");
	  WebElement e_Type=driver.findElement(By.xpath("(//select[@name='select'])[3]"));
	  Select sel2=new Select(e_Type);
	  Thread.sleep(3000);
	  sel2.selectByVisibleText("Full Time Hourly");
	 driver.findElement(By.xpath("(//select[@name='select'])[4]/option[contains(text(), 'sales')]")).click();
	 // driver.findElement(By.xpath("//button[contains(text(),'Add Department')]")).click();
	 // driver.findElement(By.id("genericnumber")).sendKeys("Deliv");
	  //driver.findElement(By.id("type")).click();
	  Thread.sleep(4000);
	  WebElement date= driver.findElement(By.xpath("//form[@class='mx-2 ng-untouched ng-pristine ng-invalid']//input[@placeholder='Enter your joining date']"));
	  driver.switchTo().frame(date);
	 // WebElement date=driver.findElement(By.xpath("(//label[contains(text(),'Date')])[1]//following::input[1]"));
	  //date.click();
	  //Select date1=new Select(date);
	  //date1.selectByVisibleText("01May2022");
	  //Actions act=new Actions(driver);
	  Thread.sleep(2000);
	 // date.sendKeys("01Mar");
	  //act.sendKeys(Keys.TAB);
	  //Thread.sleep(2000);
	 // date.sendKeys("2021");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("(//label[contains(text(),'Date')])[1]//following::input[2]")).click();
	  driver.findElement(By.xpath("(//label[contains(text(),'Date')])[1]//following::input[5]")).sendKeys("7010911215");
	  Thread.sleep(5000);
	 WebElement save= driver.findElement(By.xpath("(//button[contains(text(),'Save')])[1]"));
	  Thread.sleep(5000);
	  save.click();
	  System.out.println(save.isDisplayed());
  }

  @AfterSuite
  public void tearDown() {
	  //driver.close();
  }
}
