package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qsp.vtiger.genericUtility.WebDriverUtility;

public class CreatingNewOppertunitiesPage {
	 	
			WebDriver driver;
			
		public CreatingNewOppertunitiesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		      this.driver= driver;
			}
		
      @FindBy(name="potentialname")
      WebElement oppertunitiesNameTextField;
      
      @FindBy(xpath="(//img[@title=\"Select\"])[1]")
      WebElement organizationsLookPagePlusButton;
      
      	@FindBy(id = "search_txt")
  		private WebElement organizationsSearchBox;

      	@FindBy(name = "search")
      	private WebElement searchNowButton1;
      	
      	public WebDriver getDriver() {
			return driver;
		}


		public WebElement getOppertunitiesNameTextField() {
			return oppertunitiesNameTextField;
		}


		public WebElement getOrganizationsLookPagePlusButton() {
			return organizationsLookPagePlusButton;
		}


		public WebElement getOrganizationsSearchBox() {
			return organizationsSearchBox;
		}


		public WebElement getSearchNowButton1() {
			return searchNowButton;
		}


		public WebElement getCampaginLookPagePlusButton() {
			return campaginLookPagePlusButton;
		}


		public WebElement getCampaginSearchBox() {
			return campaignSearchBox;
		}


		public WebElement getSearchNowButton() {
			return searchNowButton; 
		}


		public WebElement getSaveButton() {
			return saveButton;
		}


		public void setSearchNowButton1(WebElement searchNowButton1) {
			this.searchNowButton1 = searchNowButton1;
		}

		@FindBy(xpath="(//img[@title=\"Select\"])[2]")
        WebElement campaginLookPagePlusButton;
        
        	@FindBy(id = "search_txt")
    		private WebElement campaignSearchBox;

        	@FindBy(name = "search")
        	private WebElement searchNowButton;

      	
      	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
    	private WebElement saveButton;
      	/**
      	 * opper name
      	 * @param oppertunitiesName
      	 */

      	public void enterOppertunitiesName(String oppertunitiesName) {
    		oppertunitiesNameTextField.sendKeys(oppertunitiesName);
    	}
      	
      	
      	public void clickOnOrganizationLookUpPage(String organizationName) {
    		driver.findElement(By.xpath("//a[text()='" + organizationName + "']")).click();
    	}

      	public void clickOrganizationsLookUpButton(String organizationsLookUpPageTitle, String  organizationsName) {
      	 //Store CurrentWindow Title
      		String currentTitle = driver.getTitle();
      		organizationsLookPagePlusButton.click();
      		 
      		WebDriverUtility wUtils= new WebDriverUtility();
      		// Switch to child window organizations
      		wUtils.switchToWindow(driver, organizationsLookUpPageTitle);
      		
      		organizationsSearchBox.sendKeys(organizationsName);
      		
      		searchNowButton1.click();
      		
      		clickOnOrganizationLookUpPage(organizationsName);
      	//Switch to current window
      		wUtils.switchToWindow(driver, currentTitle);
      	}
      	
      	
      	
      	public void clickOnCampaignLookUpPage(String campaignName) {
    		driver.findElement(By.xpath("//a[text()='" + campaignName + "']")).click();
    	}
      	
      	public void clickCampaignLookUpButton(String campaignLookUpPageTitle,String campaignName) {
        	 //Store CurrentWindow Title
        		String currentTitle = driver.getTitle();
        		campaginLookPagePlusButton.click();
        		
        		WebDriverUtility wUtils= new WebDriverUtility();

        		wUtils.switchToWindow(driver, campaignLookUpPageTitle);
        		
        		 
        	
        		//Switch to current window
        		campaignSearchBox.sendKeys(campaignName);
         		
         		searchNowButton.click();
        		driver.findElement(By.xpath("//a[text()='"+campaignName+"']")).click();
     
        		wUtils.switchToWindow(driver, currentTitle);
        	}
        	
        	
      	public void clickOnSaveButton() {
			saveButton.click();
		}
}
