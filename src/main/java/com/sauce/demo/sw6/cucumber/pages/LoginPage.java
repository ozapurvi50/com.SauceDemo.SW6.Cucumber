package com.sauce.demo.sw6.cucumber.pages;

import com.sauce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.LogManager;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(id ="user-name")
    WebElement userNameField;
    @CacheLookup
    @FindBy( id="password" )
    WebElement passwordField;
    @CacheLookup
    @FindBy( id="login-button" )
    WebElement loginButton;

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
        log.info("Send text to username : " + userNameField.toString());

    }

    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
        log.info("Send text to username : " + passwordField.toString());

    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
        log.info("Click on Login Button " + loginButton.toString());

    }



}
