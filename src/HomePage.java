import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class HomePage {
	
	
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhikatandon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//C:\Users\shubhikatandon\Downloads\chromedriver_win32
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/company-preparation");
		WebElement button = driver.findElement(By.className("ButtonContribute"));
		button.sendKeys("Microsoft");
		//WebElement search =driver.findElement(By.className("gsc-search-button gsc-search-button-v2"));
		//search.click();
		System.out.println(driver.getWindowHandle()); 
		
		System.out.println("Hello");
		driver.quit();
	}

}
