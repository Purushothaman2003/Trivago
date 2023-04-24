package CA_2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Question_2 {
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

driver.findElement(By.xpath("//button[@data-testid=\"search-button\"]")).click();
}

@Test(priority=2)
public void tc01() {
Select select=new
Select(driver.findElement(By.xpath("//select[@id=\"sorting-selector\"]")));
select.selectByIndex(3);
}
@Test(priority=3)
public void tc02() {

System.out.println(driver.findElements(By.xpath("//button[@data-testid=\"item-name\"]")).get(0).getText()+" ");

}
@Test(priority=4)
public void tc03() throws InterruptedException {
Select select=new
Select(driver.findElement(By.xpath("//select[@id=\"sorting-selector\"]")));
select.selectByIndex(1);
Thread.sleep(3000);
}
@Test(priority=5)
public void tc04() {
List<WebElement>
names=driver.findElements(By.xpath("//button[@data-testid=\"item-name\"]/span"));
for(WebElement ele:names)
System.out.print(ele.getText()+" ");
System.out.println();
}

@Test(priority=6)
public void tc05() {
System.out.println("Stays found :"+driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]/strong")).getText());
}
@Test(priority=7)
public void tc06() {
System.out.println("Booking sites reached:"+driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/span[2]/strong\n")).getText());

}
}
