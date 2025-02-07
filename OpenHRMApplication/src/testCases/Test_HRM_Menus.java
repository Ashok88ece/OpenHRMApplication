package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.Login_Page_Objects;
import PageObjects.Orange_HRM_Menus_Objects;
import commonFunctions.CommonFunction;

public class Test_HRM_Menus extends CommonFunction {

	String actualMessage = null;

	@Test(priority = 0)
	public void getPendingLeaveRequests() throws InterruptedException {
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.submitButton.click();
		// PageFactory.initElements(driver, Dashboard_Page_Objects.class);

		// String actualMessage = Dashboard_Page_Objects.pendingLeaveRequests.getText();

		// Assert.assertEquals(actualMessage,"No Records are Available");
		// Thread.sleep(10000);

		System.out.println("User Logged into application successfully");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Test(priority = 1)

	public void toVerifyPIM() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.PIMMenu.click();
		System.out.println("PIM Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 2)

	public void toVerifyleaveMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.leaveMenu.click();
		System.out.println("Leave Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 3)

	public void toVerifytimeMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.timeMenu.click();
		System.out.println("Time Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 4)

	public void toVerifyrecruitmentMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.recruitmentMenu.click();
		System.out.println("Recruitment Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 5)

	public void toVerifymyInfoMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.myInfoMenu.click();
		System.out.println("My INFO Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 6)

	public void toVerifyperformanceMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.performanceMenu.click();
		System.out.println("Performance Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 7)

	public void toVerifydashboardMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.DashboardMenu.click();
		System.out.println("Dashboard Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 8)

	public void toVerifydirectoryMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.directoryMenu.click();
		System.out.println("Directory Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(enabled=false)

	public void toVerifymaintenanceMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.maintenanceMenu.click();
		System.out.println("Maintenance Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 9)

	public void toVerifybuzzMenu() throws InterruptedException {

		PageFactory.initElements(driver, Orange_HRM_Menus_Objects.class);
		Orange_HRM_Menus_Objects.buzzMenu.click();
		System.out.println("Buzz Menu Page Navigated Successfully");
		Thread.sleep(3000);

	}

}
