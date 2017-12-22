package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ApprovedAssets extends ManagerDashboard {

    ProjectPages webpages = new ProjectPages(wd);

    public ApprovedAssets(WebDriver driver) {
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
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]") public WebElement phase;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]/a") private WebElement rating;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[9]") private WebElement dateOfCreation;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[10]") private WebElement dateStatusChange;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[11]/span") private WebElement assetStatus;

    private void clickPhasesDropdown(){wd.findElement(By.id("select2-SelectedPhase-container")).click();}

    private void setBuildingName(String buildingName){
        this.buildingNameField.clear();
        this.buildingNameField.sendKeys(buildingName);}

    private void setSellerName (String seller){
        this.seller.clear();
        this.seller.sendKeys(seller);}

    public String getBuildingName(){
        return this.buildingName.getText();}

    public String getSellerName(){
        return this.sellerName.getText();}

    public String getStatus(){
        return phase.getText();}


    private void presentAssetOnThePage(){
        Assert.assertEquals(true, assetNumber.isDisplayed());
        Assert.assertEquals(true, buildingNameField.isDisplayed());
        Assert.assertEquals(true, assetAddress.isDisplayed());
        Assert.assertEquals(true, sellerName.isDisplayed());
        Assert.assertEquals(true, expectedReturn.isDisplayed());
        Assert.assertEquals(true, salePrice.isDisplayed());
        Assert.assertEquals(true, phase.isDisplayed());
        Assert.assertEquals(true,rating.isDisplayed());
        Assert.assertEquals(true, dateOfCreation.isDisplayed());
        Assert.assertEquals(true, dateStatusChange.isDisplayed());
        Assert.assertEquals(true, assetStatus.isDisplayed());
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

    public void selectPhaseInDropdown(){
        presentAssetOnThePage();
        clickPhasesDropdown();
        webpages.RobotAction().selectItemInDropdown();
        clickSearchButton();
    }
}