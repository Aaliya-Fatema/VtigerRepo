package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationsInformationPage {

	WebDriver driver;
	
	public OrganizationsInformationPage(WebDriver driver){
		
		this.driver = driver;
	}

	public String verifyOrganizationsInfo(String organizationsName) {
		
		return driver.findElement(By.xpath("//span[contains(text(), '"+organizationsName+"')]")).getText();
	}


}
