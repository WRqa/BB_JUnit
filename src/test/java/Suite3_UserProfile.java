import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite3_UserProfile extends BasicData{
    @Test
    public void test01_setQuestionnaire1Seller() {
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().setQuestionnaire();
        driver.navigate().refresh();
        webpages.MainPage().openUserProfile();
        webpages.ScreeningQuestionsTab().openScreeningQuestionsTab();
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn11Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn21Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn31Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn41Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test02_setQuestionnaire1Investor1() {
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().setQuestionnaire();
        driver.navigate().refresh();
        webpages.MainPage().openUserProfile();
        webpages.ScreeningQuestionsTab().openScreeningQuestionsTab();
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn11Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn21Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn31Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn41Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test03_setQuestionnaire1Investor2() {
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().setQuestionnaire();
        driver.navigate().refresh();
        webpages.MainPage().openUserProfile();
        webpages.ScreeningQuestionsTab().openScreeningQuestionsTab();
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn11Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn21Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn31Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn41Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test04_editScreeningQuestionsTab(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        webpages.ScreeningQuestionsTab().editScreeningQuestionsTab();
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn14Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn26Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn34Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, webpages.ScreeningQuestionsTab().getRadioBtn44Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test05_setQuestionnaire2Seller() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        Thread.sleep(2000);
        webpages.AssetDetails().setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("seller"));
    }

    @Test
    public void test06_setQuestionnaire2Investor1() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("investor1"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        Thread.sleep(2000);
        webpages.AssetDetails().setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("investor1"));
    }

    @Test
    public void test07_setQuestionnaire2Investor2() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
        webpages.MainPage().openAssetsList();
        webpages.AssetsList().clickDetailsButton();
        webpages.AssetDetails().clickInvestNowButton();
        Thread.sleep(2000);
        webpages.AssetDetails().setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("investor2"));
    }

    @Test
    public void test08_checkInvestmentQuestionnaireTab() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        webpages.InvestmentQuestionnaireTab().openInvestmentQuestionnaireTab();
        Thread.sleep(1000);
        Assert.assertEquals(data.getProperty("firstName"), webpages.InvestmentQuestionnaireTab().getFirstName());
        Assert.assertEquals(data.getProperty("lastName"), webpages.InvestmentQuestionnaireTab().getLastName());
        Assert.assertEquals(data.getProperty("dateOfBirth"), webpages.InvestmentQuestionnaireTab().getDateOfBirth());
        Assert.assertEquals(data.getProperty("socialSecurityNumber"), webpages.InvestmentQuestionnaireTab().getSocialSecurityNumber());
        Assert.assertEquals(data.getProperty("bankRouting"), webpages.InvestmentQuestionnaireTab().getBankRouting());
        Assert.assertEquals(true, webpages.InvestmentQuestionnaireTab().getRadio13Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(true, webpages.InvestmentQuestionnaireTab().getNoStatus().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(data.getProperty("profession"), webpages.InvestmentQuestionnaireTab().getProfession());
        Assert.assertEquals(data.getProperty("phone"), webpages.InvestmentQuestionnaireTab().getPhoneEdit());
        Assert.assertEquals(data.getProperty("seller"), webpages.InvestmentQuestionnaireTab().getEmailEdit());
        Assert.assertEquals("1(555) 555-5555", webpages.InvestmentQuestionnaireTab().getAlternativePhone());
        Assert.assertEquals(data.getProperty("alternativeEmail"), webpages.InvestmentQuestionnaireTab().getAlternativeEmail());
        Assert.assertEquals(data.getProperty("residenceAddress"), webpages.InvestmentQuestionnaireTab().getResidenceAdress());
        Assert.assertEquals(data.getProperty("bankAccount"), webpages.InvestmentQuestionnaireTab().getBankAccount());
    }

    @Test
    public void test09_editInvestmentQuestionnaireTab() throws InterruptedException {
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        webpages.InvestmentQuestionnaireTab().openInvestmentQuestionnaireTab();
        Thread.sleep(1000);
        webpages.InvestmentQuestionnaireTab().editDataOnInvestmentQuestionnaireTab(
                data.getProperty("editDateOfBirth"),
                data.getProperty("editSocialSecurityNumber"),
                data.getProperty("editBankRouting"),
                data.getProperty("editProfession"),
                data.getProperty("editUserEmail"),
                data.getProperty("editAlternativePhone"),
                data.getProperty("editAlternativeEmail"),
                data.getProperty("editResidenceAddress"),
                data.getProperty("editBankAccount"));
        Assert.assertEquals(data.getProperty("dateOfBirth"), webpages.InvestmentQuestionnaireTab().getDateOfBirth());
        Assert.assertEquals(data.getProperty("editSocialSecurityNumber"), webpages.InvestmentQuestionnaireTab().getSocialSecurityNumber());
        Assert.assertEquals(data.getProperty("editBankRouting"), webpages.InvestmentQuestionnaireTab().getBankRouting());
        Assert.assertEquals(true, webpages.InvestmentQuestionnaireTab().getRadio12Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(true, webpages.InvestmentQuestionnaireTab().getNoStatus().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(data.getProperty("editProfession"), webpages.InvestmentQuestionnaireTab().getProfession());
        Assert.assertEquals("1(123) 456-7890", webpages.InvestmentQuestionnaireTab().getPhoneEdit());
        Assert.assertEquals(data.getProperty("editUserEmail"), webpages.InvestmentQuestionnaireTab().getEmailEdit());
        Assert.assertEquals("1(444) 444-4444", webpages.InvestmentQuestionnaireTab().getAlternativePhone());
        Assert.assertEquals(data.getProperty("editAlternativeEmail"), webpages.InvestmentQuestionnaireTab().getAlternativeEmail());
        Assert.assertEquals(data.getProperty("editResidenceAddress"), webpages.InvestmentQuestionnaireTab().getResidenceAdress());
        Assert.assertEquals(data.getProperty("editBankAccount"), webpages.InvestmentQuestionnaireTab().getBankAccount());
    }

    @Test
    public void test10_editSettingsTab(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        Assert.assertTrue(
                webpages.MainInfo().getFullName().equals(data.getProperty("firstName") + " " + data.getProperty("lastName")));
        Assert.assertTrue(
                webpages.MainInfo().getPhone().equals("1(123) 456-7890"));
        Assert.assertTrue(
                webpages.MainInfo().getEmail().equals(data.getProperty("seller")));
        webpages.SettingsTab().editSettingsTab(
                data.getProperty("editFirstName"),
                data.getProperty("editLastName"),
                data.getProperty("editUserPhone"),
                data.getProperty("editNotes"));
        Assert.assertTrue(
                webpages.MainInfo().getFullName().equals(data.getProperty("editFirstName") + " " + data.getProperty("editLastName")));
        Assert.assertTrue(
                webpages.MainInfo().getPhone().equals("1(098) 765-4321"));
        Assert.assertTrue(
                webpages.MainInfo().getNotes().equals(data.getProperty("editNotes")));
    }

    @Test
    public void test11_editAddressTab(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        webpages.AddressTabProfile().editAddressTab(
                data.getProperty("state"),
                data.getProperty("city"),
                data.getProperty("address1"),
                data.getProperty("address2"),
                data.getProperty("zip"));
        Assert.assertEquals(
                data.getProperty("address1") + ", " + data.getProperty("city") + ", " + data.getProperty("state2") + " " + data.getProperty("zip"), webpages.MainInfo().getLeftLocation());
    }

    @Test
    public void test12_editPasswordTab(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        webpages.ChangePasswordTab().editPasswordTab(
                data.getProperty("password"),
                data.getProperty("newPassword"),
                data.getProperty("newPassword"));
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("newPassword"));
        webpages.MainPage().openUserProfile();
        webpages.ChangePasswordTab().editPasswordTab(
                data.getProperty("newPassword"),
                data.getProperty("password"),
                data.getProperty("password"));
    }
}
