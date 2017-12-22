package com.workrocks.project.Pages.Settings;

import com.workrocks.project.Pages.Asset_details_page.AssetDetails;
import com.workrocks.project.Pages.Asset_details_page.PaymentPage;
import com.workrocks.project.Pages.Dashboard_pages.Manager.*;
import com.workrocks.project.Pages.Dashboard_pages.User.*;
import com.workrocks.project.Pages.ForgotPassword;
import com.workrocks.project.Pages.Header_Pages.AssetsList;
import com.workrocks.project.Pages.Header_Pages.Profile.*;
import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;
import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.*;
import com.workrocks.project.Pages.Login;
import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Register;
import org.openqa.selenium.WebDriver;

public class ProjectPages {
    WebDriver wd;

    public ProjectPages(WebDriver driver) {
        wd = driver;
    }

    public MainPage MainPage() {return new MainPage(wd);}
    public Login Login() {return new Login(wd);}
    public Register Register() {return new Register(wd);}
    public ForgotPassword ForgotPassword() {return new ForgotPassword(wd);}

    public MainInfo MainInfo() {return new MainInfo(wd);}
    public SettingsTab SettingsTab() {return new SettingsTab(wd);}
    public com.workrocks.project.Pages.Header_Pages.Profile.AddressTab AddressTabProfile() {return new com.workrocks.project.Pages.Header_Pages.Profile.AddressTab(wd);}
    public ScreeningQuestionsTab ScreeningQuestionsTab() {return new ScreeningQuestionsTab(wd);}
    public InvestmentQuestionnaireTab InvestmentQuestionnaireTab() {return new InvestmentQuestionnaireTab(wd);}
    public ChangePasswordTab ChangePasswordTab() {return new ChangePasswordTab(wd);}

    public ManagerDashboard ManagerDashboard() {return new ManagerDashboard(wd);}
    public AssetsUnderReview AssetsUnderReview() {return new AssetsUnderReview(wd);}
    public ApprovedAssets ApprovedAssets() {return new ApprovedAssets(wd);}
    public Trades Trades() {return new Trades(wd);}
    public SoldOutAssets SoldOutAssets() {return new SoldOutAssets(wd);}
    public FinancialSummary FinancialSummary() {return new FinancialSummary(wd);}
    public Investment Investment() {return new Investment(wd);}
    public UserList UserList() {return new UserList(wd);}
    public Subscriptions Subscriptions() {return new Subscriptions(wd);}
    public TransactionList TransactionList() {return new TransactionList(wd);}
    public PromoCode PromoCode() {return new PromoCode(wd);}
    public Comments Comments() {return new Comments(wd);}
    public TopInvestors TopInvestors() {return new TopInvestors(wd);}
    public TopSellers TopSellers() {return new TopSellers(wd);}
    public TopReferrals TopReferrals() {return new TopReferrals(wd);}
    public EventsList EventsList() {return new EventsList(wd);}

    public AssetsList AssetsList() {return new AssetsList(wd);}
    public AssetDetails AssetDetails() {return new AssetDetails(wd);}
    public PaymentPage PaymentPage() {return new PaymentPage(wd);}

    public UserDashboard UserDashboard() {return new UserDashboard(wd);}
    public MyBITsHoldings MyBITsHoldings() {return new MyBITsHoldings(wd);}
    public MyBITsForSale MyBITsForSale() {return new MyBITsForSale(wd);}
    public LatestTransactions LatestTransactions(){return new LatestTransactions(wd);}
    public Dividends Dividends(){return new Dividends(wd);}
    public MyFavoriteBuildings MyFavoriteBuildings(){return new MyFavoriteBuildings(wd);}
    public Funding Funding(){return new Funding(wd);}


    public ReadMail ReadMail() {return new ReadMail(wd);}
    public Upload Upload() {return new Upload(wd);}
    public RobotAction RobotAction() {return new RobotAction(wd);}

    public AddressTab AddressTab() {return new AddressTab(wd);}
    public BuildingInfoTab BuildingInfoTab() {return new BuildingInfoTab(wd);}
    public PhotosTab PhotosTab() {return new PhotosTab(wd);}
    public RentRollTab RentRollTab() {return new RentRollTab(wd);}
    public ReportsTab ReportsTab() {return new ReportsTab(wd);}
    public AgreeTab AgreeTab() {return new AgreeTab(wd);}
    public ManageTab ManageTab() {return new ManageTab(wd);}
}