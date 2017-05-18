package org.fasttrackit.Examples;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Serbanescu on 04.05.2017.
 */
public class LoginTest extends TestBase {

   @Test
   public void validLoginTest() {
     //initializare
       System.out.println("ready");
       driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

      //executie
       driver.findElement(By.name("username")).sendKeys("eu@fast.com");

       WebElement passwordElement = driver.findElement(By.id("password"));
       passwordElement.sendKeys("eu.pass456465445454454645454545454541212");
       passwordElement.clear();
       passwordElement.sendKeys("eu.pass");

       driver.findElement(By.id("loginButton")).click();

       driver.findElement(By.xpath("/html/body/nav/div/div/div/a")).click();}


 //  @Test
  //  public void InvalidLoginTest(){
      /*  //initializare
        System.out.println("ready");
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        //executie
        driver.findElement(By.name("username")).sendKeys("eu1@fast.com");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("eu.pass456465445454454645454545454541212");*/


    /*    driver.findElement(By.id("loginButton")).click();
        WebElement errorMsg = driver.findElement(By.className("error-msg"));
        String message = errorMsg.getText();
        System.out.println(message);

        //assert
        assertThat(message,is("Invalid user or password!"));

    }*/













/* codul se repeta - facem o metoda noua
public void doValidLogin*/
    public void DoLogin(String user, String pass) {//ii dam user si parola
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        loginPage.login(user, pass);

    }











    }





