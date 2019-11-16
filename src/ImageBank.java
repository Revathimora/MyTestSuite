import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageBank {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revam\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://imagebankwebapptest.azurewebsites.net");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("revathi.mora@hm.com");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		//driver.navigate().refresh();
		
		//driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/mat-option[1]/span")).click();
		
		
		

	}

}
