import com.workrocks.project.Pages.Dashboard_pages.Manager.PromoCode;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

public class Suite5_Investition extends BasicData{

    @Test
    public void test01_addFunds_Seller(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().clickDashboard();
        webpages.Funding().addFunds("123456", "My bank", "500000");
        Assert.assertEquals(
                "$500,000", webpages.UserDashboard().getCashValue());
    }

    @Test
    public void test02_addFunds_Investor1(){
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().clickDashboard();
        webpages.Funding().addFunds("123456", "My bank", "500000");
        Assert.assertEquals(
                "$500,000", webpages.UserDashboard().getCashValue());
    }

    @Test
    public void test03_addFunds_Investor2(){
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().clickDashboard();
        webpages.Funding().addFunds("123456", "My bank", "500000");
        Assert.assertEquals(
                "$500,000", webpages.UserDashboard().getCashValue());
    }

    @Test
    public void test04_buyAssetWithoutDiscount_Investor2(){
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        webpages.PaymentPage().setInvestmentAmount("13000", "Sergey");
        Assert.assertEquals(
                "$14,000.00", webpages.PaymentPage().getSubtotal());
        Assert.assertEquals(
                "$210.00", webpages.PaymentPage().getFee());
        Assert.assertEquals(
                "$14,210.00", webpages.PaymentPage().getTotal());
        webpages.PaymentPage().clickMakeInvestment();
        Assert.assertEquals(
                true, webpages.PaymentPage().confirmationText.isEnabled());
        webpages.UserDashboard().openMyBitsHoldings();
        Assert.assertEquals(
                true, driver.findElement(By.xpath("//ul[@class='products-list product-list-in-box']/li/div[2]/a[2]/span")).isEnabled());
    }

    @Ignore
    @Test
    public void test05_buyAssetWithDiscount_Investor1(){
        webpages.MainPage().openUserProfile();
        driver.get(webpages.MainInfo().getReferralLink());

    }

    @Test
    public void test06_createFixedBonusPromoCodeAndBuyAsset_Investor1(){
        webpages.Login().userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
        webpages.ManagerDashboard().openPromoCodeList();
        webpages.PromoCode().createFixedBonus(data.getProperty("quantityOfPromoCode"), data.getProperty("valueOfFixedBonus"));
        Assert.assertEquals(
                "Fixed Bonus", webpages.PromoCode().getPromoType());
        webpages.MainPage().signOut();
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        webpages.PaymentPage().setInvestmentAmount("13000", "Sergey");
        webpages.PaymentPage().setFixedPromoCode(PromoCode.fixedBonus);
        Assert.assertEquals(
                "$14,000.00", webpages.PaymentPage().getSubtotal());
        Assert.assertEquals(
                "$210.00", webpages.PaymentPage().getFee());
        Assert.assertEquals(
                "$14,110.00", webpages.PaymentPage().getTotal());
        webpages.PaymentPage().clickMakeInvestment();
        Assert.assertEquals(
                true, driver.findElement(By.cssSelector(".page-header")).isEnabled());
        webpages.UserDashboard().openTransactionsList();
        webpages.LatestTransactions().checkPresentElements();
        Assert.assertEquals("14110.00", webpages.LatestTransactions().getAmount());
    }

    @Test
    public void test07_createPurchasePriceDiscountPromoCodeAndBuyAsset_Investor2(){
        webpages.Login().userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
        webpages.ManagerDashboard().openPromoCodeList();
        webpages.PromoCode().createPurchasePriceDiscount(data.getProperty("quantityOfPromoCode"), data.getProperty("valueOfPriceDiscount"));
        Assert.assertEquals(
                "Purchase Price Discount (%)", webpages.PromoCode().getPromoType());
        webpages.MainPage().signOut();
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        webpages.PaymentPage().setInvestmentAmount("13000", "Sergey");
        webpages.PaymentPage().setDiscountPromoCode(PromoCode.purchasePriceDiscount);
        Assert.assertEquals(
                "$14,000.00", webpages.PaymentPage().getSubtotal());
        Assert.assertEquals(
                "$210.00", webpages.PaymentPage().getFee());
        Assert.assertEquals(
                "$12,810.00", webpages.PaymentPage().getTotal());
        webpages.PaymentPage().clickMakeInvestment();
        Assert.assertEquals(
                true, driver.findElement(By.cssSelector(".page-header")).isEnabled());
        webpages.UserDashboard().openTransactionsList();
        webpages.LatestTransactions().checkPresentElements();
        Assert.assertEquals("12810.00", webpages.LatestTransactions().getAmount());
    }


    @Test
    public void test08_createPromoCodeWithFreeDiscountAndBuyAsset_Investor2(){
        webpages.Login().userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
        webpages.ManagerDashboard().openPromoCodeList();
        webpages.PromoCode().createFreeDiscount(data.getProperty("quantityOfPromoCode"));
        Assert.assertEquals(
                "Free Discount (%)", webpages.PromoCode().getPromoType());
        webpages.MainPage().signOut();
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        webpages.PaymentPage().setInvestmentAmount("13000", "Sergey");
        webpages.PaymentPage().setFreeDiscountPromoCode(PromoCode.freeDiscount);
        Assert.assertEquals(
                "$14,000.00", webpages.PaymentPage().getSubtotal());
        Assert.assertEquals(
                "$0.00", webpages.PaymentPage().getFee());
        Assert.assertEquals(
                "$14,000.00", webpages.PaymentPage().getTotal());
        webpages.PaymentPage().clickMakeInvestment();
        Assert.assertEquals(
                true, driver.findElement(By.cssSelector(".page-header")).isEnabled());
        webpages.UserDashboard().openTransactionsList();
        webpages.LatestTransactions().checkPresentElements();
        Assert.assertEquals("14000.00", webpages.LatestTransactions().getAmount());
    }

    @Test
    public void test09_addCommentOnFirstAsset_Investor1(){
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().addComment(data.getProperty("comment1"));
        Assert.assertEquals(data.getProperty("comment1"), webpages.AssetDetails().getComment());
    }

    @Test
    public void test10_addCommentOnSecondAsset_Investor2(){
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickSecondDetailsButton();
        webpages.AssetDetails().addComment(data.getProperty("comment2"));
        Assert.assertEquals(data.getProperty("comment2"), webpages.AssetDetails().getComment());
    }

}
