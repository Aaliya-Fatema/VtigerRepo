 package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		WebDriver driver;
		
		public HomePage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			this.driver = driver;		
		}
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement administratorDropdown;
		
		@FindBy(linkText="Leads")
		private WebElement leadModule;
		 
		@FindBy(linkText="Organizations")
		private WebElement organizationsModule;
		
		@FindBy(linkText="Contacts")
		private WebElement contactsModule;
		
		
		@FindBy(linkText="Opportunities")
        private WebElement opportunitiesModule;
		
		@FindBy(linkText="Products")
		private WebElement productsModule;
		
		
		@FindBy(linkText="More")
		private WebElement moreDropdown;
		
		@FindBy(linkText="Campaigns")
		private WebElement campaignsModule;
		
		@FindBy(linkText="Vendors")
		private WebElement vendorsModule;
		
		@FindBy(linkText="Invoice")
		private WebElement invoiceModule;
		
				
		@FindBy(linkText="Quotes")
		private WebElement quotesModule;
		
		@FindBy(linkText="Sign Out")
		private WebElement signOutOption;

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getAdministratorDropdown() {
			return administratorDropdown;
		}

		public WebElement getLeadModule() {
			return leadModule;
		}

		public WebElement getOrganizationModule() {
			return organizationsModule;
		}

		public WebElement getContactsModule() {
			return contactsModule;
		}

		public WebElement getOpportunitiesModule() {
			return opportunitiesModule;
		}

		public WebElement getProductsModule() {
			return productsModule;
		}

		public WebElement getMoreModule() {
			return moreDropdown;
		}

		public WebElement getCampaignsModule() {
			return campaignsModule;
		}
		

		public WebElement getVendorsModule() {
			return vendorsModule;
		}

		public WebElement getInvoiceModule() {
			return invoiceModule;
		}

		public WebElement getQuotesModule() {
			return quotesModule;
		}

		public WebElement getSignOutOption() {
			return signOutOption;
				
		}
		
		public void clickOnContactsModule() { 
			contactsModule.click();
		}
		
		public void clickOnLeadModule() { 
			leadModule.click();
		}
		
		public void clickOnOrganizationsModule() {
			organizationsModule.click();
		}
		
		public void clickOnOpportunitiesModule() {
			opportunitiesModule.click();
		}
		
		public void clickOnProductsModule() {
			productsModule.click();
		}
		
		public void mouseHoverOnMoreDropdown() {
			new Actions(driver).moveToElement(moreDropdown).perform();
			
		}
		public void clickOnCampaignModule() {
			mouseHoverOnMoreDropdown();
			campaignsModule.click();
		}
		
		public void clickOnVendorsModule() {
			mouseHoverOnMoreDropdown();
			vendorsModule.click();
		}
		
		public void clickOnInvoiceModule() {
			mouseHoverOnMoreDropdown();
			invoiceModule.click();
		}
		
		public void clickOnQuotesModule() {
					mouseHoverOnMoreDropdown();
					quotesModule.click();
			
		}
		public void logoutAction() {
			Actions action=new Actions(driver);
			action.moveToElement(administratorDropdown).perform();
			action.click(signOutOption).perform();
		}

		
		
		}
