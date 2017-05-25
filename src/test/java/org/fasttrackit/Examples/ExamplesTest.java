package org.fasttrackit.Examples;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sun.jna.platform.win32.Netapi32Util;
import org.fasttrackit.util.TestBase;
import org.testng.annotations.Test;
import sun.security.util.Password;

/**
 * Created by Serbanescu on 25.05.2017.
 */
public class ExamplesTest extends TestBase {



    @Test
    public void selectRow() {
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        loginView.login("eu@fast.com", "eu.pass");

        WebLocator firstName = new WebLocator().setText("John");
        WebLocator lastName = new WebLocator().setText("Moore");

        WebLocator email = new WebLocator().setText("nickwhite@mail.com");
        WebLocator row = new WebLocator().setTag("tr").setChildNodes(email);
        CheckBox select = new CheckBox(row);
    //    row.setChildNodes(email);


        select.click();

        row.setChildNodes(firstName, lastName);
        select.click();
}}
