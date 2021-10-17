import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.event.*;

public class realTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
	/*	WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.quit(); //close first website */
		
	/*	WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.flipkart.com");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//closing login modal
		driver1.findElement(By.className("_2doB4z")).click();
		
		//searching product
		driver1.findElement(By.className("_3704LK")).sendKeys("iphone6");
		driver1.findElement(By.className("L0Z3Pu")).click();
		
		//applying filters
		driver1.findElement(By.xpath("//a[@title='Mobiles']")).click();
		
		//using WebElements
		WebElement chkbox_flpkrt= driver1.findElement(By.className("_3tCU7L"));
		chkbox_flpkrt.click();
		Thread.sleep(2000);
		
		WebElement chkbox_ram=driver1.findElement(By.xpath("//div[@title='Less than 512 MB']"));
		chkbox_ram.click();
		Thread.sleep(2000);
		
		WebElement chkbox_brand=driver1.findElement(By.xpath("//div[@title='APPLE']"));
		chkbox_brand.click();
		Thread.sleep(2000);
		
		WebElement chkbox_review= driver1.findElement(By.xpath("//div[@title='4★ & above']"));
		chkbox_review.click();
		Thread.sleep(2000);
		
		//displaying results as list on console
		List<WebElement> search_result =driver1.findElements(By.xpath("//a[@class='_1fQZEK']"));
		System.out.println(search_result.size());
		
		for(WebElement search:search_result) {
			String s1=search.getText();
			String s2=search.getAttribute("href");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println("==================");
			
			
		} */ //Closing Flipkart
		
		WebDriver driver3=new ChromeDriver();
		driver3.get("file:///C:/Users/Hasib-PC/Desktop/popup_test.html");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click pop-up button
		driver3.findElement(By.id("PopUp")).click();
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.mouseMove(400,15);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		
		driver3.quit();

	}

}
