import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revam\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Finding elements using cssSelector - customized
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[contains(@id,'login')]")).sendKeys("testlogin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("testpwd");
		driver.findElement(By.cssSelector("input[name*='procee']")).click();
		
		
	}

}
