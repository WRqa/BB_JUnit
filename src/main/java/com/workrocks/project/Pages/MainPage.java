package com.workrocks.project.Pages;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class MainPage {
    private WebDriver wd;
    private WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);

    public MainPage(WebDriver driver){
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    void clickLogInButton(){
        wd.findElement(By.id("loginLink")).click();}

    public void clickJoinFreeButton(){
        wd.findElement(By.id("registerLink")).click();}

    public void openProfileMenu() {
        wd.findElement(By.xpath("//li[@class='dropdown user user-menu']/a[1]/span")).click();}

    private void clickProfileButton() {wd.findElement(By.id("profile")).click();}

    private void clickSellDropdown() {wd.findElement(By.id("sell")).click();}

    private void clickInvestDropdown() {wd.findElement(By.id("invest")).click();}

    private void clickBuyBuildings() {wd.findElement(By.id("buyBuildings")).click();}

    private void clickBuyBits(){wd.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/ul[1]/li[2]/a")).click();}

    private void clickYourBuildingButton() {wd.findElement(By.id("yourBuilding")).click();}

    public void clickDashboard(){wd.findElement(By.id("dashboard")).click();}

    private void clickSignOutButton() {wd.findElement(By.id("signOut")).click();}


    public void openUserProfile(){
        openProfileMenu();
        clickProfileButton();
    }

    public void openSellAssetPage(){
        clickSellDropdown();
        clickYourBuildingButton();
    }

    public void openAssetsList(){
        clickInvestDropdown();
        clickBuyBuildings();
    }

    public void openSecondaryMarket(){
        clickInvestDropdown();
        clickBuyBits();
    }

    public void signOut(){
        openProfileMenu();
        clickSignOutButton();
    }

    public void switchBetweenWindows(int windowNumber){
        ArrayList<Object> myHandles = new ArrayList<Object>(wd.getWindowHandles());
        wd.switchTo().window(String.valueOf(myHandles.get(windowNumber)));
    }
}






