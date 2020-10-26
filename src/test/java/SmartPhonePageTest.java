import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.pages.HomePage;
import com.qa.verizon.pages.PhoneFeaturesPage;
import com.qa.verizon.pages.SmartPhonePage;
import com.qa.verizon.util.ElementUtil;

public class SmartPhonePageTest {
	
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;
	SmartPhonePage smartPhonePage;
	PhoneFeaturesPage phoneFeaturesPage;
	
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		String browserName = prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		homePage= new HomePage(driver);
		smartPhonePage =homePage.clickOnSmarthPhones();
		smartPhonePage = new SmartPhonePage(driver);
	    phoneFeaturesPage = smartPhonePage.clickOnIphone();
		
		}
	@Test (priority=1)
	public void verifySmarthPhonePageTitleTest(){
		String title = smartPhonePage.getSmarthPhonePageTitle();
		System.out.println("Smart phone page title is " + title);
		Assert.assertEquals(title, "Smartphones - Buy The Newest Cell Phones | Verizon Wireless");
		
	}
	@Test(priority=2)
	public void verifyAllFeatures(){
		smartPhonePage.clickOnIphone();
	}
@AfterTest
public void tearDown(){
	driver.quit();
}
}
