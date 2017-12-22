package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AssetsUnderReview extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public AssetsUnderReview(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Seller") private WebElement seller;

    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement assetNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a") private WebElement buildingName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement address;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a") private WebElement sellerName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement expectedReturn;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement salePrice;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]") private WebElement dateOfCreation;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]") private WebElement dateStatusChange;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[9]/span") private WebElement status;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[10]/a") private WebElement checkAndApprove;

    public void clickCheckAndApprove() {checkAndApprove.click();}


    private void setBuildingName(String buildingName){
        buildingNameField.clear();
        buildingNameField.sendKeys(buildingName);}

    private void setSellerName(String sellerName){
        seller.clear();
        seller.sendKeys(sellerName);}

    public String getBuildingName(){
        return buildingName.getText();}

    public String getSellerName(){
        return sellerName.getText();}

    public String getStatus(){
        return status.getText();}


    private void presentAssetOnThePage(){
        Assert.assertEquals(true, assetNumber.isEnabled());
        Assert.assertEquals(true, buildingName.isEnabled());
        Assert.assertEquals(true, address.isEnabled());
        Assert.assertEquals(true, sellerName.isEnabled());
        Assert.assertEquals(true, expectedReturn.isEnabled());
        Assert.assertEquals(true, salePrice.isEnabled());
        Assert.assertEquals(true, dateOfCreation.isEnabled());
        Assert.assertEquals(true, dateStatusChange.isEnabled());
        Assert.assertEquals(true, status.isEnabled());
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

}

