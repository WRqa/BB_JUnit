package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressTab {
    WebDriver wd;
    WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);
    ConfigProperties data = new ConfigProperties();

    public AddressTab(WebDriver driver){
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);}

    @FindBy (xpath = "/html/body/span/span/span[1]/input") private WebElement state;
    @FindBy (id = "City") private WebElement city;
    @FindBy (id = "Address1") private WebElement address1;
    @FindBy (id = "Address2") private WebElement address2;
    @FindBy (id = "Zip") private WebElement zip;

    public void clickPreviousButton() {wd.findElement(By.id("previous")).click();}
    public void clickSaveAndNextButton() {wd.findElement(By.id("saveNext")).click();}
    public void clickSaveAndFinishButton() {wd.findElement(By.id("saveFinish")).click();}
    public void clickApproveButton() {wd.findElement(By.xpath("//button[@value='Approve']")).click();}
    public void clickRejectButton() {wd.findElement(By.xpath("//button[@value='Reject']")).click();}

    private void clickCountryDropdown() {wd.findElement(By.id("select2-CountryId-container")).click();}
    private void clickStateDropdown() {wd.findElement(By.id("select2-ProvinceId-container")).click();}

    private void setState(String state){
        this.state.clear();
        this.state.sendKeys(state + Keys.ENTER);}

    private void setCity(String city){
        this.city.clear();
        this.city.sendKeys(city);}

    private void setAddress1(String address1){
        this.address1.clear();
        this.address1.sendKeys(address1);}

    private void setAddress2(String address2){
        this.address2.clear();
        this.address2.sendKeys(address2);}

    private void setZip(String zip){
        this.zip.clear();
        this.zip.sendKeys(zip);}

    public void openAddressTabByManagerDashboard(){
        webpages.ManagerDashboard().openAssetsUnderReviewPage();
        webpages.AssetsUnderReview().clickCheckAndApprove();
    }

    public void fillAddressTab(String state, String city, String address1, String address2, String ZIP){
        clickCountryDropdown();
        clickCountryDropdown();
        clickStateDropdown();
        setState(state);
        setCity(city);
        setAddress1(address1);
        setAddress2(address2);
        setZip(ZIP);
        clickSaveAndNextButton();}
}
