import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Selenium Code:
		
		/*Create driver object for Chrome Driver 
		Set Properties to invoke the Chrome browser*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revam\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		/*driver.findElement(By.name("q")).sendKeys("flowers");
		driver.findElement(By.className("gNO89b")).click();*/
		
		
		
		/*System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		 //close the current browser
		//driver.quit(); //closes all the browsers which are opened by selenium script */
		
		

	}

}
