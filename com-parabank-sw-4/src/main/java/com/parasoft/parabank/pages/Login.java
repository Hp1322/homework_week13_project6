package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By errorMessageText = By.xpath("//p[text()='The username and password could not be verified.']");
    By logOutButton = By.xpath("//a[text()='Log Out']");

    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }
    public String getErrorMessageText(){
        return getTextFromElement(errorMessageText);
    }
}
