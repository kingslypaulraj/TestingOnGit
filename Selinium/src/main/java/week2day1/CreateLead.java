package week2day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// TODO Auto-generated method stub
//				ChromeOptions dr = new ChromeOptions();
//				dr.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
		driver.findElementById("createLeadForm_firstName").sendKeys("Shanthi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kingsly");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select bb = new Select(source);
		List<WebElement> allSource = bb.getOptions();
		bb.selectByVisibleText("Employee");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Shanthi");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Miss");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Selenium");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("30 Million");
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select aa = new Select(Industry);
		aa.selectByVisibleText("Insurance");
		List<WebElement> allOptions = aa.getOptions();
//		int size = allOptions.size();
//		System.out.println(size);
//		for (WebElement each : allOptions) 
//		{
//			String text = each.getText();	
//			System.out.println("All Options from dropdown: "+text );
//		}
		
//		List<WebElement> allDrop = driver.findElementsByTagName("select");
//		int select = allDrop.size();
//		System.out.println(select);
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select cc = new Select(owner);
		cc.selectByVisibleText("Partnership");
		List<WebElement> allOwner = cc.getOptions();
		owner.sendKeys(Keys.TAB);
		driver.getTitle();
		driver.findElementById("createLeadForm_sicCode").sendKeys("5541");
		driver.findElementById("createLeadForm_description").sendKeys("This is an institute for Selenium training");
		driver.findElementById("createLeadForm_importantNote").sendKeys("We are giving our best");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("0421");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("0421");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("shanti.2193@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Shanthi");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("157");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Tiruppur");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("641652");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("641652");
//		driver.findElementById("createLeadForm_parentPartyId").sendKeys("1993");
		WebElement camp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select market = new Select(camp);
		List<WebElement> allCampaign = market.getOptions();
		market.selectByValue("9000");
		camp.sendKeys(Keys.TAB);
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Rajendran");
		driver.findElementById("createLeadForm_birthDate").sendKeys("12/21/93");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select preCurrency = new Select(currency);
		List<WebElement> allCurrency = preCurrency.getOptions();
		preCurrency.selectByValue("INR");
		currency.sendKeys(Keys.TAB);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("15");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("123");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8754388065");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Shanthi");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.abc.com");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Shanthi");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Nehru nagar 1st Street");
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select ddCountry = new Select(country);
		ddCountry.selectByVisibleText("India");
		List<WebElement> allCountry = ddCountry.getOptions();
		
//		WebElement provi = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
//		Select allProvi = new Select(provi);
//		List<WebElement> allState = allProvi.getOptions(); 
//		allProvi.selectByVisibleText("TAMILNADU");
		
		
		driver.findElementByClassName("smallSubmit").click();
		
		WebElement fname= driver.findElementById("viewLead_firstName_sp");
		String fname1= fname.getText();
		System.out.println("The first name is:" +fname1);
	
	}
}

