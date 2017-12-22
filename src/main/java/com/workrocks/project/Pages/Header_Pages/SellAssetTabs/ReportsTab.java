package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsTab extends AddressTab{
    ConfigProperties data = new ConfigProperties();

    public ReportsTab(WebDriver driver){
        super(driver);
    }

    @FindBy (id = "report-manage-mysaleprice") private WebElement mySalePrice;
    @FindBy (id = "report-manage-appraisalprice") private WebElement appraisedValue;
    @FindBy (id = "report-manage-percantage") private WebElement percentage;
    @FindBy (xpath = "//div[@id='reportItem_7']/div[1]/input") private WebElement addNewReport;
    @FindBy (xpath = "//div[@id='reportItem_7']/div[4]/a/span") private WebElement plusOrDeleteIcon;

    private void clickPlusOrDeleteIcon() {plusOrDeleteIcon.click();}

    private void setAppraisedValue(String appraisedValue){
        this.appraisedValue.clear();
        this.appraisedValue.sendKeys(appraisedValue);}

    private void setAddNewReport(String newReport) {
        addNewReport.clear();
        addNewReport.sendKeys(newReport);}

    public Double getMySalePrice() {
        return Double.valueOf(mySalePrice.getAttribute("value").replaceAll(",", ""));}

    private Double getAppraisedValue(){
        return Double.valueOf(appraisedValue.getAttribute("value").replaceAll(",", ""));}

    public Double calcPercentage(){
        return (getMySalePrice() * 100 / getAppraisedValue()) - 100;}

    public Double getPercentage(){
        return Double.valueOf(percentage.getAttribute("value").replaceAll(",", ""));}

    public void fillReportsTab(String appraisedValue, String newReport) throws InterruptedException {
        setAppraisedValue(appraisedValue);
        webpages.Upload().uploadReport("ReportItems[0].MediaFile", data.getProperty("report1"));
        webpages.Upload().uploadReport("ReportItems[1].MediaFile", data.getProperty("report2"));
        webpages.Upload().uploadReport("ReportItems[2].MediaFile", data.getProperty("report3"));
        webpages.Upload().uploadReport("ReportItems[3].MediaFile", data.getProperty("report4"));
        webpages.Upload().uploadReport("ReportItems[4].MediaFile", data.getProperty("report5"));
        webpages.Upload().uploadReport("ReportItems[5].MediaFile", data.getProperty("report6"));
        webpages.Upload().uploadReport("ReportItems[6].MediaFile", data.getProperty("report7"));
        webpages.Upload().uploadReport("ReportItems[7].MediaFile", data.getProperty("report8"));
        setAddNewReport(newReport);
        clickPlusOrDeleteIcon();
    }
}
