package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.Constants;
import com.qa.verizon.util.ElementUtil;


public class SmartPhonePage extends BasePage {
         WebDriver driver;
         ElementUtil elementUtil;
         
         public SmartPhonePage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
         }	
         
     // By samsungNote = By.id("tile_dev12240063");
     // By samsungNote = By.xpath("//*[@id='tile_dev12240063']");
      By iphone = By.xpath("//*[@id='tile_dev12400034']");
  
			
			public String getSmarthPhonePageTitle(){
				return elementUtil.waitForGetPageTitle(Constants.SMART_PAGE_TITLE);
			}
			
		public PhoneFeaturesPage clickOnIphone(){
			elementUtil.doClick(iphone);
			
			return  new PhoneFeaturesPage(driver);
			
		}
 
}
