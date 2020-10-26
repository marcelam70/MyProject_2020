  package com.qa.verizon.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ElementUtil {
	WebDriver driver;
	public ElementUtil(WebDriver driver){
		this.driver = driver;
		
	}
	/**
	 * @author marcelavinueza
	 * GetTitle method
	 * @return
	 */
public String doGetPageTitle(){
	
	try {
		return driver.getTitle();
	} catch (Exception e) {
		System.out.println("some exception got ocurred while getting the title....");
	}
	return null;	
}
/**
 * Get element method
 * @param locator
 * @return
 */
public WebElement getElement(By locator){
	WebElement element = null;
	try {
		element = driver.findElement(locator);
	} catch (Exception e) {
		System.out.println("some exception ocurred while creating the web element.....");
	}
	return element;
}
/**
 * Click on method
 * @param locator
 */
public void doClick(By locator){
	try{
	getElement(locator).click();
}
	catch (Exception e) {
		System.out.println("some exception ocurred while clicking the web element.....");
	}
}
/**
 * SendKeys Method
 * @param locator
 * @param value
 */
	public void doSendKeys(By locator,String value){
		try {
			WebElement element = getElement(locator);
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("some exception ocurred while entering values in a field.....");
		}
		
	}
	/**
	 * IsDisplayed Method
	 * @param locator
	 * @return
	 */
	public boolean doIsDisplayed(By locator){
		try {
			return getElement(locator).isDisplayed();
		} catch (Exception e) {
			System.out.println("some exception ocurred while isDisplayed.....");
		}
		return false;
}
	/**
	 * isEnabled Method
	 * @param locator
	 * @return
	 */
	public boolean doIsEnabled(By locator){
		try {
			return getElement(locator).isEnabled();
		} catch (Exception e) {
			System.out.println("some exception ocurred while isEnabled.....");
		}
		return false;
}

	/**
	 * 
	 * @param title
	 * @return
	 */
	public String waitForGetPageTitle(String title){
		   try {
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.titleContains(title));
			 } catch (Exception e) {
    System.out.println("some exception occurred while getting title ");			
			}  
  return driver.getTitle();
		 }
	/**
	 * isSelected Method
	 * @param locator
	 * @return
	 */
	public boolean doIsSelected(By locator){
		try {
			return getElement(locator).isSelected();
		} catch (Exception e) {
			System.out.println("some exception ocurred while isSelected.....");
		}
		return false;

	}
	public String doGetText(By locator){
		try {
			return getElement(locator).getText();
		} catch (Exception e) {
			System.out.println("some exception ocurred while getting text.....");
		}
		return null;
	}
	public void moveToElement(By phoneList) {
		
		
	}
}
