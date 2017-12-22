package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;
import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingInfoTab extends AddressTab{
    ConfigProperties data = new ConfigProperties();

    public BuildingInfoTab(WebDriver driver){
        super(driver);
        }

    @FindBy (id = "Title") private WebElement buildingName;
    @FindBy (id = "Price") private WebElement salePrice;
    @FindBy (id = "NOI") private WebElement noi;
    @FindBy (id = "NumberOfFloors") private WebElement numberOfFloors;
    @FindBy (id = "NumberOfUnits") private WebElement numberOfUnits;
    @FindBy (id = "SquareFootage") private WebElement squareFootage;
    @FindBy (id = "YearBuilt") private WebElement yearBuilt;

    @FindBy (xpath = "//select[@id='selectedConstructionTypes']/option[1]") private WebElement constructionTypeValue1;
    @FindBy (xpath = "//select[@id='selectedConstructionTypes']/option[2]") private WebElement constructionTypeValue2;
    @FindBy (xpath = "//select[@id='selectedConstructionTypes']/option[3]") private WebElement constructionTypeValue3;
    @FindBy (xpath = "//select[@id='selectedConstructionTypes']/option[4]") private WebElement constructionTypeValue4;
    @FindBy (xpath = "//select[@id='selectedConstructionTypes']/option[5]") private WebElement constructionTypeValue5;

    @FindBy (xpath = "//select[@id='selectedPropertyTypes']/option[1]") private WebElement propertyTypeValue1;
    @FindBy (xpath = "//select[@id='selectedPropertyTypes']/option[2]") private WebElement propertyTypeValue2;
    @FindBy (xpath = "//select[@id='selectedPropertyTypes']/option[3]") private WebElement propertyTypeValue3;
    @FindBy (xpath = "//select[@id='selectedPropertyTypes']/option[4]") private WebElement propertyTypeValue4;

    @FindBy (xpath = "//div[@class='form-group']/div/div[1]/div/div") private WebElement buildingClassA;
    @FindBy (xpath = "//div[@class='form-group']/div/div[2]/div/div") private WebElement buildingClassB;
    @FindBy (xpath = "//div[@class='form-group']/div/div[3]/div/div") private WebElement buildingClassC;

    private void clickConstructionValue1() {constructionTypeValue1.click();}
    private void clickConstructionValue2() {constructionTypeValue2.click();}
    private void clickConstructionValue3() {constructionTypeValue3.click();}
    private void clickConstructionValue4() {constructionTypeValue4.click();}
    private void clickConstructionValue5() {constructionTypeValue5.click();}

    private void clickPropertytypeValue1() {propertyTypeValue1.click();}
    private void clickPropertytypeValue2() {propertyTypeValue2.click();}
    private void clickPropertytypeValue3() {propertyTypeValue3.click();}
    private void clickPropertytypeValue4() {propertyTypeValue4.click();}

    private void clickBuildingClassA() {buildingClassA.click();}
    private void clickBuildingClassB() {buildingClassB.click();}
    private void clickBuildingClassC() {buildingClassC.click();}

    private void setBuildingName(String buildingName){
        this.buildingName.clear();
        this.buildingName.sendKeys(buildingName);}

    private void setSalePrice(String salePrice){
        this.salePrice.clear();
        this.salePrice.sendKeys(salePrice);}

    public Double getSalePrice(){
        return Double.valueOf(salePrice.getAttribute("value").replaceAll(",", ""));}

    private void setNOI(String NOI){
        noi.clear();
        noi.sendKeys(NOI);}

    private void setNumberOfFloors(String numberOfFloors){
        this.numberOfFloors.clear();
        this.numberOfFloors.sendKeys(numberOfFloors);}

    private void setNumberOfUnits(String numberOfUnits){
        this.numberOfUnits.clear();
        this.numberOfUnits.sendKeys(numberOfUnits);}

    private void setSquareFootage(String squareFootage){
        this.squareFootage.clear();
        this.squareFootage.sendKeys(squareFootage);}

    private void setYearBuilt(String yearBuilt){
        this.yearBuilt.clear();
        this.yearBuilt.sendKeys(yearBuilt);}

    public void fillBuildingInfoTab(String buildingName, String salesPrice, String NOI, String numberOfFloors, String numberOfUnits,
                                    String squareFootage, String yearBuilt){
        setBuildingName(buildingName);
        setSalePrice(salesPrice);
        setNOI(NOI);
        setNumberOfFloors(numberOfFloors);
        setNumberOfUnits(numberOfUnits);
        setSquareFootage(squareFootage);
        setYearBuilt(yearBuilt);
        clickConstructionValue1();
        clickConstructionValue2();
        clickConstructionValue3();
        clickConstructionValue4();
        clickConstructionValue5();
        clickPropertytypeValue1();
        clickPropertytypeValue2();
        clickPropertytypeValue3();
        clickPropertytypeValue4();
        clickBuildingClassA();
        clickBuildingClassB();
        clickBuildingClassC();
        clickSaveAndNextButton();
    }
}
