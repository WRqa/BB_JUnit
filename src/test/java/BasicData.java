import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.ProjectPages;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicData {
    WebDriver driver;
    WebDriverWait wait;
    ProjectPages webpages = new ProjectPages(driver);
    ConfigProperties data = new ConfigProperties();


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/workrocksQA/BB_AutoTests/Drivers_for_Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30, 500);
        webpages = new ProjectPages(driver);
        driver.manage().window().fullscreen();

        driver.get(data.getProperty("siteUrl"));
    }

    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
