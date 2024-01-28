package com.qsp.vtiger.pomRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qsp.vtiger.genericUtility.JavaUtility;
import com.qsp.vtiger.genericUtility.WebDriverUtility;

public class CreatingNewProductPage {
	

	WebDriver driver;

	public CreatingNewProductPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(name = "productname")
	private WebElement productNameTextField;

	@FindBy(name = "sales_start_date")
	private WebElement salesStartDateCalender;

	@FindBy(name = "sales_end_date")
	private WebElement salesEndDateCalender;

	@FindBy(xpath = "//img[@alt=\"Select\"]")
	private WebElement vendorLookUpButton;

	@FindBy(id = "search_txt")
	private WebElement vendorSearchBox;

	@FindBy(name = "search")
	private WebElement searchNowButton;

	@FindBy(id = "my_file_element")
	private WebElement prductImageUploadButton;

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductNameTextField() {
		return productNameTextField;
	}

	public WebElement getSalesStartDateCalender() {
		return salesStartDateCalender;
	}

	public WebElement getSalesEndDateCalender() {
		return salesEndDateCalender;
	}

	public WebElement getVendorLookUpButton() {
		return vendorLookUpButton;
	} 

	public WebElement getVendorSearchBox() {
		return vendorSearchBox;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getPrductImageUploadButton() {
		return prductImageUploadButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	

	public void clickOnVendorNameFromLookUpPage(String vendorName) {
		driver.findElement(By.xpath("//a[text()='" + vendorName + "']")).click();
	}

	public void enterProductName(String productName) {
		productNameTextField.sendKeys(productName);
	}
	
	public void enterSalesStartDate(String startDate) throws EncryptedDocumentException, IOException {
		

		salesStartDateCalender.sendKeys(startDate);
	}
	
	public void enterSalesEndDate(String endDate) throws EncryptedDocumentException, IOException {
		
		
		salesEndDateCalender.sendKeys(endDate);
	}
	
	public void clickVendorLookUpButton(String vendorLookUpPageTitle, String vendorName) {
		
		String currentTitle = driver.getTitle();
		
		vendorLookUpButton.click();
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.switchToWindow(driver, vendorLookUpPageTitle);
		
		vendorSearchBox.sendKeys(vendorName);
		searchNowButton.click();
		
		clickOnVendorNameFromLookUpPage(vendorName);
		
		wUtils.switchToWindow(driver, currentTitle);

	}
	
	public void uploadProductImage(String fileName) {
		// this project image path user.dir represent the whole path of image which is present in test resource
		String projectPath = System.getProperty("user.dir");
		
		prductImageUploadButton.sendKeys(projectPath+fileName);
		
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
}

