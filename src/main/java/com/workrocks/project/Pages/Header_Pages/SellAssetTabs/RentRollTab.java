package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RentRollTab extends AddressTab{
    ConfigProperties data = new ConfigProperties();

    public RentRollTab(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "//div[@id='tabRentRoll']/form/div[2]/div/div/div[1]/div/div/ins") private WebElement singleRadio;
    @FindBy (xpath = "//div[@id='tabRentRoll']/form/div[2]/div/div/div[2]/div/div/ins") private WebElement multipleRadio;
    @FindBy (id = "plus") private WebElement plusIcon;
    @FindBy (id = "minus") private WebElement minusIcon;
    @FindBy (id = "Items_0__Tenant") private WebElement tenantField;
    @FindBy (id = "Items_0__SF") private WebElement sqFt;
    @FindBy (id = "Items_0__TermStart") private WebElement startDate;
    @FindBy (id = "Items_0__TermEnd") private WebElement endDate;
    @FindBy (id = "Items_0__AnnualRent") private WebElement annualRent;
    @FindBy (id = "Items_0__RentPSFYear") private WebElement rentOfYear;
    @FindBy (id = "Items_0__AnnualCAM") private WebElement annualCAM;
    @FindBy (id = "tenantQuality") private WebElement tenantQualityDropdown;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[1]") private WebElement tenantOption1;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[2]") private WebElement tenantOption2;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[3]") private WebElement tenantOption3;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[4]") private WebElement tenantOption4;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[5]") private WebElement tenantOption5;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[6]") private WebElement tenantOption6;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[7]") private WebElement tenantOption7;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[8]") private WebElement tenantOption8;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[9]") private WebElement tenantOption9;
    @FindBy (xpath = "//select[@id='tenantQuality']/option[10]") private WebElement tenantOption10;
    @FindBy (id = "RentalIncome") private WebElement rentalIncome;
    @FindBy (id = "Reimbursements") private WebElement reimbursements;
    @FindBy (id = "TotalGrossIncome") private WebElement totalGrossIncome;
    @FindBy (id = "NetOperatingIncome") private WebElement netOperatingIncome;
    @FindBy (id = "PropertyTaxes") private WebElement propertyTaxes;
    @FindBy (id = "Insurance") private WebElement insurance;
    @FindBy (id = "Utilities") private WebElement utilities;
    @FindBy (id = "RepairsANDMaintenance") private WebElement repairsANDMaintenance;
    @FindBy (id = "OtherExpenses") private WebElement otherExpenses;
    @FindBy (id = "TotalExpenses") private WebElement totalExpenses;

    private void clickSingleRadiobutton() {singleRadio.click();}
    private void clickMultipleRadiobutton() {multipleRadio.click();}
    private void clickPlusIcon() {plusIcon.click();}
    private void clickMinusIcon() {minusIcon.click();}
    private void clickTenantDropdown() {tenantQualityDropdown.click();}
    private void clickTenantOption1() {tenantOption1.click();}
    private void clickTenantOption2() {tenantOption2.click();}
    private void clickTenantOption3() {tenantOption3.click();}
    private void clickTenantOption4() {tenantOption4.click();}
    private void clickTenantOption5() {tenantOption5.click();}
    private void clickTenantOption6() {tenantOption6.click();}
    private void clickTenantOption7() {tenantOption7.click();}
    private void clickTenantOption8() {tenantOption8.click();}
    private void clickTenantOption9() {tenantOption9.click();}
    private void clickTenantOption10() {tenantOption10.click();}

    private void setTenantField(String tenantField){
        this.tenantField.clear();
        this.tenantField.sendKeys(tenantField);}

    private void setSqFt9(String sqFt){
        this.sqFt.clear();
        this.sqFt.sendKeys(sqFt);}

    private void setTermStart(String startDate){
        this.startDate.clear();
        this.startDate.sendKeys(startDate);}

    private void setTermEnd(String endDate){
        this.endDate.clear();
        this.endDate.sendKeys(endDate);}

    private void setAnnualRent(String annualRent){
        this.annualRent.clear();
        this.annualRent.sendKeys(annualRent);}

    private void setRentPSF(String rentOfYear){
        this.rentOfYear.clear();
        this.rentOfYear.sendKeys(rentOfYear);}

    private void setAnnualCAM(String annualCAM){
        this.annualCAM.clear();
        this.annualCAM.sendKeys(annualCAM);}

    private void setReimbursements(String reimbursements){
        this.reimbursements.clear();
        this.reimbursements.sendKeys(reimbursements);}

    private void setPropertyTaxes(String propertyTaxes){
        this.propertyTaxes.clear();
        this.propertyTaxes.sendKeys(propertyTaxes);}

    private void setInsurance(String insurance){
        this.insurance.clear();
        this.insurance.sendKeys(insurance);}

    private void setUtilities(String utilities){
        this.utilities.clear();
        this.utilities.sendKeys(utilities);}

    private void setRepairsANDMaintenance(String repairsANDMaintenance){
        this.repairsANDMaintenance.clear();
        this.repairsANDMaintenance.sendKeys(repairsANDMaintenance);}

    private void setOtherExpenses(String otherExpenses){
        this.otherExpenses.clear();
        this.otherExpenses.sendKeys(otherExpenses);}

    /**
     * get parameters from input field, forward to Double and delete "," symbols
     */
    private Double getRentalIncome(){
        return Double.valueOf(rentalIncome.getAttribute("value").replaceAll("," , ""));}

    private Double getPropertyTaxes(){
        return Double.valueOf(propertyTaxes.getAttribute("value").replaceAll("," , ""));}

    private Double getInsurance(){
        return Double.valueOf(insurance.getAttribute("value").replaceAll("," , ""));}

    private Double getUtilities(){
        return Double.parseDouble(utilities.getAttribute("value").replaceAll("," , ""));}

    private Double getRepairsANDMaintenance(){
        return Double.valueOf(repairsANDMaintenance.getAttribute("value").replaceAll("," , ""));}

    private Double getOtherExpenses(){
        return Double.valueOf(otherExpenses.getAttribute("value").replaceAll("," , ""));}

    private Double getReimbursements(){
        return Double.valueOf(reimbursements.getAttribute("value").replaceAll("," , ""));}

    public Double getTotalGrossIncome(){
        return Double.valueOf(totalGrossIncome.getAttribute("value").replaceAll("," , ""));}

    public Double getNetOperatingIncome(){
        return Double.valueOf(netOperatingIncome.getAttribute("value").replaceAll("," , ""));}

    public Double getTotalExpenses(){
        return Double.valueOf(totalExpenses.getAttribute("value").replaceAll("," , ""));}

    public String summIncome(){
        return String.valueOf(getRentalIncome() + getReimbursements());}

    public String summExpenses(){
        return String.valueOf(getPropertyTaxes() + getInsurance() + getUtilities() + getRepairsANDMaintenance() + getOtherExpenses());}

    public String summNOI(){
        return String.valueOf((getRentalIncome() + getReimbursements()) - (getPropertyTaxes() + getInsurance() + getUtilities() + getRepairsANDMaintenance() + getOtherExpenses()));}

    public void fillRentRollTab(String tenant, String SqFt, String termStart, String termEnd, String annualRent, String rentPSF, String annualCAM, String reimbursements,
                                String propertyTaxes, String insurance, String utilities, String repairsANDMaintenance, String otherExpenses){
        clickSingleRadiobutton();
        clickMultipleRadiobutton();

        clickPlusIcon();
        clickMinusIcon();
        clickPlusIcon();

        setTenantField(tenant);
        setSqFt9(SqFt);
        //setTermStart(termStart);
        //setTermEnd(termEnd);
        setAnnualRent(annualRent);
        setRentPSF(rentPSF);
        setAnnualCAM(annualCAM);

        clickTenantDropdown();
        clickTenantDropdown();
        clickTenantOption1();
        clickTenantOption2();
        clickTenantOption3();
        clickTenantOption4();
        clickTenantOption5();
        clickTenantOption6();
        clickTenantOption7();
        clickTenantOption8();
        clickTenantOption9();
        clickTenantOption10();

        setReimbursements(reimbursements);
        setPropertyTaxes(propertyTaxes);
        setInsurance(insurance);
        setUtilities(utilities);
        setRepairsANDMaintenance(repairsANDMaintenance);
        setOtherExpenses(otherExpenses);
        totalExpenses.click();
    }
}
