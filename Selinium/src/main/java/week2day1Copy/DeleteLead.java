package week2day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();	
		Thread.sleep(5000);
		driver.findElementByXPath("//form[@method = 'POST']/div[@class = 'x-tab-panel']/div[@class = 'x-tab-panel-header x-unselectable']/div[@class = 'x-tab-strip-wrap']/ul[@class = 'x-tab-strip x-tab-strip-top']/li[2]").click();
driver.findElementByXPath("//td[@class = 'x-table-layout-cell']/div/div/div/input[@name = 'phoneNumber']").sendKeys("8754388065");
driver.findElementByXPath("//button[contains(text(), 'Find Leads')]").click();
Thread.sleep(5000);
driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext']").click();
driver.findElementByXPath("//a[text() = 'Delete']").click();
driver.findElementByLinkText("Find Leads").click();	
driver.findElementByXPath("//label[text() = 'Lead ID:']//parent::div/div/input[@type = 'text']").sendKeys("10405");
Thread.sleep(5000);
driver.findElementByXPath("//button[contains(text(), 'Find Leads')]").click();
driver.close();
	}

}
