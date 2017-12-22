package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBITsHoldings extends UserDashboard {

    ProjectPages webpages = new ProjectPages(wd);

    public MyBITsHoldings(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[2]/td/div[1]/div/div/ins") private WebElement fixedPriceRadio;
    @FindBy (xpath = "html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[2]/td/div[2]/div/div/ins") private WebElement auctionRadio;
    @FindBy (id = "BitsAmount") private WebElement bitsForSale;
    @FindBy (id = "IsStartNow") private WebElement startNowCheckbox;
    @FindBy (id = "StartDate") private WebElement startDate;
    @FindBy (id = "IsGoodUntilCancelled") private WebElement goodUntilCancelledCheckbox;
    @FindBy (id = "EndDate") private WebElement endDate;
    @FindBy (id = "Price") private WebElement price;
    @FindBy (id = "BidStep") private WebElement bidStep;
    @FindBy (id = "StartPrice") private WebElement startPrice;
    @FindBy (id = "EndPrice") private WebElement buyNowPrice;
    @FindBy (id = "ReserveBid") private WebElement reserveBid;


    private void clickViewAllHolding() {wd.findElement(By.linkText("View All Holdings")).click();}

    private void clickBITsCounter() {wd.findElement(By.xpath("//ul[@class='products-list product-list-in-box']/li/div[2]/a[2]/span")).click();}

    private void clickSellMyBITsButton() {wd.findElement(By.id("sellMyBITs")).click();}

    private void clickFixedPriceRadio() {fixedPriceRadio.click();}

    private void clickAuctionRadio() {auctionRadio.click();}

    private void clickBITsForSalePlus() {wd.findElement(By.id("plus")).click();}

    private void clickBITsForSaleMinus() {wd.findElement(By.id("minus")).click();}

    private void clickBidStepPlus() {wd.findElement(By.xpath("html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[4]/td/div/div/div/span[2]/i")).click();}

    private void clickBidStepMinus() {wd.findElement(By.xpath("html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[4]/td/div/div/div/span[2]/i")).click();}

    private void clickStartNowCheckbox() {startNowCheckbox.click();}

    private void clickGoodUntilCancelledCheckbox() {goodUntilCancelledCheckbox.click();}

    private void clickSubmitCheckbox() {wd.findElement(By.id("IReviewedAndAgreeToTermsOfServiceAndPrivacyPolicy")).click();}

    private void clickCloseButton() {wd.findElement(By.id("close")).click();}

    private void clickOkButton() {wd.findElement(By.id("addOrUpdateResellAssetBtn")).click();}


    private void setBITSForSale(String bitsForSale){
        this.bitsForSale.clear();
        this.bitsForSale.sendKeys(bitsForSale);}

    private void setBidStep(String bidStep){
        this.bidStep.clear();
        this.bidStep.sendKeys(bidStep);}

    private void setStartDate(String startDate){
        this.startDate.clear();
        this.startDate.sendKeys(startDate);}

    private void setEndDate(String endDate){
        this.endDate.clear();
        this.endDate.sendKeys(endDate);}

    private void setPrice(String price){
        this.price.clear();
        this.price.sendKeys(price);}

    private void setStartPrice(String startPrice){
        this.startPrice.clear();
        this.startPrice.sendKeys(startPrice);}

    private void setReserveBid(String reserveBid){
        this.reserveBid.clear();
        this.reserveBid.sendKeys(reserveBid);}

    private void setBuyNowPrice(String buyBowPrice){
        buyNowPrice.clear();
        buyNowPrice.sendKeys(buyBowPrice);}


    public void openMyBITsHoldingsPage(){
        webpages.MainPage().clickDashboard();
        clickViewAllHolding();
        clickBITsCounter();}

    public void createFixedPriceBITsSale(String bitsForSale, String startDate, String endDate, String price) throws InterruptedException {
        clickSellMyBITsButton();
        Thread.sleep(1000);
        clickAuctionRadio();
        clickFixedPriceRadio();
        setBITSForSale(bitsForSale);
       // clickBITsForSalePlus();
       // clickBITsForSaleMinus();
        setStartDate(startDate);
        clickStartNowCheckbox();
        setEndDate(endDate);
        clickGoodUntilCancelledCheckbox();
        setPrice(price);
        clickSubmitCheckbox();
        clickOkButton();
    }

    public void createAuction (String bitsForSale, String bidStep, String startDate, String startPrice,
                               String reserveBid, String buyNowPrice) throws InterruptedException {
        clickSellMyBITsButton();
        Thread.sleep(1000);
        clickAuctionRadio();
        setBITSForSale(bitsForSale);
        setBidStep(bidStep);
        setStartDate(startDate);
        clickStartNowCheckbox();
        clickGoodUntilCancelledCheckbox();
        setStartPrice(startPrice);
        setReserveBid(reserveBid);
        setBuyNowPrice(buyNowPrice);
        clickSubmitCheckbox();
        clickOkButton();
    }
}
