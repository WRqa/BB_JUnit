import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite2_Login extends BasicData{
    @Test
    public void test01_loginWithValidData(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.className("dropdown")));
        webpages.MainPage().openProfileMenu();
        Assert.assertTrue(
                driver.findElement(By.linkText("Sign out")).isDisplayed());
    }

    @Test
    public void test02_loginWithEmptyFields(){
        webpages.Login().userLogin("","");
        Assert.assertEquals(
                "Please enter your email", webpages.Login().valEmail());
        Assert.assertEquals(
                "Please enter your password", webpages.Login().valPassword());
    }

    @Test
    public void test03_loginWithIncorrectEmail(){
        webpages.Login().userLogin("rregression@yopmail.com","test555");
        Assert.assertEquals(
                "Please check your email or password", webpages.Login().valEmailAndPassword());
    }

    @Test
    public void test04_loginWithInvalidEmailAndPassword(){
        webpages.Login().userLogin("regression","test555");
        Assert.assertEquals(
                "Please enter a valid email address.", webpages.Login().valInvalidEmail());
    }


}
