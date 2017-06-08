package org.fasttrackit.Examples;

import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.table.Row;
import com.sdl.selenium.web.table.Table;
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
}
    @Test
    public void selectRowTest(){
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        loginView.login("eu@fast.com", "eu.pass");

        Table table = new Table().setClasses("table-striped");
        Row row =  table.getRow(2);
        CheckBox select = new CheckBox(row);
        select.click();


        Row row2 =  table.getRow("nickwhite@mail.com");
        CheckBox select2 = new CheckBox(row2);
        select2.click();

        Row row3 =  table.getRow("bobsmith", SearchType.CASE_INSENSITIVE.STARTS_WITH);
        CheckBox select3 = new CheckBox(row3);
        select3.click();





    }


}
