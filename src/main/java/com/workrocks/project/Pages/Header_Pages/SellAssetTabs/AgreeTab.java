package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgreeTab extends AddressTab{

    public AgreeTab(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "//h4[@id='agreeBB30DaysExclusivity']/div/ins") private WebElement agree1checkbox;
    @FindBy (xpath = "//div[@id='isProfessionalPhoto']/div/ins") private WebElement agree2checkbox;
    @FindBy (xpath = "//div[@id='agreeTermsBeforeFirst30Days']/div/ins") private WebElement agree3checkbox;
    @FindBy (xpath = "//div[@id='agreeTermsBeforeSecond30Days']/div/ins") private WebElement agree4checkbox;
    @FindBy (xpath = "//div[@id='agreeTermsBefore45Days']/div/ins") private WebElement agree5checkbox;

    private void click1Agree() {agree1checkbox.click();}
    private void click2Agree() {agree2checkbox.click();}
    private void click3Agree() {agree3checkbox.click();}
    private void click4Agree() {agree4checkbox.click();}
    private void click5Agree() {agree5checkbox.click();}

    public void clickSaveAndSendToReviewButton() {wd.findElement(By.id("sendToReview")).click();}

    public void openAgreeTab(){
        wd.findElement(By.linkText("Agree")).click();}

    public void fillAgreeTab() throws InterruptedException {
        click1Agree();
        click2Agree();
        click3Agree();
        click4Agree();
        click5Agree();
        Thread.sleep(1000);
        clickSaveAndSendToReviewButton();
    }

}
