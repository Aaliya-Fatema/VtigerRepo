package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppertunitiesPage {
	
	public OppertunitiesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Opportunity...']")
	
	private WebElement opportunitiesPlusButton;
/**
 * for getting on oppertunities plusButton
 * @return
 */
	public WebElement getOpportunitiesPlusButton() {
		return opportunitiesPlusButton;
	}
/**
 * for clicking on oppertunities plusButton
 */
	public void clickOnOpportunitiesPlusButton() {
		opportunitiesPlusButton.click();
	}


}
