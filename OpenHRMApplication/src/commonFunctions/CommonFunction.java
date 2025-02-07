package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class CommonFunction {
	
	public static WebDriver driver = null;
	public static Properties properties=null;
	
	
	
	public Properties loadPropertyFile() throws IOException {
		
		//property file load and return
		
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		
	    properties = new Properties();
		
		properties.load(fileInputStream);
		
		return properties;
		
	}
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		loadPropertyFile();
		
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverlocation = properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverlocation);
			
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("Browser Not Found");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
		System.out.println("Orange HRM Signedout Successfully");
		
		
	}

}
