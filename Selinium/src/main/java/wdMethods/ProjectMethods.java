package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods extends SeMethods{
	@BeforeMethod(groups= {"common"})
	public void login()
	{
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		WebElement username = locateElement("id", "username");
		type(username,"Demosalesmanager");
		WebElement password = locateElement("id", "password");
		type(password, "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		WebElement crm = locateElement("linktext", "CRM/SFA");
		click(crm);
	}
	@AfterMethod(groups= {"smoke","regression"})
	public void closebrws()
	{
		closeBrowser();
	}

}
