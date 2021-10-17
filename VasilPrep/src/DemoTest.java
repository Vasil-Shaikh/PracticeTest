import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;


public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
	WebDriver vasil = new ChromeDriver();
	vasil.get("https://www.flipkart.com");
	
	//vasil.switchTo().window("_2QfC02");
	vasil.findElement(By.className("_2doB4z")).click();
	//vasil.findElement(By.name("q")).sendKeys("Dell");
	
	

	vasil.findElement(By.className("_3704LK")).sendKeys("Dell");
	//vasil.findElement(By.xpath("//input[@value='Search']")).click();
	vasil.findElement(By.className("L0Z3Pu")).sendKeys(Keys.ENTER);
	}

}
 