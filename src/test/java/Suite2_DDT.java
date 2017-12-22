import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Suite2_DDT extends BasicData{

    private static StringBuffer verificationErrors = new StringBuffer();

    private String email;
    private String password;



    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(
                new Object[][]{
                        {"", ""},
                        {"rregression@yopmail.com", "test555"},
                        {"regression", "test555"},
                }
        );
    }

    public Suite2_DDT(String email, String password){
            this.email = email;
            this.password = password;
    }

        @Test
        public void testBMICalculator() throws Exception {
            WebElement log = driver.findElement(By.id("loginLink"));
            log.click();


            //Get the Height element and set the value using parameterised height variable
            WebElement heightField = driver.findElement(By.id("Email"));
            heightField.clear();
            heightField.sendKeys(email);

            //Get the Weight element and set the value using parameterised
            //Weight variable
            WebElement weightField = driver.findElement(By.name("Password"));
            weightField.clear();
            weightField.sendKeys(password);

            //Click on Calculate Button
            WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[3]/button/span"));
            calculateButton.click();
            try {
                //Get the Bmi element and verify its value using parameterised
                //bmi variable
               // WebElement bmiLabel = driver.findElement(By.name("bmi"));
               // assertEquals(bmi, bmiLabel.getAttribute("value"));

                //Get the Bmi Category element and verify its value using
                //parameterised bmiCategory variable
             //   WebElement bmiCategoryLabel = driver.findElement(By.name("bmi_category"));
             //   assertEquals(bmiCategory,bmiCategoryLabel.getAttribute("value"));

            } catch (Error e) {
                //Capture and append Exceptions/Errors
                verificationErrors.append(e.toString());
                System.err.println("Assertion Fail "+ verificationErrors.
                        toString());
            }
        }
}
