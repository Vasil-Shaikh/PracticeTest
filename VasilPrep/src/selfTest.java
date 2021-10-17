import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;



public class selfTest {

	public static void main(String[] args) throws InterruptedException, AWTException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Hasib-PC/Desktop/popup_test.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("PopUp")).click();
	
	
	Robot robot = new Robot();
	robot.mouseMove(400,15);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(1000);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(1000);
	
	/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
	robot.keyPress(KeyEvent.VK_CONTROL); 
	robot.keyPress(KeyEvent.VK_T); 
	robot.keyRelease(KeyEvent.VK_CONTROL); 
	robot.keyRelease(KeyEvent.VK_T);
	
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(3000);

	//Launch URL in the new tab
	driver.get("http://google.com"); */
	
	driver.get("https://demoqa.com/alerts");
	Thread.sleep(2000);
	driver.findElement(By.id("alertButton")).click();
    String s = driver.switchTo().alert().getText();
    System.out.print(s);
    Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	

	driver.quit();
	
		
	}

}


