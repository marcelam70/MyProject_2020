package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.Constants;
import com.qa.verizon.util.ElementUtil;

public class HomePage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	
	//By shopList = By.id("gnav20-Shop-L1");
   // By phoneList = By.xpath("//*[@id='secondLevel0']/span");
	By phoneList = By.id("secondLevel0");
	By smartPhones = By.id("thirdLevel00");
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	public String getHomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.HOME_PAGE_TITLE);
         
	}
    public SmartPhonePage clickOnSmarthPhones(){
   WebDriverWait wait = new WebDriverWait(driver, 5);
   wait.until(ExpectedConditions.visibilityOfElementLocated(phoneList));
   //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(shopList));
	elementUtil.moveToElement(phoneList);
   //elementUtil.moveToElement(shopList);
	elementUtil.doClick(smartPhones);
	return new SmartPhonePage(driver);
}
}	

	
		
	

