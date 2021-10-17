import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		 Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.id("confirmButton")).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().dismiss();
	   
	    Thread.sleep(1000);
	   driver.quit();
		
	}

}
