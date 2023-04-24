package CA_2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Question_3 {
WebDriver driver;
@Test(priority=1)
public void Mandatory() throws InterruptedException {
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver(co);
driver.navigate().to("https://www.trivago.in/en-IN/lm/hotels-pondicherry-india?search=101-2;101-5;101-53;101-6;101-9;200-64948;dr-20230501-20230506");
driver.manage().window().maximize();
Thread.sleep(35000);
System.out.println(driver.getTitle());

driver.findElement(By.xpath("//button[@data-testid=\"search-button\"]")).click
();
}


@Test(priority=2)
public void tc01() {
List<WebElement>
names=driver.findElements(By.xpath("//button[@data-testid=\"item-name\"]/span"
));
for(int i=0;i<5;i++)
System.out.println(names.get(i).getText()+" ");
System.out.println();
}

@Test(priority=3)
public void tc02() throws InterruptedException {

driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[2]/button")).click();
Thread.sleep(5000);
System.out.println(driver.getTitle());
}
@Test(priority=4)
public void tc03() {
System.out.println("Price :"+driver.findElement(By.xpath("//*[@id=\"contentContainer\"]/div[3]/ol/li[1]/div[2]/a/div/div[3]/div/div[2]/aside[2]/ul/li[2]/div/span[3]")).getText());
}

@Test(priority=5)
public void tc04() throws InterruptedException {


driver.findElement(By.xpath("//*[@id=\"contentContainer\"]/div[3]/ol/li[1]/div[2]/a/div/div[3]/div/div[3]/button")).click();
Thread.sleep(5);
}

@Test(priority=6)
public void tc05() {

driver.findElement(By.xpath("//*[@id=\"ChildRoom-CiII6OyUxQQQAiDiAyi4x5ANMARKCzFEMTAwUF8xMDBQUJgFEgYIASICBGwaBCgEMAE=\"]/div/div[4]/div[2]/div/div[1]/button")).click();
}

@Test(priority=7)
public void tc06() {
driver.findElement(By.xpath("//input[@title=\"Please enter firstname\"]")).sendKeys("Purushothaman S");
driver.findElement(By.xpath("//input[@title=\"Please enter a valid email address so we can send you your bookingconfirmation.\"]")).sendKeys("purushoth24@gmail.com");
driver.findElement(By.xpath("//input[@title=\"Please make surethe “Email” and “Retype email” fieldsmatch.\"]")).sendKeys("purushoth24@gmail.com");
}

@Test(priority=8)
public void tc07() {

System.out.println(driver.findElement(By.xpath("//*[@id=\"SiteContent\"]/div/div[2]/div[2]/div[2]/div[1]/h4/span[1]")).getText()
		+"-"+driver.findElement(By.xpath("//*[@id=\"SiteContent\"]/div/div[2]/div[2]/div[2]/div[1]/h4/span[2]")).getText());
}


}
