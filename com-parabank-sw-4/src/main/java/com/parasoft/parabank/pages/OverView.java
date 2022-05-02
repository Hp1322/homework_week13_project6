package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class OverView extends Utility {
    By accountOverViewText = By.xpath("//h1[text()='Accounts Overview']");


    public String getAccountOverViewText(){
        return getTextFromElement(accountOverViewText);
    }
}
