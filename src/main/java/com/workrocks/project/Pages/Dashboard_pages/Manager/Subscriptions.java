package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Subscriptions extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);

    public Subscriptions(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email") private WebElement email;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[1]") private WebElement userNumber;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[2]/a") private WebElement userEmail;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[3]") private WebElement dateOfCreation;


    public void clickExportButton() {wd.findElement(By.id("exportToExcel")).click();}


    public void setEmail(String email){
        this.email.clear();
        this.email.sendKeys(email);}

    public String getEmail(){
        return userEmail.getText();}

    public void presentSubscriptionsOnThePage(){
        Assert.assertEquals(true, email.isEnabled());
        Assert.assertEquals(true, userNumber.isEnabled());
        Assert.assertEquals(true, userEmail.isEnabled());
        Assert.assertEquals(true, dateOfCreation.isEnabled());
    }

    public void searchByEmail(String email) {
        presentSubscriptionsOnThePage();
        setEmail(email);
        clickSearchButton();
        //wait.until(presenceOfElementLocated(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/a/ins")));
    }

}

