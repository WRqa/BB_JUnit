package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopReferrals extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public TopReferrals(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]") private WebElement userNumber;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]") private WebElement stateOrProvince;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]/a/ins") private WebElement referralName;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]") private WebElement totalReferralsCount;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]") private WebElement totalEarnedAmount;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[6]") private WebElement mostPopularChannels;

    public void presentElementsOnThePage() {
        Assert.assertEquals(true, userNumber.isDisplayed());
        Assert.assertEquals(true, stateOrProvince.isDisplayed());
        Assert.assertEquals(true, referralName.isDisplayed());
        Assert.assertEquals(true, totalReferralsCount.isDisplayed());
        Assert.assertEquals(true, totalEarnedAmount.isDisplayed());
        Assert.assertEquals(true, mostPopularChannels.isDisplayed());
    }
}
