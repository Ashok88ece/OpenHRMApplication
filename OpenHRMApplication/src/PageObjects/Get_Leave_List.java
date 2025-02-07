package PageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;

public class Get_Leave_List extends CommonFunction {
	
	
	@Test(priority=0)
	public void getleaveinfo() {
		
		PageFactory.initElements(driver, Login_Page_Objects.class);
		 Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		 Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		 Login_Page_Objects.submitButton.click();
	}
	
	@Test(priority=1)
	public void toVerifydashboardMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.DashboardMenu.click();
		System.out.println("Dashboard Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}
	
	@Test(priority=2)
	
	public void toGetLeaveList() {
		PageFactory.initElements(driver, Dashboard.class);
		Dashboard.LeaveList.click();
	}
	
	@Test(priority=3)
	
	public void searchemployee() {
		PageFactory.initElements(driver, Leave.class);
		Leave.EmployeeName.sendKeys("Kumar Kumar Kumar");
	}
}
