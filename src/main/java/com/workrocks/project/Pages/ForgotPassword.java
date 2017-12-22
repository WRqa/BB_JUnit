package com.workrocks.project.Pages;


import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassword {
    private WebDriver wd;
    private WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);

    public ForgotPassword(WebDriver driver){
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    @FindBy (id = "Email") private WebElement email;
    @FindBy (id = "Password") private WebElement password;
    @FindBy (id = "ConfirmPassword") private WebElement confirmPassword;
    @FindBy (id = "continue") private WebElement continueButton;
    @FindBy (xpath = "//button[@class = 'btn btn-primary btn-flat']") private WebElement resetButton;
    @FindBy (linkText = "click here to log in") private WebElement confirmLink;


    private void clickContinueButton(){continueButton.click();}
    private void clickResetButton() {resetButton.click();}
    private void clickConfirmLink() {confirmLink.click();}

    private void setUserEmail(String userEmail){
        email.clear();
        email.sendKeys(userEmail);}

    private void setPassword(String userPassword){
        password.clear();
        password.sendKeys(userPassword);}

    private void setConfirmPassword(String userConfirmPassword){
        confirmPassword.clear();
        confirmPassword.sendKeys(userConfirmPassword);}

    public void userPasswordRecovery(String email){
        webpages.MainPage().clickLogInButton();
        webpages.Login().clickRecoveryPasswordLink();
        setUserEmail(email);
        clickContinueButton();}

    public void setNewPassword(String email, String password, String confirmPassword){
        setUserEmail(email);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        clickResetButton();
        Assert.assertEquals("Reset password confirmation.", wd.findElement(By.id("title_forgot_password_conf")).getText());
        clickConfirmLink();}
}
