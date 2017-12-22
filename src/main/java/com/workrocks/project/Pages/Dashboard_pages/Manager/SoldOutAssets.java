package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SoldOutAssets extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public SoldOutAssets(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Seller") private WebElement seller;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement assetNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a") private WebElement buildingName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement assetAddress;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a") private WebElement sellerName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement expectedReturn;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement salePrice;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]") private WebElement phase;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]") private WebElement dateOfCreation;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[9]") private WebElement dateStatusChange;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[10]/span") private WebElement assetStatus;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[13]/a/i") private WebElement manageIcon;

    private void clickManageIcon() {manageIcon.click();}

    private void setBuildingName(String buildingName){
        this.buildingNameField.clear();
        this.buildingNameField.sendKeys(buildingName);}

    private void setSellerName(String sellerName){
        this.seller.clear();
        this.seller.sendKeys(sellerName);}

    public String getBuildingName(){
        return this.buildingName.getText();}

    public String getSellerName(){
        return this.sellerName.getText();}

    private void presentAssetOnThePage(){
        Assert.assertEquals(true, assetNumber.isEnabled());
        Assert.assertEquals(true, buildingName.isEnabled());
        Assert.assertEquals(true, assetAddress.isEnabled());
        Assert.assertEquals(true, sellerName.isEnabled());
        Assert.assertEquals(true, expectedReturn.isEnabled());
        Assert.assertEquals(true, salePrice.isEnabled());
        Assert.assertEquals(true, phase.isEnabled());
        Assert.assertEquals(true, dateOfCreation.isEnabled());
        Assert.assertEquals(true, dateStatusChange.isEnabled());
        Assert.assertEquals(true, assetStatus.isEnabled());
    }

    public void searchAssetByName(String buildingName){
        presentAssetOnThePage();
        setBuildingName(buildingName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.buildingName, buildingName));
    }

    public void searchAssetBySeller(String sellerName){
        presentAssetOnThePage();
        setSellerName(sellerName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.sellerName, sellerName));
    }

    public void addReport(String rentalIncome, String reimbursements, String propertyTaxes, String insurance, String utilities,
                          String repairsAndMaintenance, String otherExpenses, String reportingMonth){
        clickManageIcon();
        MainPage mainPage = new MainPage(wd);
        mainPage.switchBetweenWindows(1);
        //wait.until(ExpectedConditions.visibilityOf(webpages.FinancialSummary().manageButton));
        webpages.FinancialSummary().clickManageButton();
        //wait.until(ExpectedConditions.visibilityOf(webpages.FinancialSummary().rentalIncome));
        webpages.FinancialSummary().fillReport(rentalIncome, reimbursements, propertyTaxes, insurance, utilities,
                repairsAndMaintenance, otherExpenses, reportingMonth);
    }
}

