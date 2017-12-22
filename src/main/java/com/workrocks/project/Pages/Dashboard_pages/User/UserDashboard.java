package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserDashboard {
    WebDriver wd;
    WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);
    ConfigProperties data = new ConfigProperties();

    public UserDashboard(WebDriver driver){
        wd = driver;
        wait = new WebDriverWait(wd, 30, 60);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    @FindBy(id = "viewAll") private WebElement viewAllHoldings;
    @FindBy(xpath = "//div[@class='row']/div[5]/div[1]/div[1]/h3") private WebElement cashValue;


    private void clickViewAllTransactions() {wd.findElement(By.linkText("View All Transactions")).click();}

    private void clickViewAllMyBITsForSale() {wd.findElement(By.linkText("View All My BITS for sale")).click();}

    private void clickViewAllDividends(){wd.findElement(By.xpath("//section[@class='content']/div[4]/section[2]/div[1]/div[2]/a")).click();}

    private void clickViewAllMyFavouritesAssets(){wd.findElement(By.xpath("//section[@class='content']/div[5]/section[2]/div[1]/div[3]/a")).click();}

    private void clickViewAllHoldings(){wd.findElement(By.id("viewAll")).click();}

    void clickFundingButton(){wd.findElement(By.xpath("//div[@class='row']/div[5]/div[1]/a[1]")).click();}

    public String getCashValue(){
        return cashValue.getText();
    }

    public void openTransactionsList(){
        webpages.MainPage().clickDashboard();
        clickViewAllTransactions();
    }

    public void openMyBITsForSale(){
        webpages.MainPage().clickDashboard();
        clickViewAllMyBITsForSale();
    }

    public void openDividendsList(){
        webpages.MainPage().clickDashboard();
        clickViewAllDividends();
    }

    public void openViewAllMyFavouritesAssets(){
        webpages.MainPage().clickDashboard();
        clickViewAllMyFavouritesAssets();
    }

    public void openMyBitsHoldings(){
        webpages.MainPage().clickDashboard();
        clickViewAllHoldings();
    }
}
