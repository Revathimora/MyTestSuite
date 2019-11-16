import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revam\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Finding elements using cssSelector - customized
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		
		//Finding element using Parent-Child Relationship and traverse
		//driver.findElement(By.xpath("//div[@class='gb_h gb_i']/a")).click();
		
	}

}
