 package testCases;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Dashboard;
import PageObjects.Leave;
import PageObjects.Login_Page_Objects;
import PageObjects.Orange_HRM_Menus_Objects;
import PageObjects.admin_Page_Objects;
import commonFunctions.CommonFunction;

public class Test_Pending_Leave_Request extends CommonFunction {
	
	String actualMessage = null;
	
	@Test (priority=0)
	public void getPendingLeaveRequests() throws InterruptedException {
		PageFactory.initElements(driver, Login_Page_Objects.class);
		 Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		 Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		 Login_Page_Objects.submitButton.click();
		 //PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		 
		// String actualMessage = Dashboard_Page_Objects.pendingLeaveRequests.getText();
		 
		// Assert.assertEquals(actualMessage,"No Records are Available");
		// Thread.sleep(10000);
		 
		 System.out.println("User Logged into application successfully");
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=1)
	
	public void toVerifydashboardMenu() throws InterruptedException  {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.DashboardMenu.click();
		System.out.println("Dashboard Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}
	
	@Test(priority=3)
		public void toGetLeaveList() {
			PageFactory.initElements(driver, Dashboard.class);
			Dashboard.LeaveList.click();
		}
	
	@Test(priority=4)
	public void searchemployee() {
		PageFactory.initElements(driver, Leave.class);
		Leave.EmployeeName.sendKeys("manda akhil user");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
		System.out.println(elements.size());
		
		
	}

	
		
	}
	
	

