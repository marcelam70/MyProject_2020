
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.verizon.base.BasePage;
import com.qa.verizon.pages.HomePage;
import com.qa.verizon.pages.PhoneFeaturesPage;
import com.qa.verizon.pages.SmartPhonePage;
import com.qa.verizon.util.Constants;

public class PhoneFeaturesPagesTest {
          WebDriver driver;
          BasePage basePage;
          Properties prop;
          HomePage homePage;
          SmartPhonePage smartPhonePage;
          PhoneFeaturesPage phonesPage;
         
@BeforeTest
     public void setUp(){
	basePage = new BasePage();
	prop = basePage.init_properties();
	String browserName =  prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	homePage = new HomePage(driver);
	smartPhonePage = homePage.clickOnSmarthPhones();
	smartPhonePage = new SmartPhonePage(driver);
	phonesPage = smartPhonePage.clickOnIphone();
	
}
@Test(priority=1)
public void verifyTitleTest(){
	String title = phonesPage.getPageTitle();
	System.out.println("Smarthphone page title is: " + title);
	Assert.assertEquals(title,Constants.IPHONE_PAGE_TITLE);
	//Assert.assertEquals(title, "Verizon | Customize your Device");
}
@Test(priority=2)
public void verifyPhoneFeaturesTest(){
	 String phone = phonesPage.getAllFeatures();
	 System.out.println("Iphone page title is:" + phone);
	 Assert.assertEquals(phone, Constants.IPHONE_NAME);
}
@AfterTest
public void tearDown(){
	driver.quit();
}
}

