package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create Driver object for chrome browser
		//first invoke .exe file
		//we will strictly implement methods  for WebDriver
		try {
		System.setProperty("webdriver.chrome.driver","D:\\videos\\selenium\\selenium_setup_files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");      //hit url on browser
		System.out.println(driver.getTitle());   //validate if your page title is correct
		System.out.println(driver.getCurrentUrl());     //validate if you landed on correct url
		System.out.println(driver.getPageSource());	
//		driver.get("http://youtube.com"); 
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.close();
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
	}

}
