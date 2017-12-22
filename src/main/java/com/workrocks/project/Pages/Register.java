package com.workrocks.project.Pages;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.ProjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
    private WebDriver wd;
    private WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(wd);
    ConfigProperties data = new ConfigProperties();

    public Register(WebDriver driver) {
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);
        webpages = new ProjectPages(wd);
    }

    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "Phone") private WebElement phoneNumber;
    @FindBy(id = "Email") private WebElement emailField;
    @FindBy(id = "Password") private WebElement passwordField;
    @FindBy(id = "ConfirmPassword") private WebElement confirmPassword;


    private void clickSubmitCheckbox(){ wd.findElement(By.className("iCheck-helper")).click();}

    private void clickJoinFreeButton(){wd.findElement(By.xpath("html/body/div[1]/div[2]/form/div[10]/div/button")).click();}

    private void clickTermOfUseLink(){
        wd.findElement(By.id("myModalTermsOfService")).click();
    }

    private void clickPrivacyPolicyLink(){
        wd.findElement(By.id("myModalPrivacyPolicy")).click();
    }

    public void clickNextButton() {wd.findElement(By.id("next")).click();}


    private void setFirstName(String userFirstName){
        firstName.clear();
        firstName.sendKeys(userFirstName);
}

    private void setLastName(String userLastName){
        lastName.clear();
        lastName.sendKeys(userLastName);}

    private void setPhoneNumber(String userPhoneNumber) {
        phoneNumber.clear();
        phoneNumber.sendKeys(userPhoneNumber);}

    private void setEmailField(String userEmail){
        emailField.clear();
        emailField.sendKeys(userEmail);}

    private void setPasswordField(String userPassword){
        passwordField.clear();
        passwordField.sendKeys(userPassword);}

    private void setConfirmPassword(String userConfirmPassword){
        confirmPassword.clear();
        confirmPassword.sendKeys(userConfirmPassword);}


    public void setUserData(String firstName, String lastName, String phoneNumber, String email, String password, String confirmPassword){
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setEmailField(email);
        setPasswordField(password);
        setConfirmPassword(confirmPassword);
        clickSubmitCheckbox();
        clickJoinFreeButton();
    }

    public void deleteUserFromBase(String email){
        wd.get("http://10.47.100.56:14815/Home/HardDelete?email="+email);
    }
}
