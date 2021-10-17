import java.util.Iterator; 
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.AWTException;
import java.awt.Robot;	
//import java.awt.event.InputEvent;	
import java.awt.event.*;	

public class Popup_Demo { 
	
public static void main(String[] args) throws InterruptedException, AWTException { 
System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); driver.get("file:///C:/Users/Hasib-PC/Desktop/popup_test.html"); 
driver.manage().window().maximize(); 
Thread.sleep(2000);
driver.findElement(By.id("PopUp")).click(); // Clicking on the popup button
Robot robot = new Robot();
robot.mouseMove(400,15); // Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
Thread.sleep(2000);
robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
Thread.sleep(5000);
driver.quit();
}
}