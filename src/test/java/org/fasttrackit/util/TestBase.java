package org.fasttrackit.util;

import com.sdl.selenium.web.utils.PropertiesReader;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.Automation.LoginView;
import org.fasttrackit.Automation.PreferencesPage;
import org.fasttrackit.Automation.LoginPage;
import org.fasttrackit.Automation.PreferencesView;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sdl.selenium.utils.config.WebDriverConfig;
import com.sdl.selenium.web.Browser;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public abstract class TestBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBase.class);
    
    public static WebDriver driver;


    protected PreferencesView preferencesView = new PreferencesView();
    protected LoginView loginView = new LoginView();






    static {
        startSuite();
    }

    private static void startSuite() {
        try {
            driver = WebDriverConfig.getWebDriver(Browser.CHROME);
        } catch (Exception e) {
            LOGGER.error("Exception when start suite", e);
        }
    }

    @AfterMethod
    public void end(ITestResult result){
        if(!result.isSuccess()){
            LOGGER.warn("test failed" + result.getName());
            Utils.getScreenShot(result.getName(), PropertiesReader.RESOURCES_PATH + "\\screenshot\\failure\\");
        }






    }








}
