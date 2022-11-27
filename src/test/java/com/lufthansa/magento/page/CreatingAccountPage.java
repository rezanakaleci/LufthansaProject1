package com.lufthansa.magento.page;

import com.lufthansa.magento.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingAccountPage {



    public CreatingAccountPage(){
       PageFactory.initElements(Driver.getDriver(),this);

   }
     @FindBy(xpath="//div[1]/div/ul/li[3]/a")
    public WebElement creatAccountLink;

   @FindBy (id = "firstname")
    public WebElement FirstName;

   @FindBy(id="lastname")
    public WebElement LastName;

   @FindBy (id="is_subscribed")
    public WebElement SigInUpForNewLetter;


   @FindBy(xpath ="//*[@id=\"email_address\"]")
    public WebElement EmailBox;

   @FindBy(xpath="//*[@id=\"password\"]")
    public WebElement PasswordBox;

   @FindBy(xpath="//*[@id=\"password-confirmation\"]")
    public WebElement ConfirmPassword;

   @FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button/span")
    public WebElement CreatAccountButton;

   @FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
   public WebElement MessageDisplaied;

  @FindBy(className ="customer-name")
    public WebElement UserProfile;

  @FindBy(xpath ="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
    public WebElement SignOut;

}
