package com.lufthansa.magento.page;

import com.lufthansa.magento.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[2]/header/div[1]/div/ul/li[2]/a")
    public WebElement SignIn;

   @FindBy(id = "email")
    public WebElement Email;

   @FindBy(id="pass")
    public WebElement Password;

   @FindBy(xpath = "//div[2]/form/fieldset/div[4]/div[1]/button/span")
    public WebElement SigInButton;

   @FindBy(xpath = "//header/div[1]/div/ul/li[1]/span")
    public WebElement WelcomeMessage;



}
