import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite4_CreateAsset extends BasicData{

    @Test
    public void test01_createAssetBySeller() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("seller"),data.getProperty("password"));
        webpages.MainPage().openSellAssetPage();
        webpages.AddressTab().fillAddressTab(
                "Nebraska",
                "Omaha",
                "Ames Ave, 5",
                "10 avenue",
                "NE 68134");

        Thread.sleep(1000);
        webpages.BuildingInfoTab().fillBuildingInfoTab(
                "NewestAsset",
                "200000",
                "20000",
                "5",
                "55",
                "5000",
                "2005");

        Thread.sleep(1000);
        webpages.PhotosTab().uploadFileTab(
                "d:\\GitHub\\BuildingBits\\src\\main\\resources\\1.jpg",
                "dZUpload");

        Thread.sleep(1000);
        webpages.RentRollTab().fillRentRollTab(
                "Tenant1",
                "1000",
                "01/01/2016",
                "31/12/2018",
                "50000",
                "50000",
                "250000",
                "10000",
                "10000",
                "10000",
                "10000",
                "10000",
                "10000");
        Assert.assertEquals(
                String.valueOf(webpages.RentRollTab().getTotalGrossIncome()), webpages.RentRollTab().summIncome());
        Assert.assertEquals(
                String.valueOf(webpages.RentRollTab().getNetOperatingIncome()), webpages.RentRollTab().summNOI());
        Assert.assertEquals(
                String.valueOf(webpages.RentRollTab().getTotalExpenses()), webpages.RentRollTab().summExpenses());
        webpages.RentRollTab().clickSaveAndNextButton();

        Thread.sleep(1000);
        webpages.ReportsTab().fillReportsTab(
                "250000",
                "Test report");
        Assert.assertEquals(
                webpages.BuildingInfoTab().getSalePrice(), webpages.ReportsTab().getMySalePrice());
        Assert.assertEquals(
                webpages.ReportsTab().calcPercentage(), webpages.ReportsTab().getPercentage());
        webpages.ReportsTab().clickSaveAndNextButton();

        Thread.sleep(1000);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sendToReview")));
        webpages.AgreeTab().fillAgreeTab();
    }

    @Test
    public void test02_fillManageTab(){
        webpages.Login().userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
        webpages.ManageTab().openManageTab();
        webpages.ManageTab().fillManageTab("50000", data.getProperty("videoLink"));
        Assert.assertEquals(
                true, webpages.ManageTab().getInterestRate().toString().equals("4.25"));
        Assert.assertEquals(
                true, webpages.ManageTab().getLoanTerm().toString().equals("30.0"));
        Assert.assertEquals(
                webpages.ManageTab().getMonthlyDebtService(), webpages.ManageTab().calcMonthlyDebtService());
        webpages.ManageTab().clickSaveAndFinishButton();
    }

    @Test
    public void test03_rejectAsset(){
        webpages.Login().userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
        webpages.AddressTab().openAddressTabByManagerDashboard();
        webpages.ManageTab().clickRejectButton();
        Assert.assertEquals(
                "Rejected", webpages.AssetsUnderReview().getStatus());
    }

    @Test
    public void test04_sendAssetToApprove(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.UserDashboard().openMyBITsForSale();
        Assert.assertEquals(
                "Rejected", webpages.MyBITsForSale().getStatus());
        webpages.MyBITsForSale().clickManageIcon();
        webpages.AgreeTab().openAgreeTab();
        webpages.AgreeTab().clickSaveAndSendToReviewButton();
    }

    @Test
    public void test05_approveAsset(){
        webpages.Login().userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
        webpages.AddressTab().openAddressTabByManagerDashboard();
        webpages.ManageTab().clickApproveButton();
    }
}
