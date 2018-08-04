package SeMethodsAllTC;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;
public class DuplicateLead  extends ProjectMethods
{
public void duplicate() throws InterruptedException 
{
WebElement crelead = locateElement("linktext", "Create Lead");
click(crelead);
WebElement flead = locateElement("linktext", "Find Leads");
click(flead);
WebElement dlead = locateElement("xpath", "//form[@method = 'POST']/div[@class = 'x-tab-panel']/div[@class = 'x-tab-panel-header x-unselectable']/div[@class = 'x-tab-strip-wrap']/ul[@class = 'x-tab-strip x-tab-strip-top']/li[3]");
click(dlead);
WebElement name = locateElement("//label[text() = 'Email Address:']//parent::div/div/input[@type = 'text']");	
type(name, "Kingslypaulraj22@gmail.com");
WebElement clik = locateElement("xpath", "//button[text() = 'Find Leads']");
click(clik);
Thread.sleep(5000);
WebElement lele = locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext']");
click(lele);
WebElement dulead = locateElement("xpath","//a[text() = 'Duplicate Lead']");
click(dulead);
WebElement search = locateElement("xpath","//input[@class = 'smallSubmit']");
click(search);
WebElement duplead = locateElement("xpath","//a[text()= 'Duplicate Lead']");
getText(duplead);
System.out.println("The Title is:"+duplead);
		
		WebElement fname= driver.findElementById("viewLead_firstName_sp");
		String fname1= fname.getText();
		System.out.println("The captured name is:" +fname1);
		driver.close();
	}

}
