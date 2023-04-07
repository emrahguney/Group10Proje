package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {PageFactory.initElements(WD.getDriver(),this);}


    public WebElement getWebElement(String Button){

        switch (Button)
        {


            default: return null;
        }

    }

    }