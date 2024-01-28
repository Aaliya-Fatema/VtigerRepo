package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OppertunitiesInformationPage {
	
	WebDriver driver;
	
	public OppertunitiesInformationPage(WebDriver driver){
		
		this.driver = driver;
	}

	public String verifyOppertunitiesInfo(String oppertunitiesName) {
		
		return driver.findElement(By.xpath("//span[contains(text(), '"+oppertunitiesName+"')]")).getText();
	}
}
