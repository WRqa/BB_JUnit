package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LatestTransactions extends UserDashboard{
    ProjectPages webpages = new ProjectPages(wd);

    public LatestTransactions(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement number;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]") private WebElement amount;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/span") private WebElement type;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]") private WebElement dateOfCreation;

    public String getAmount(){
        return amount.getText();}

    public String getStatus(){
        return type.getText();
    }

    public void checkPresentElements(){
        Assert.assertEquals(true, number.isEnabled());
        Assert.assertEquals(true, amount.isEnabled());
        Assert.assertEquals(true, type.isEnabled());
        Assert.assertEquals(true, dateOfCreation.isEnabled());
    }
}
