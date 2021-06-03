package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","D:\\videos\\selenium\\selenium_setup_files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("http://facebook.com");      //hit url on browser
//			driver.findElement(By.id("email")).sendKeys("username");
//			driver.findElement(By.id("pass")).sendKeys("password");
//			driver.findElement(By.linkText("Forgotten account?")).click();        //linkText is helpful when you dont have id or name locators 
//			
			driver.get("http://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("hello");
			driver.findElement(By.id("password")).sendKeys("password");
			driver.findElement(By.xpath("//*[@id='Login']")).click();          //here inside we used single quotes in xpath
			System.out.println(driver.findElement(By.id("error")).getText());    //printing error message if occurs
//
//			driver.get("http://facebook.com");      //hit url on browser
//			driver.findElement(By.cssSelector("#email")).sendKeys("username");      //cssSelector is used
//			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
//			driver.findElement(By.name("login")).click();
			//driver.close();
			}catch(Exception e) {
				System.out.print(e);
			}
	}

}
