package org.fasttrackit.Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Serbanescu on 18.05.2017.
 */
public class LoginPage {
    @FindBy(name = "username")
    public WebElement userNameElement;

    @FindBy(id = "password")
    public WebElement passwordElement;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;






    //folosit in LoginTest
    public void login(String user, String pass){

        userNameElement.sendKeys(user);
        passwordElement.sendKeys(pass);
        loginBtn.click();
    }


  /*  public static void main(String[] args) {
        LoginPage loginPage = new LoginPage()

    }*/




}
