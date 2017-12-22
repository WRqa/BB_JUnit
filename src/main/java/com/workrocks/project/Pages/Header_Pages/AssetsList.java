package com.workrocks.project.Pages.Header_Pages;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssetsList {
    private WebDriver wd;
    private WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);
    public static String nameOfFirstAsset;

    public AssetsList(WebDriver driver) {
        wd = driver;
        wait = new WebDriverWait(wd, 30, 60);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    @FindBy(xpath = "//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/h4/a") private WebElement assetName;
    @FindBy(xpath = "//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/a") private WebElement favouriteIcon;

    public void clickDetailsButton() {wd.findElement(By.xpath("//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[3]/div[3]/a")).click();}
    public void clickSecondDetailsButton() {wd.findElement(By.xpath("//div[@id='newacquisitions-asset-list']/section[3]/div[1]/div[1]/div[1]/div[3]/div[3]/a")).click();}
    public void clickDetailsButtonOnTrades() {wd.findElement(By.xpath("//div[@id='trades']/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[3]/a")).click();}

    private void clickRadioBtn11() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[1]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn14() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[1]/div/div[4]/div/ins")).click();}
    private void clickRadioBtn21() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[1]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn26() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[1]/div/div[6]/div/ins")).click();}
    private void clickRadioBtn31() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[2]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn34() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[2]/div/div[4]/div/ins")).click();}
    private void clickRadioBtn41() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[2]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn44() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[2]/div/div[4]/div/ins")).click();}
    private void clickSaveQuestionnaireButton() {wd.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[4]/div/button")).click();}
    private void clickFavoriteAsset(){favouriteIcon.click();}

    public void setQuestionnaire(){
        clickRadioBtn14();
        clickRadioBtn11();
        clickRadioBtn26();
        clickRadioBtn21();
        clickRadioBtn34();
        clickRadioBtn31();
        clickRadioBtn44();
        clickRadioBtn41();
        clickSaveQuestionnaireButton();
     //   wait.until(ExpectedConditions.visibilityOf(assetName));
    }

    private void getAssetName(){
        nameOfFirstAsset = assetName.getText();}

    public void checkFavouritesAsset(){
        if (favouriteIcon.getAttribute("title").equals("Delete from My Favorites")){
            getAssetName();
        }else{
            getAssetName();
            clickFavoriteAsset();
        }
    }
}

