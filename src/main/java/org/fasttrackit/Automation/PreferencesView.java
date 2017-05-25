package org.fasttrackit.Automation;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Serbanescu on 18.05.2017.
 */
public class PreferencesView {

    private Button preferencesButton = new Button().setElCssSelector(".navbar-header button");


    private WebLocator xBtn = new WebLocator().setElCssSelector("#preferences-win button.close");

    private WebLocator statusMsg = new WebLocator().setElPath("//*[@id='preferences-win']//*[@class='status-msg']") ;

    private TextField passElement = new TextField().setElPath("//*[@id='preferences-win']//input[@name='password']");

    private TextField newPasswordElement = new TextField().setElPath("//*[@id='preferences-win']//input[@name='newPassword']");

    private TextField newPasswordRepeatElement = new TextField().setElPath("//*[@id='preferences-win']//input[@name='newPasswordRepeat']");

    private Button saveBtn = new Button().setElPath("//*[@id='preferences-win']//button[text()='Save']") ;

    private Button closeBtn = new Button().setElCssSelector("#preferences-win button.close");




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
