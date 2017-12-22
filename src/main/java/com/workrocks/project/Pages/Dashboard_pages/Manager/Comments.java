package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Comments extends ManagerDashboard {
    ProjectPages webpages = new ProjectPages(wd);
    public static String commentBeforeDelete;
    public static String commentAfterDelete;

    public Comments(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "UserName") private WebElement userName;
    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Message") private WebElement message;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement commentNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a/ins") private WebElement user;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement comment;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]") private WebElement dateOfCreation;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]/a/ins") private WebElement buildingName;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div/div[1]/h3") private WebElement mostActiveUsersBlock;

    @FindBy(name = "message") private WebElement messageField;


    private void clickDeleteIcon(){wd.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]/a/span")).click();}

    private void clickYesButton(){wd.findElement(By.id("deleteComment")).click();}

    private void clickEditIcon(){wd.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a/span")).click();}

    private void clickSaveComment(){wd.findElement(By.id("saveComment")).click();}


    private void setUserName(String userName){
        this.userName.clear();
        this.userName.sendKeys(userName);}

    private void setBuildingName(String buildingName){
        this.buildingNameField.clear();
        this.buildingNameField.sendKeys(buildingName);}

    private void setMessage(String message){
        this.message.clear();
        this.message.sendKeys(message);}

    private void setEditComment(String editComment){
        messageField.clear();
        messageField.sendKeys(editComment);}

    public String getUserName(){
        return user.getText();}

    public String getComment(){
        return comment.getText();}

    private void saveCommentBeforeDelete(){
        commentBeforeDelete = getComment();}

    private void saveCommentAfterDelete(){
        commentAfterDelete = getComment();}

    public String getBuildingName(){
        return buildingName.getText();}

    private void presentDataOnCommentPage(){
        Assert.assertEquals(true, userName.isDisplayed());
        Assert.assertEquals(true, buildingNameField.isDisplayed());
        Assert.assertEquals(true, message.isDisplayed());
        Assert.assertEquals(true, commentNumber.isDisplayed());
        Assert.assertEquals(true, user.isDisplayed());
        Assert.assertEquals(true, comment.isDisplayed());
        Assert.assertEquals(true, dateOfCreation.isDisplayed());
        Assert.assertEquals(true, buildingName.isDisplayed());
        Assert.assertEquals(true, mostActiveUsersBlock.isDisplayed());
    }

    public void searchCommentByUserName(String userName){
        presentDataOnCommentPage();
        setUserName(userName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(user, userName));
    }

    public void searchCommentByBuildingName(String buildingName){
        presentDataOnCommentPage();
        setBuildingName(buildingName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.buildingName, buildingName));
    }

    public void searchCommentByMessage(String message){
        presentDataOnCommentPage();
        setMessage(message);
        clickSearchButton();
       // wait.until(ExpectedConditions.textToBePresentInElement(comment, message));
    }

    public void editComment(String newComment){
        presentDataOnCommentPage();
        saveCommentBeforeDelete();
        clickEditIcon();
        setEditComment(newComment);
        clickSaveComment();
       // wait.until(ExpectedConditions.textToBePresentInElement(comment, newComment));
        saveCommentAfterDelete();
    }

    public void forwardOldComment(){
        presentDataOnCommentPage();
        clickEditIcon();
        setEditComment(commentBeforeDelete);
        clickSaveComment();
       // wait.until(ExpectedConditions.textToBePresentInElement(comment, commentBeforeDelete));
        saveCommentAfterDelete();
    }

    public void deleteComment(){
        presentDataOnCommentPage();
        saveCommentBeforeDelete();
        clickDeleteIcon();
      //  wait.until(presenceOfElementLocated(By.id("deleteComment")));
        clickYesButton();
      //  wait.until(presenceOfElementLocated(By.id("UserName")));
        saveCommentAfterDelete();
    }
}
