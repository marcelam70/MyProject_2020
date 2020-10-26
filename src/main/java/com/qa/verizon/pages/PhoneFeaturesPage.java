package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.Constants;
import com.qa.verizon.util.ElementUtil;


public class PhoneFeaturesPage  extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;

	public PhoneFeaturesPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	By color = By.id("#CFBEA9");
	By gBy = By.xpath("//p[contains(text(),'512GB')]");
	By price = By.xpath("//span[@class='tntPrice-2']");
	By continueBtn = By.id("ATC-Btn");
	By nextBtn = By.xpath("//button[@class='button margin30 onlyTopMargin primary']");
	By protectionBtn = By.id("deviceProtectionBtn");
	By declineBtn= By.id("declineDeviceSelectProtecionBtn");
	By declineProteccion = By.xpath("//div[@id='declineProtectionOverlay']");
	By zipCode = By.id("zipcode");
	By confirmBtn = By.className("defaultPrimaryCTA");
	By newCustomer = By.className("margin8");
	By next =  By.className("margin30");
	By carBtn = By.xpath("//a[@class='cart-icon ']");
	By carPhone = By.xpath("//h3/span");

	
	public String getPageTitle(){
			
		return elementUtil.waitForGetPageTitle(Constants.IPHONE_PAGE_TITLE);
	}
	public String getAllFeatures(){
		
	    elementUtil.getElement(color).click();
	    elementUtil.getElement(gBy).click();
	    elementUtil.getElement(price).click();
		elementUtil.doClick(continueBtn);
		elementUtil.doClick(nextBtn);
		elementUtil.doSendKeys(zipCode, "07601");
		elementUtil.doClick(carBtn);
		elementUtil.doClick(protectionBtn);
		elementUtil.doClick(declineBtn);
		elementUtil.doClick(declineProteccion);
		elementUtil.doClick(confirmBtn);
		String iphone = elementUtil.doGetText(carBtn);
	return iphone;
		
	
		
	}
	
	}


