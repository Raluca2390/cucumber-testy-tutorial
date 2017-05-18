package org.fasttrackit.Examples;

import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.fasttrackit.util.TestBase.driver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Serbanescu on 11.05.2017.
 */
public class PreferencesTest extends TestBase {

    @Test
    public void preferencesWindowShouldCloseTest() {
       //public static in Login test pt DoLogin("eu@fast.com", "eu.pass");


        LoginTest login = new LoginTest();
        login.DoLogin("eu@fast.com", "eu.pass");


        WebElement preferencesBtn = driver.findElement(By.cssSelector(".navbar-header button"));
        preferencesBtn.click();

        Utils.sleep(400);

        WebElement closeBtn = driver.findElement(By.cssSelector("#preferences-win button.close"));
        closeBtn.click();

    }


    @Test
    public void tryToChangePasswordWithInvalidPasswordTest(){
        LoginTest login = new LoginTest();
        login.DoLogin("eu@fast.com", "eu.pass");


        WebElement preferencesBtn = driver.findElement(By.cssSelector(".navbar-header button"));
        preferencesBtn.click();

        Utils.sleep(400);

        driver.findElement(By.xpath("//*[@id='preferences-win']//input[@name='password']")).sendKeys("wrong.pass");
        driver.findElement(By.xpath("//*[@id='preferences-win']//input[@name='newPassword']")).sendKeys("newpass1");
        driver.findElement(By.xpath("//*[@id='preferences-win']//input[@name='newPasswordRepeat']")).sendKeys("newpass1");
        driver.findElement(By.xpath("//*[@id='preferences-win']//button[text()='Save']")).click();

        WebElement statusMsg = driver.findElement(By.xpath("//*[@id='preferences-win']//*[@class='status-msg']"));
        String message = statusMsg.getText();
        assertThat(message, is("Your preview password is incorrect!"));



    }


    @Test
    public void tryToReenterNewWrongPasswordTest(){

        LoginTest login = new LoginTest();
        login.DoLogin("eu@fast.com", "eu.pass");


        WebElement preferencesBtn = driver.findElement(By.cssSelector(".navbar-header button"));
        preferencesBtn.click();

        Utils.sleep(400);

        driver.findElement(By.xpath("//*[@id='preferences-win']//input[@name='password']")).sendKeys("eu.pass");
        driver.findElement(By.xpath("//*[@id='preferences-win']//input[@name='newPassword']")).sendKeys("newpass1");
        driver.findElement(By.xpath("//*[@id='preferences-win']//input[@name='newPasswordRepeat']")).sendKeys("newpass2");
        driver.findElement(By.xpath("//*[@id='preferences-win']//button[text()='Save']")).click();

        WebElement statusMsg = driver.findElement(By.xpath("//*[@id='preferences-win']//*[@class='status-msg']"));
        String message = statusMsg.getText();
        assertThat(message, is("Password does not match the confirm password!"));
        System.out.println(message);




    }



























}
