package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopInvestors extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public TopInvestors(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]") private WebElement userNumber;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]") private WebElement stateOrProvince;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]/a/ins") private WebElement investorName;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]") private WebElement totalInvestmentsCount;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]") private WebElement totalInvestmentsAmount;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[6]") private WebElement listOfEngagedAssets;

    public void presentElementsOnThePage(){
        Assert.assertEquals(true, userNumber.isDisplayed());
        Assert.assertEquals(true, stateOrProvince.isDisplayed());
        Assert.assertEquals(true, investorName.isDisplayed());
        Assert.assertEquals(true, totalInvestmentsCount.isDisplayed());
        Assert.assertEquals(true, totalInvestmentsAmount.isDisplayed());
        Assert.assertEquals(true, listOfEngagedAssets.isDisplayed());
    }

}
