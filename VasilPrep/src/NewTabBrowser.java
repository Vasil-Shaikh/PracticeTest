import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewTabBrowser {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    driver.get("https://business.twitter.com/en/solutions/twitter-ads.html");

    driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");

    Set <String> windowHandles = driver.getWindowHandles();

    System.out.println(windowHandles.size());

    for(String winHandle : driver.getWindowHandles()){

        driver.switchTo().window(winHandle);

    }

    driver.navigate().to("http://www.google.com");

}

}