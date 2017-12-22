import com.workrocks.project.Pages.Header_Pages.AssetsList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Suite8_UserAction extends BasicData{
    @Before
    public void userLogin(){
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
    }

    @Test
    public void test01_checkLastDividends(){
        webpages.UserDashboard().openDividendsList();
        webpages.Dividends().checkPresentElements();
        Assert.assertEquals(
                "5690.70", webpages.Dividends().getAmount());
    }

    @Test
    public void test02_checkFavoriteAssets(){
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().checkFavouritesAsset();
        webpages.UserDashboard().openViewAllMyFavouritesAssets();
        webpages.MyFavoriteBuildings().checkPresentElements();
        Assert.assertEquals(
                AssetsList.nameOfFirstAsset, webpages.MyFavoriteBuildings().getAssetName());
    }

    @Ignore
    @Test
    public void test03_checkInvestmentReport(){
        webpages.UserDashboard().openTransactionsList();
        Assert.assertEquals(
                "Distributions", webpages.LatestTransactions().getStatus());
        Assert.assertEquals(
                "10000", webpages.LatestTransactions().getAmount());
    }
}
