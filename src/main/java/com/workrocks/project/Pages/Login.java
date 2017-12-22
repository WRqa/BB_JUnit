package com.workrocks.project.Pages;

import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login{
    private WebDriver wd;
    private WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);

    public Login(WebDriver driver) {
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    @FindBy(id = "Email") private WebElement emailField;
    @FindBy(id = "Password") private WebElement passwordField;
    @FindBy(xpath = "html/body/div/div[2]/form/div[2]/span[2]/span") private WebElement validationEmail;
    @FindBy(xpath = "html/body/div/div[2]/form/div[3]/span[2]/span") private WebElement validationPassword;
    @FindBy(xpath = "html/body/div/div[2]/form/div[1]/span") private WebElement checkEmailOrPassword;
    @FindBy(xpath = "html/body/div/div[2]/form/div[2]/span[2]/span") private WebElement invalidEmail;


    private void clickLoginButton(){wd.findElement(By.id("login")).click();}

    public void clickRecoveryPasswordLink(){wd.findElement(By.linkText("I forgot my password")).click();}

    public void clickOnRegistrationLink() {wd.findElement(By.linkText("Register a new membership")).click();}



    private void setUserEmail(String userEmail){
        emailField.clear();
        emailField.sendKeys(userEmail);}

    private void setUserPassword(String userPassword){
        passwordField.clear();
        passwordField.sendKeys(userPassword);}

    public String valEmail(){
        return validationEmail.getText();}

    public String valPassword(){
        return validationPassword.getText();}

    public String valEmailAndPassword(){
        return checkEmailOrPassword.getText();}

    public String valInvalidEmail(){
        return invalidEmail.getText();}


    public void userLogin(String name, String password){
        webpages.MainPage().clickLogInButton();
        setUserEmail(name);
        setUserPassword(password);
        clickLoginButton();}


}

