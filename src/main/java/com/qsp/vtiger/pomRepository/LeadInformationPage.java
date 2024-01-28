package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
WebDriver driver;
	
	public LeadInformationPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public String verifyLeadsInfo(String lastName) {
		
		return driver.findElement(By.xpath("//span[contains(text(), '"+lastName+"')]")).getText();
	}


	}



