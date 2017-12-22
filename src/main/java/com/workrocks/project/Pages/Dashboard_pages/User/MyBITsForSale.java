package com.workrocks.project.Pages.Dashboard_pages.User;


import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBITsForSale extends UserDashboard{
    ProjectPages webpages = new ProjectPages(wd);

    public MyBITsForSale(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]/span") private WebElement status;


    public void clickManageIcon() {wd.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a[1]/i")).click();}

    public void clickDeleteIcon() {wd.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a[2]/i")).click();}

    public String getStatus(){
        return status.getText();}
}
