package org.fasttrackit.Automation;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.TextField;

/**
 * Created by Serbanescu on 25.05.2017.
 */
public class LoginView {
    public TextField userNameElement = new TextField().setName("username").setId("email");
    public TextField passwordElement = new TextField().setId("password");
    public WebLocator loginBtn = new WebLocator().setId("loginButton");

    public void login(String user, String pass){

        userNameElement.sendKeys(user);
        passwordElement.sendKeys(pass);
        loginBtn.click();
    }




}
