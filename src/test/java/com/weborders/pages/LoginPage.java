package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);//once object is created from this class, this line will be gets executed
        //first it will look for driver instance, then it will initialize usernameElement WebElement, give them life, otherwise this webElement value will be null
        //so @FindBy annotation will find that Element(@FindBy(name="ctl00$MainContent$username")) and assign it to the usernameElement
    }


    @FindBy(name="ctl00$MainContent$username")//to make this @FindBy work, we need to use PageFactory class init elements method
    private WebElement usernameElement;

    @FindBy(name="ctl00$MainContent$password")
    private WebElement passwordElement;

    public void login(){

        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password + Keys.ENTER);

    }
}
