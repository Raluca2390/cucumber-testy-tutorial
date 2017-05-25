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

    private WebLocator win = new WebLocator().setId("preferences-win");

    private WebLocator xBtn = new Button(win).setClasses("button.close");

    //private TextField passElement = new TextField(win).setElPath("//input[@name='password']");
    private TextField passElement = new TextField(win).setName("password");

    private TextField newPasswordElement = new TextField(win).setName("newPassword");

    private TextField newPasswordRepeatElement = new TextField(win).setName("newPasswordRepeat");

    private WebLocator statusMsg = new WebLocator(win).setClasses("status-msg");

   // private Button saveBtn = new Button(win).setElPath("//button[text()='Save']");
   private Button saveBtn = new Button(win).setText("Save");

    //private Button closeBtn = new Button(win).setElCssSelector(".modal-footer button");

    private Button closeBtn = new Button(win).setText("Close");

    public void changePassword(String pass, String newPassword, String newPasswordRepeat) {
        passElement.sendKeys(pass);
        newPasswordElement.sendKeys(newPassword);
        newPasswordRepeatElement.sendKeys(newPasswordRepeat);
        saveBtn.click();
    }

    public void open() {
        preferencesButton.click();
        Utils.sleep(400);
    }

    public void close() {


        closeBtn.click();
        Utils.sleep(400);
    }


}
