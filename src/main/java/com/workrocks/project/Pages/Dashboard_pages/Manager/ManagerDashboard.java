package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerDashboard {
    WebDriver wd;
    WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);
    ConfigProperties data = new ConfigProperties();

    public ManagerDashboard(WebDriver driver){
        wd = driver;
        wait = new WebDriverWait(wd, 30, 60);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    public void clickSearchButton() {wd.findElement(By.id("search")).click();}

    public void clickDashboard() {wd.findElement(By.linkText("UserDashboard")).click();}

    private void clickAssetsForSale() {wd.findElement(By.linkText("Assets for Sale")).click();}

    private void clickAssetsUnderReview() {wd.findElement(By.linkText("Assets Under Review")).click();}

    private void clickApprovedAssetsList() {wd.findElement(By.linkText("Approved Assets List")).click();}

    private void clickTrades() {wd.findElement(By.linkText("Trades")).click();}

    private void clickSoldOutAssetsList() {wd.findElement(By.linkText("Sold Out Assets List")).click();}

    private void clickInvestment() {wd.findElement(By.linkText("Investment")).click();}

    private void clickInvestmentList() {wd.findElement(By.linkText("Investment List")).click();}

    private void clickUsers() {wd.findElement(By.linkText("Users")).click();}

    private void clickUserList() {wd.findElement(By.linkText("User List")).click();}

    private void clickSubscriptionsList() {wd.findElement(By.linkText("Subscriptions List")).click();}

    private void clickTransaction() {wd.findElement(By.linkText("Transaction")).click();}

    private void clickTransactionList() {wd.findElement(By.linkText("Transaction List")).click();}

    private void clickPromo() {wd.findElement(By.linkText("Promo")).click();}

    private void clickPromoCodeList() {wd.findElement(By.linkText("Promo Code List")).click();}

    private void clickComment() {wd.findElement(By.linkText("Comments")).click();}

    private void clickCommentList() {wd.findElement(By.linkText("Comments List")).click();}

    private void clickTopList() {wd.findElement(By.linkText("Top List")).click();}

    private void clickTopInvestors() {wd.findElement(By.linkText(" Top Investors")).click();}

    private void clickTopReferrals() {wd.findElement(By.linkText(" Top Referrals")).click();}

    private void clickTopSellers() {wd.findElement(By.linkText(" Top Sellers")).click();}

    private void clickEventLog() {wd.findElement(By.linkText("Event Log")).click();}

    private void clickEventsList() {wd.findElement(By.linkText("Events List")).click();}


    public void openAssetsUnderReviewPage(){
        webpages.MainPage().clickDashboard();
        clickAssetsForSale();
        clickAssetsUnderReview();}

    public void openApprovedAssetsList(){
        webpages.MainPage().clickDashboard();
        clickAssetsForSale();
        clickApprovedAssetsList();}

    public void openTrades(){
        webpages.MainPage().clickDashboard();
        clickAssetsForSale();
        clickTrades();}

    public void openSoldOutAssetsList(){
        webpages.MainPage().clickDashboard();
        clickAssetsForSale();
        clickSoldOutAssetsList();}

    public void openInvestmentList(){
        webpages.MainPage().clickDashboard();
        clickInvestment();
        clickInvestmentList();}

    public void openUserList(){
        webpages.MainPage().clickDashboard();
        clickUsers();
        clickUserList();}

    public void openSubscriptionsList(){
        webpages.MainPage().clickDashboard();
        clickUsers();
        clickSubscriptionsList();}

    public void openTransactionList(){
        webpages.MainPage().clickDashboard();
        clickTransaction();
        clickTransactionList();}

    public void openPromoCodeList(){
        webpages.MainPage().clickDashboard();
        clickPromo();
        clickPromoCodeList();}

    public void openCommentList(){
        webpages.MainPage().clickDashboard();
        clickComment();
        clickCommentList();}

    public void openTopInvestors(){
        webpages.MainPage().clickDashboard();
        clickTopList();
        clickTopInvestors();
    }

    public void openTopReferrals(){
        webpages.MainPage().clickDashboard();
        clickTopList();
        clickTopReferrals();}

    public void openTopSellers(){
        webpages.MainPage().clickDashboard();
        clickTopList();
        clickTopSellers();}

    public void openEventsList(){
        webpages.MainPage().clickDashboard();
        clickEventLog();
        clickEventsList();}
}

