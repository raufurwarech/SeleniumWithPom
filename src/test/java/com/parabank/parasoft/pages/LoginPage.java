package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillUserName(String username){
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password){
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }

    public AccountOverViewPage clickLoginButton(){
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return getInstance(AccountOverViewPage.class);
    }

    public LoginPage clickLoginLinkBtn(){
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return this;
    }

    public CustomerLookupPage clickForgetPassword(){
        getWebElement(By.cssSelector("a[href='lookup.htm']")).click();
        return getInstance(CustomerLookupPage.class);
    }

    public RegistrationPage clickRegistrationLink(){
        getWebElement(By.cssSelector("a[href='register.htm']")).click();
        return getInstance(RegistrationPage.class);
    }

    public boolean hasError(){
        return  getWebElements(By.className("error")).size() > 0;
    }

}
