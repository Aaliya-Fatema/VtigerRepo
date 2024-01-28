package com.qsp.vtiger.oppertunities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.vtiger.genericUtility.BaseClass;
import com.qsp.vtiger.genericUtility.IPathConstant;
import com.qsp.vtiger.pomRepository.CampaignInformationPage;
import com.qsp.vtiger.pomRepository.CampaignPage;
import com.qsp.vtiger.pomRepository.CreatingNewCampaignPage;
import com.qsp.vtiger.pomRepository.CreatingNewOppertunitiesPage;
import com.qsp.vtiger.pomRepository.CreatingNewOrganizationsPage;
import com.qsp.vtiger.pomRepository.HomePage;
import com.qsp.vtiger.pomRepository.OppertunitiesInformationPage;
import com.qsp.vtiger.pomRepository.OppertunitiesPage;
import com.qsp.vtiger.pomRepository.OrganizationsInformationPage;
import com.qsp.vtiger.pomRepository.OrganizationsPage;
@Listeners(com.qsp.vtiger.genericUtility.ListenerImplementationClass.class)
public class CreateOppertunitiesTest extends BaseClass {
	@Test(retryAnalyzer = com.qsp.vtiger.genericUtility.RetryImplementationClass.class, priority=1, groups="smoke")
	public void createOppertunitiesAndVerifyOppertunitiesInformationTest() throws EncryptedDocumentException, IOException, InterruptedException {
		int randomNo=jUtils.generateRandomNo(100);
		String organizationsName=eUtils.fetchStringDataFromExcel(IPathConstant.OPPERTUNITIES_SHEET_NAME, 18, 2)+randomNo;
	    
	    String campaignName=eUtils.fetchStringDataFromExcel(IPathConstant.OPPERTUNITIES_SHEET_NAME, 23, 2);
	    String oppertunitiesName=eUtils.fetchStringDataFromExcel(IPathConstant.OPPERTUNITIES_SHEET_NAME, 27, 2);
	    
	    	HomePage home=new HomePage(driver);
	    	OrganizationsPage organization= new OrganizationsPage(driver);
	    	CreatingNewOrganizationsPage createOrganization = new CreatingNewOrganizationsPage(driver);
	    	OrganizationsInformationPage organizationInfo= new OrganizationsInformationPage(driver);
	    	
	    	CampaignPage campaign = new CampaignPage(driver);
	    	CreatingNewCampaignPage createCampaign = new CreatingNewCampaignPage(driver);
	    	CampaignInformationPage campaignInfo= new CampaignInformationPage(driver);
	    	
	    	OppertunitiesPage oppertunities= new OppertunitiesPage(driver);
	    	CreatingNewOppertunitiesPage createOppertunities= new CreatingNewOppertunitiesPage(driver);
	    	OppertunitiesInformationPage oppertunitiesInfo = new OppertunitiesInformationPage(driver);
	    	
	    	/**
	    	 * Task of organization
	    	 */
	    	home.clickOnOrganizationsModule();
	    	organization.clickOnOrganizationsPlusButton();
	    	
	    	createOrganization.enterOrganizationsName(organizationsName);
	    	createOrganization.clickOnSaveButton();
	    	
	    	String actualOrganizationName=organizationInfo.verifyOrganizationsInfo(organizationsName);
	    	Assert.assertTrue(actualOrganizationName.contains(organizationsName));
			System.out.println("Pass: the Organization has been created");
            
	    	// task of campagain
			home.clickOnCampaignModule();
	    	campaign.clickOnCampaignPlusButton();
	    	
	    	createCampaign.enterCampaignName(campaignName);
	    	createCampaign.clickOnSaveButton();
	    	
	   
			String actualCampaignName=campaignInfo.verifyCampaignInfo(campaignName);
	    	Assert.assertTrue(actualCampaignName.contains(campaignName));
			System.out.println("Pass: the Campaign has been created");
			
			home.clickOnOpportunitiesModule();
			oppertunities.clickOnOpportunitiesPlusButton();
			createOppertunities.enterOppertunitiesName(oppertunitiesName);
			Thread.sleep(2000);
			createOppertunities.clickOrganizationsLookUpButton("Accounts&action",organizationsName);
			Thread.sleep(2000);
			createOppertunities.clickCampaignLookUpButton("Campaigns&action", campaignName);
			Thread.sleep(2000);
			createOppertunities.clickOnSaveButton();
			
			String actualOppertunitiesName = oppertunitiesInfo.verifyOppertunitiesInfo(oppertunitiesName);
			
			Assert.assertTrue(actualOppertunitiesName.contains(oppertunitiesName));
			System.out.println("Pass: the Oppertunities has been created");
			
	}

}
