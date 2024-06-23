package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.AccountOverViewPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.utils.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void doLoginWithUsernameShouldFail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage =loginPage
                .fillUserName("admin")
                .clickLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError());


    }

    @Test
    public void doLoginWithPasswordShouldFail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillPassword("admin")
                .clickLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldFail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .clickLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldSucceed(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        AccountOverViewPage overviewPage = loginPage
                .fillUserName("Sqa")
                .fillPassword("sqa")
                .clickLoginButton();
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }

    @Test
    public Void checkTittle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);
        return null;
    }


}
