import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class TueOct {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String s1= driver.getTitle();
		System.out.println("The title is: "+s1);
		
		//Searching product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart phones");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		//Applying filters
		
		//Brand
		driver.findElement(By.xpath("//li[@id='p_89/ONEPLUS']//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(2000);
		
	/*	WebElement chkbox1 = driver.findElement(By.xpath("//li[@id='p_89/ONEPLUS']//i[@class='a-icon a-icon-checkbox']"));
		chkbox1.click(); */
		
		//Customer ratings
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
		Thread.sleep(2000);
		
		//price range
		driver.findElement(By.id("a-autoid-0-announce")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click();
		Thread.sleep(2000);
		
		//Selecting RAM
		driver.findElement(By.xpath("//li[@id='p_n_feature_twelve_browse-bin/14674911011']//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(2000);
		
		
		//Displaying results on console
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20']"));
		System.out.println("The no.of results on the page is:" +results.size());
		System.out.println("====================================");
		for(WebElement search_res:results) {
			String s2= search_res.getText();
			String s3= search_res.getAttribute("");
			System.out.println(s2);
			System.out.println("====================================");
			
		}
		
		
		TakesScreenshot ss1= ((TakesScreenshot)driver);
		File src_img=ss1.getScreenshotAs(OutputType.FILE);
		File dest_img = new File("C:\\selenium screenshots\\tues_october.png");
		FileHandler.copy(src_img, dest_img);

	}

}
