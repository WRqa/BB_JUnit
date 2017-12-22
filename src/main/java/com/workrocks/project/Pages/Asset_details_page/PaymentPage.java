package com.workrocks.project.Pages.Asset_details_page;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    private WebDriver wd;
    private WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);

    public PaymentPage(WebDriver driver){
        wd = driver;
        wait = new WebDriverWait(wd, 30, 60);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    @FindBy(id = "Amount") private WebElement investmentAmount;
    @FindBy(xpath = "//td[@class='promoWrapper']/div[1]/input") private WebElement promoCodeField;
    @FindBy(id = "SignaturePrintName") private WebElement printName;
    @FindBy(id = "Subtotal") private WebElement subtotal;
    @FindBy(id = "FeeAmount") private WebElement feeAmount;
    @FindBy(id = "DiscountAmount") private WebElement discountAmount;
    @FindBy(id = "Total") private WebElement total;
    @FindBy(css = ".col-sm-4.invoice-col>a>ins") private WebElement assetId;
    @FindBy(css = ".page-header") private WebElement investmentTitle;
    @FindBy(xpath = "//div[@class='row']/div[1]/div[1]/div[1]/span/span") public WebElement confirmationText;



    private void clickPlus() {wd.findElement(By.id("plus")).click();}

    private void clickMinus() {wd.findElement(By.id("minus")).click();}

    private void clickDiscountRadio() {wd.findElement(By.id("Discount")).click();}

    private void clickPromoCodeRadio() {wd.findElement(By.xpath("//*[@id='promoCode']/div/ins")).click();}

    public void clickMakeInvestment() {wd.findElement(By.id("investment")).click();}

    private void clickBuyButton(){wd.findElement(By.xpath("//div[@class='col-xs-12']/button")).click();}

    private void clickUseButton() {wd.findElement(By.xpath("//td[@class='promoWrapper']/div[1]/span")).click();}


    private void setInvestmentAmount(String amount){
        investmentAmount.clear();
        investmentAmount.sendKeys(amount);}

    private void setFixedBonus(String fixedBonus){
        promoCodeField.clear();
        promoCodeField.sendKeys(fixedBonus);}

    private void setPurchasePriceDiscount(String priceDiscount){
        promoCodeField.clear();
        promoCodeField.sendKeys(priceDiscount);}

    private void setFreeDiscount(String freeDiscount){
        promoCodeField.clear();
        promoCodeField.sendKeys(freeDiscount);}

    private void setUserName(String userName){
        printName.clear();
        printName.sendKeys(userName);}

    public String getSubtotal(){
        return subtotal.getText();
    }

    public String getFee(){return feeAmount.getText();}

    public String getDiscount(){
        return discountAmount.getText();
    }

    public String getTotal(){
        return total.getText();
    }

    public String getAssetID(){
        return assetId.getText();
    }

    public String getInvestmentTitle(){
        return investmentTitle.getText();
    }


    public void setInvestmentAmount(String amount, String name){
        setInvestmentAmount(amount);
        clickPlus();
        clickMinus();
        clickPlus();
        setUserName(name);
    }


    public String investmentPageTitle(){
        String title = getInvestmentTitle()+getAssetID();
        return title;
    }

    public void setFixedPromoCode(String fixedBonus){
        clickPromoCodeRadio();
        setFixedBonus(fixedBonus);
        clickUseButton();
    }

    public void setDiscountPromoCode(String priceDiscount){
        clickPromoCodeRadio();
        setPurchasePriceDiscount(priceDiscount);
        clickUseButton();
    }

    public void setFreeDiscountPromoCode(String freeDiscount){
        clickPromoCodeRadio();
        setFreeDiscount(freeDiscount);
        clickUseButton();
    }

    public void setFixedPrice(String name){
        setUserName(name);
        clickBuyButton();
    }
}
