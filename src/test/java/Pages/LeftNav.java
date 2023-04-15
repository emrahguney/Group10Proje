package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {PageFactory.initElements(WD.getDriver(),this);}

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHumanResources;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestations;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positionsTab;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;


    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parameters;


    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement fields;


    public WebElement getWebElement(String Button){

        switch (Button)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "fields" : return fields;
            case "humanResources": return humanResources;
            case "setupHumanResources": return setupHumanResources;
            case "positionCategories": return positionCategories;
            case "attestations": return attestations;
            case "positionsTab" :return positionsTab;
            case "nationalities": return nationalities;


            default: return null;
        }

    }

    }