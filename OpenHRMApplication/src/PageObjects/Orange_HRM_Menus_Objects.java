package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orange_HRM_Menus_Objects {
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	public static WebElement PIMMenu;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
	public static WebElement leaveMenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")
	public static WebElement timeMenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
	public static WebElement recruitmentMenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
	public static WebElement myInfoMenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a")
	public static WebElement performanceMenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")
	public static WebElement DashboardMenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a")
	public static WebElement directoryMenu;
	
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a")
	public static WebElement maintenanceMenu;
	
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a")
	public static WebElement buzzMenu;
	
	
	
	
	
	
}
