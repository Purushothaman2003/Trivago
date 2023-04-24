package CA_2;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions;
public class Question_1 {
WebDriver driver; 
@Test(priority=1)
public void Mandatory() {
	ChromeOptions co=new ChromeOptions(); 
	co.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup(); 
	driver=new ChromeDriver(co);
	driver.navigate().to("https://www.trivago.in/"); 
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "trivago.in - Compare hotel prices worldwide");
}
@Test(priority=2) 
public void tc01()
{
	
			driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]")).sendKeys("Pondicherry");
     		driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]")).sendKeys(Keys.ENTER);
}
@Test(priority=3)
public void tc02() throws InterruptedException 
{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldse t/button[1]")).click();
     Thread.sleep(3000); 
     driver.findElement(By.xpath("//time[@datetime=\"2023-05-01\"]")).click(); 
     driver.findElement(By.xpath("//time[@datetime=\"2023-05-06\"]")).click();
}
@Test(priority=4)
public void tc03()
{
			driver.findElement(By.xpath("//button[@data-testid=\"adults-amount-plus-button\"]")).click();
}
@Test(priority=5)
public void tc04() throws InterruptedException 
{
	Thread.sleep(3000); 
	driver.findElement(By.xpath("//input[@id=\"checkbox-13\"]")).click();
	driver.findElement(By.xpath("//button[@data-testid=\"search-button\"]")).click(); 
	Thread.sleep(30000);
}
@Test(priority=6) 
public void tc05() throws InterruptedException 
{
	driver.findElement(By.xpath("//label[@data-title=\"Hotel\"]")).click(); 
	Thread.sleep(3000);
}
@Test(priority=7)
public void tc06() 
{
	driver.findElement(By.xpath("//button[@title=\"All\"]/span")).click();
}
}
