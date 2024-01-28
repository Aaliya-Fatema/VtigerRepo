package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationsPage {
	
	public CreatingNewOrganizationsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	/**
	 *  xpath of org text field
	 */
		@FindBy(xpath="//input[@name=\"accountname\"]")
		private WebElement organizationsNameTextField;

		@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
		private WebElement saveButton;

		public WebElement getOrganizationNameTextField() {
			return organizationsNameTextField;
		}
		public void enterOrganizationsName(String organizationsName) {
			organizationsNameTextField.sendKeys(organizationsName);
		}

		public WebElement getSaveButton() {
			return saveButton;
		}

		
		
		public void clickOnSaveButton() {
			saveButton.click();
		}
		}