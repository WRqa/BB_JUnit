import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite1_RegistrationAndPasswordRecovery extends BasicData {

    @Test
    public void test01_sellerRegistration() throws InterruptedException {
        //webpages.ReadMail().clearAllMessages(data.getProperty("seller"), data.getProperty("gmailpassword"));
        //webpages.Register().deleteUserFromBase(data.getProperty("seller"));
        webpages.MainPage().clickJoinFreeButton();
        webpages.Register().setUserData(
                data.getProperty("firstName"),
                data.getProperty("lastName"),
                data.getProperty("userPhone"),
                data.getProperty("seller"),
                data.getProperty("password"),
                data.getProperty("password"));
        Assert.assertEquals(
                true, driver.findElement(By.className("login-box-body")).isEnabled());
        webpages.Register().clickNextButton();
        Thread.sleep(2000);
        webpages.ReadMail().openConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"));
        webpages.ReadMail().deleteConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"));
    }

    @Test
    public void test02_investor1Registration() throws InterruptedException {
        webpages.ReadMail().clearAllMessages(data.getProperty("investor1"), data.getProperty("gmailpassword"));
        webpages.Register().deleteUserFromBase(data.getProperty("investor1"));
        driver.get(data.getProperty("siteUrl"));
        webpages.MainPage().clickJoinFreeButton();
        webpages.Register().setUserData(
                data.getProperty("firstName"),
                data.getProperty("lastName"),
                data.getProperty("userPhone"),
                data.getProperty("investor1"),
                data.getProperty("password"),
                data.getProperty("password"));
        Assert.assertEquals(
                true, driver.findElement(By.className("login-box-body")).isEnabled());
        webpages.Register().clickNextButton();
        Thread.sleep(2000);
        webpages.ReadMail().openConfirmationMessage(data.getProperty("investor1"), data.getProperty("gmailpassword"));
        webpages.ReadMail().deleteConfirmationMessage(data.getProperty("investor1"), data.getProperty("gmailpassword"));
    }

    @Test
    public void test03_investor2RegistrationViaReferralLink() throws InterruptedException {
        webpages.ReadMail().clearAllMessages(data.getProperty("investor2"), data.getProperty("gmailpassword"));
        webpages.Register().deleteUserFromBase(data.getProperty("investor2"));
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        driver.get(webpages.MainInfo().getReferralLink());
        webpages.Register().setUserData(
                data.getProperty("firstName"),
                data.getProperty("lastName"),
                data.getProperty("userPhone"),
                data.getProperty("investor2"),
                data.getProperty("password"),
                data.getProperty("password"));
        Assert.assertEquals(
                true, driver.findElement(By.className("login-box-body")).isEnabled());
        webpages.Register().clickNextButton();
        Thread.sleep(2000);
        webpages.ReadMail().openConfirmationMessage(data.getProperty("investor2"), data.getProperty("gmailpassword"));
        webpages.ReadMail().deleteConfirmationMessage(data.getProperty("investor2"), data.getProperty("gmailpassword"));
    }

    @Test
    public void test04_checkUsersHaveRegistered() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("manager"),data.getProperty("managerPassword"));
        webpages.ManagerDashboard().openUserList();
        Assert.assertEquals(
                data.getProperty("seller"), driver.findElement(By.linkText("workrocksqa@gmail.com")).getText());
        Assert.assertEquals(
                data.getProperty("investor1"), driver.findElement(By.linkText("investor1qa@gmail.com")).getText());
        Assert.assertEquals(
                data.getProperty("investor2"), driver.findElement(By.linkText("investor2qa@gmail.com")).getText());
    }

    @Test
    public void test05_passwordRecovery() throws InterruptedException {
        webpages.ReadMail().clearAllMessages(data.getProperty("seller"), data.getProperty("gmailpassword"));
        webpages.ForgotPassword().userPasswordRecovery(data.getProperty("seller"));
        Assert.assertEquals(
                true, driver.findElement(By.id("title_forgot_password_conf")).isDisplayed());
        Thread.sleep(3000);
        webpages.ReadMail().openConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"));
        webpages.ReadMail().deleteConfirmationMessage(data.getProperty("investor2"), data.getProperty("gmailpassword"));
        webpages.ForgotPassword().setNewPassword(
                data.getProperty("seller"),
                data.getProperty("password"),
                data.getProperty("password"));
        Assert.assertEquals(
                "LOG IN", driver.findElement(By.id("login")).getText());
    }
}
