import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.util.List;
import java.util.*;

import org.openqa.selenium.interactions.Actions;
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_3704LK")).sendKeys("iphone6");
		driver.findElement(By.className("L0Z3Pu")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("_1jJQdf")).click();
		
	/*	driver.findElement(By.className("_1YAKP4")).click(); //price min
		Thread.sleep(1000);
		
		WebElement element1= driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]")); //_2YxCDZ
		Select min_price= new Select(element1);
		Thread.sleep(1000);
		min_price.selectByValue("4000"); */
		
	//	driver.findElement(By.xpath(prop.getProperty("(//select[@class='_2YxCDZ'])[1]")+"/option[text()='"+priceMin+"']")).click();
		
		
	/*	min_price.selectByValue("4000");
		min_price.selectByVisibleText("4000");
		min_price.deselectAll(); 
		
		driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]")).click();
		Thread.sleep(2000);		
		Select max_price= new Select(driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]")));
	    Thread.sleep(5000);
		max_price.selectByIndex(2); */
		

		
		
		
		

	/*	//max_price.selectByVisibleText("50000");
		//min_price.deselectAll(); */
		
		WebElement chkbox_flpkart_assured= driver.findElement(By.className("_3tCU7L")); //("_24_Dny _3tCU7L"));	
		chkbox_flpkart_assured.click(); 
		
		Thread.sleep(2000);
		WebElement chkbox_ram = driver.findElement(By.xpath("//div[@title='Less than 512 MB' and@class='_4921Z t0pPfW']"));
		chkbox_ram.click();
		Thread.sleep(2000);
		Boolean b= chkbox_ram.isSelected();
	//	System.out.println(b);
		
		WebElement chkbox_brand= driver.findElement(By.xpath("//div[@title='APPLE' and @class='_4921Z t0pPfW']"));
		chkbox_brand.click();
		Thread.sleep(2000);
		
		WebElement chkbox_ratings= driver.findElement(By.xpath("//div[@title='4★ & above' and @class='_4921Z t0pPfW']"));
		chkbox_ratings.click();
		Thread.sleep(5000);
		
		List<WebElement> search_results = driver.findElements(By.xpath("//a[@class='_1fQZEK']"));
		System.out.println(search_results.size());
		for(WebElement results: search_results) {
			System.out.println("======================");
			String value= results.getText();
			String link= results.getAttribute("href");
			System.out.println(value); 
			System.out.println(link); 
			System.out.println("======================");
			
			
		} 
		}

}

