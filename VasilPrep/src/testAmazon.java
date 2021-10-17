import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Now closing location prompt
		driver.findElement(By.xpath("( //input[@class='a-button-input'])[1]")).click();
		Thread.sleep(2000);
		
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		
		//Applying filters
		
		//Customer rating
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
		Thread.sleep(2000);
		
		//brand
		WebElement chkbox_brand=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]"));
		chkbox_brand.click();
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(2000);
		
		//select pricing
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click();
		Thread.sleep(2000);
		
		//Using WebElement and select class
	/*	WebElement element= driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		
		Select price_select= new Select(element);
		price_select.selectByIndex(2);
		Thread.sleep(2000); */
		
		//selecting RAM
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[56]")).click();
		Thread.sleep(2000);
		
		//displaying result in console
        List<WebElement> search_results= driver.findElements(By.xpath("//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20']"));
		System.out.println(search_results.size()); //div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16']
		
		for(WebElement search:search_results) {
			String s1=search.getText();
			String s2=search.getAttribute("href");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println("===============");
		
			
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
