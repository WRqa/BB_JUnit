package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventsList extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public EventsList(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "UserName") private WebElement userNameField;
    @FindBy(id = "IP") private WebElement ipField;
    @FindBy(id = "DateRangePicker") private WebElement calendar;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement eventNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]") private WebElement dateAndTime;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement ip;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a") private WebElement userName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement managerEmail;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement action;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a/ins") private WebElement object;


    private void setUserName(String userName){
        this.userNameField.clear();
        this.userNameField.sendKeys(userName);}

    private void setIp(String ip){
        this.ipField.clear();
        this.ipField.sendKeys(ip);}

    public String getUserName(){
        return userName.getText();}

    public String getIP(){
        return ip.getText();}


    private void presentEventsOnThePage(){
        Assert.assertEquals(true, userNameField.isEnabled());
        Assert.assertEquals(true, ipField.isEnabled());
        Assert.assertEquals(true, calendar.isEnabled());
        Assert.assertEquals(true, eventNumber.isEnabled());
        Assert.assertEquals(true, dateAndTime.isEnabled());
        Assert.assertEquals(true, ip.isEnabled());
        Assert.assertEquals(true, userName.isEnabled());
        Assert.assertEquals(true, managerEmail.isEnabled());
        Assert.assertEquals(true, action.isEnabled());
        Assert.assertEquals(true, object.isEnabled());
    }

    public void searchEventByUserName(String userName){
        presentEventsOnThePage();
        setUserName(userName);
        clickSearchButton();
     //   wait.until(ExpectedConditions.textToBePresentInElement(this.userName, userName));
    }

    public void searchEventByIP(String ip){
        presentEventsOnThePage();
        setIp(ip);
        clickSearchButton();
     //   wait.until(ExpectedConditions.textToBePresentInElement(this.ip, ip));
    }
}
