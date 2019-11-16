import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Selenium Code:
		
		/*Create driver object for Chrome Driver 
		Set Properties to invoke the Chrome browser*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revam\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Finding elements using cssSelector - customized
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("testlogin");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("testpwd");
		driver.findElement(By.cssSelector("input#Login")).click();
		 
		
		// Finding elements using xpath - customized
		
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testlogin");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("testpwd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); */
		
		
		/*driver.findElement(By.name("username")).sendKeys("testlogin");
		driver.findElement(By.id("password")).sendKeys("testpwd");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText()); */
		//driver.close();
		
	}

}
