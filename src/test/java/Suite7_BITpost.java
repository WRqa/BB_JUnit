import org.junit.Test;

public class Suite7_BITpost extends BasicData{

    @Test
    public void test01_sellBITsFromFixedPrice_Investor1() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().clickDashboard();
        webpages.MyBITsHoldings().openMyBITsHoldingsPage();
        webpages.MyBITsHoldings().createFixedPriceBITsSale(
                "2",
                "01/02/2017",
                "05/02/2017",
                "1111");
    }

    @Test
    public void test02_sellBITsFromAuction_Investor1() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().clickDashboard();
        webpages.MyBITsHoldings().openMyBITsHoldingsPage();
        webpages.MyBITsHoldings().createAuction(
                "3",
                "50",
                "01/06/2017",
                "1050",
                "1300",
                "1500");
    }

    @Test
    public void test03_buyBitsWithFixedPrice_Seller(){
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().openSecondaryMarket();
        webpages.AssetsList().clickDetailsButtonOnTrades();
        webpages.AssetDetails().clickBuyButton();
        webpages.PaymentPage().setFixedPrice("Sergey");
    }

    @Test
    public void test04_buyBitsFromAuction_Investor2(){

    }
}
