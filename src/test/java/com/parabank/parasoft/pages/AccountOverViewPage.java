package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOverViewPage extends BasePage {
    public AccountOverViewPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink(){
        return getWebElements(By.cssSelector("a[href='logout.html']")).size() > 0;
    }
}
