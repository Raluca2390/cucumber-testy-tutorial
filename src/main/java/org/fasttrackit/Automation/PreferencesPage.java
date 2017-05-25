package org.fasttrackit.Automation;

import com.sdl.selenium.web.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Name;

/**
 * Created by Serbanescu on 18.05.2017.
 */
public class PreferencesPage {
    @FindBy(css = ".navbar-header button")
    private WebElement preferencesButton;

    @FindBy ( css = "#preferences-win button.close")
    private WebElement xBtn;

    @FindBy (xpath = "//*[@id='preferences-win']//*[@class='status-msg']")
    private WebElement statusMsg ; // = driver.findElement(By.xpath("//*[@id='preferences-win']//*[@class='status-msg']"));

    @FindBy(xpath = "//*[@id='preferences-win']//input[@name='password']")
    private WebElement passElement;

    @FindBy(xpath = "//*[@id='preferences-win']//input[@name='newPassword']")
    private WebElement newPasswordElement;

    @FindBy(xpath = "//*[@id='preferences-win']//input[@name='newPasswordRepeat']")
    private WebElement newPasswordRepeatElement;

    @FindBy(xpath = "//*[@id='preferences-win']//button[text()='Save']")
    private WebElement saveBtn;

    @FindBy(css = "#preferences-win button.close")
    private WebElement closeBtn;




    public void changePassword (String pass, String newPassword, String newPasswordRepeat) {
    passElement.sendKeys(pass);
    newPasswordElement.sendKeys(newPassword);
    newPasswordRepeatElement.sendKeys(newPasswordRepeat);
    saveBtn.click();
    }

    public void Open(){
      preferencesButton.click();
    }

    public void Close(){

        Utils.sleep(400);
        closeBtn.click();
        Utils.sleep(400);
    }










}
