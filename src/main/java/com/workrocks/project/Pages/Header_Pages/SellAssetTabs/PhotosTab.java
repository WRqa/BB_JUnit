package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PhotosTab extends AddressTab{
    ConfigProperties data = new ConfigProperties();

    public PhotosTab(WebDriver driver){
        super(driver);
    }

    public void uploadFileTab(String filePath, String buttonId) throws InterruptedException {
        webpages.Upload().uploadFile(filePath, buttonId);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='dZUpload']/div[2]/div[1]/img")));
        clickSaveAndNextButton();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='dZUpload']/div[2]/div[2]/div[1]")));
    }
}
