import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dailyPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initial setup
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//search smart phone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		//Now, applying filters
		
		//Brand selection
		driver.findElement(By.xpath("//li[@id='p_89/ONEPLUS']//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(2000);
		
	/*	//using WebElement
		WebElement chkbox_brand = driver.findElement(By.xpath("//li[@id='p_89/ONEPLUS']"));
		chkbox_brand.click(); */
		
		//Customer rating
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
		Thread.sleep(2000);
		
		//price range
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click();
		
		//Ram
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[47]")).click();
		Thread.sleep(2000);
		
 
		//Printing result as list
		List<WebElement> search = driver.findElements(By.xpath("//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20']"));
		System.out.print("No of results: ");
		System.out.println(search.size()); //prints no of results
		for(WebElement print_result:search) {
			
			String s1= print_result.getText();
		//	String s2= print_result.toString();
			String s3= print_result.getAttribute("src");
			System.out.println(s1);
		//	System.out.println(s2);
			System.out.println("===============");
		}
	
		
		
		//driver.quit();

	}

}
