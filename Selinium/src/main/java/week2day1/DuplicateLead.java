package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();	
		driver.findElementByXPath("//form[@method = 'POST']/div[@class = 'x-tab-panel']/div[@class = 'x-tab-panel-header x-unselectable']/div[@class = 'x-tab-strip-wrap']/ul[@class = 'x-tab-strip x-tab-strip-top']/li[3]").click();
		driver.findElementByXPath("//label[text() = 'Email Address:']//parent::div/div/input[@type = 'text']").sendKeys("shanti.2193@gmail.com");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext']").click();
		driver.findElementByXPath("//a[text() = 'Duplicate Lead']").click();
		driver.findElementByXPath("//input[@class = 'smallSubmit']").click();
		String title = driver.findElementByXPath("//a[text()= 'Duplicate Lead']").getText();
		System.out.println("The Title is:"+title);
		
		WebElement fname= driver.findElementById("viewLead_firstName_sp");
		String fname1= fname.getText();
		System.out.println("The captured name is:" +fname1);
		driver.close();
	}

}
