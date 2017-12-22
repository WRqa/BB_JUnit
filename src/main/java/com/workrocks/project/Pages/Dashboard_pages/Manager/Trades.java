package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Trades extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public Trades(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Seller") private WebElement seller;
    @FindBy(id = "select2-statusSelectList-container") private WebElement phasesDropdown;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement assetNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a") private WebElement buildingName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/a") private WebElement sellerName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]") private WebElement bitsAmount;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]/a/span") public WebElement statusIcon;

    private void clickStatusDropdown(){phasesDropdown.click();}


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
        return  statusIcon.getText();}


    private void presentAssetOnThePage(){
        Assert.assertEquals(true, assetNumber.isDisplayed());
        Assert.assertEquals(true, buildingName.isDisplayed());
        Assert.assertEquals(true, sellerName.isDisplayed());
        Assert.assertEquals(true, bitsAmount.isDisplayed());
        Assert.assertEquals(true, statusIcon.isDisplayed());
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
        clickStatusDropdown();
        webpages.RobotAction().selectItemInDropdown();
        clickSearchButton();
    }
}
