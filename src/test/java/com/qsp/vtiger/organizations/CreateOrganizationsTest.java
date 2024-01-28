  package com.qsp.vtiger.organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.vtiger.genericUtility.BaseClass;
import com.qsp.vtiger.genericUtility.IPathConstant;
import com.qsp.vtiger.pomRepository.CreatingNewOrganizationsPage;
import com.qsp.vtiger.pomRepository.HomePage;
import com.qsp.vtiger.pomRepository.OrganizationsInformationPage;
import com.qsp.vtiger.pomRepository.OrganizationsPage;
@Listeners(com.qsp.vtiger.genericUtility.ListenerImplementationClass.class)
public class CreateOrganizationsTest extends BaseClass {
	@Test(retryAnalyzer = com.qsp.vtiger.genericUtility.RetryImplementationClass.class, priority=3, groups="regression")
	public void toCreateAnOrganizationAndVerifyTheOrganizationsDetails() throws EncryptedDocumentException, IOException {
		
		int randomNo=jUtils.generateRandomNo(100);
		String organizationsName= eUtils.fetchStringDataFromExcel(IPathConstant.ORGANIZATIONS_SHEET_NAME, 17, 2);
		
		HomePage home= new HomePage(driver);
		OrganizationsPage organization= new OrganizationsPage(driver);
		CreatingNewOrganizationsPage createOrganization= new CreatingNewOrganizationsPage(driver);
		OrganizationsInformationPage oragnizationInfo= new OrganizationsInformationPage(driver);
		
		home.clickOnOrganizationsModule();
		
		
		organization.clickOnOrganizationsPlusButton();
		
		createOrganization.enterOrganizationsName(organizationsName);
		createOrganization.clickOnSaveButton();
		String actualOrganizationInfo= oragnizationInfo.verifyOrganizationsInfo(organizationsName);
		Assert.assertTrue(actualOrganizationInfo.contains(organizationsName));
		System.out.println("Pass :The organizations has been created");
	}

}
