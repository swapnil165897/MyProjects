package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	@Parameters("browser")
	public void test1(@Optional ("chrome") String browser) {
		
		WebDriver driver;
		
		switch (browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
		
		}
	}
	
	

}
