package com.lufthansa.magento.page;

import com.lufthansa.magento.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class ChangeFilterPage {


    public ChangeFilterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='ui-id-4']")       //div[2]/nav/ul/li[2]/a/span[1]
    public WebElement womenDropDown;

    @FindBy(xpath = "//*[@id='ui-id-9']")   //*[@id='ui-id-9']  //ul/li[2]/ul/li[1]/a/span[2]
   public WebElement topsDropDown;


    @FindBy(xpath = "//*[@id='ui-id-11']")    //div[2]/nav/ul/li[2]/ul/li[1]/ul/li[1]/a/span
    public WebElement jacketMenu;

    @FindBy(xpath = "//div[2]/div/div[4]/div[1]")
    public WebElement colorDropdown;

    @FindBy(xpath = "//div[4]/div[2]/div/div/a[8]/div")
    public WebElement redColor;

   @FindBy(xpath = "//div[2]/div[3]/div[3]/div[1]")
   public WebElement priceDropDown;

   @FindBy(xpath = "//div[2]/div[3]/div[3]/div[2]/ol/li[1]/a")
    public WebElement firstPrice;

   @FindBy(xpath = "//*[@option-label='Red']")
   public WebElement  borderInRed;

   @FindBy(xpath = "//*[contains(@title,'Remove Price')] ")
    public WebElement priceRemoveFilter;

   @FindBy(xpath = "//main/div[3]/div[1]/div[2]/p")
    public WebElement item5;

   @FindBy(xpath = "//div[3]/div[1]/div[3]/ol/li[1]/div")
    public WebElement firstItem;

   @FindBy(xpath = "//div[3]/ol/li[2]/div/a/span/span/img")
   public WebElement secondProduct;

    @FindBy(xpath = "//div[3]/div[1]/div[3]/ol/li[2]/div")
    public WebElement secondItem;

    @FindBy(xpath = "//div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[2]/a[1]")
    public WebElement addWishList;

    @FindBy(xpath = "//div[3]/ol/li[2]/div/div/div[4]/div/div[2]/a[1]")
    public WebElement addWishList2;


    @FindBy(xpath = "//div[2]/main/div[1]/div[2]/div/div")
    public WebElement successfulMessage1;

    @FindBy(xpath = "//main/div[1]/div[2]/div/div")
    public WebElement successfulMessage2;

    @FindBy(xpath = "//div[1]/div[2]/div/div/div/a")
    public WebElement clickHereLink;

    @FindBy(xpath = "//header/div[1]/div/ul/li[2]/span/button")
    public WebElement myAccountButton;

    @FindBy(xpath = "//div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")
    public WebElement myWishList2ItemDisplayed;

    @FindBy(xpath = "//div[3]/ol/li[1]/div/div/div[3]/div[1]/div/div[1]")
    public WebElement xsSize;

    @FindBy(xpath = "//ol/li[2]/div/div/div[3]/div[1]/div/div[1]")
    public WebElement xsSize2;

    @FindBy(xpath = "//div[2]/main/div[2]/div[2]/div/div")
    public WebElement doneMessage;


    @FindBy(xpath = "//div[1]/h1/span")
    public WebElement shoppingCartName;

     @FindBy(xpath = "//div[2]/div[2]/div/div/div/a")
     public WebElement shoppingLink;


    @FindBy(xpath = "//*[@class='counter-number']  ")
    public WebElement itemInBag;

    @FindBy(xpath = "//table/tbody[1]/tr[2]/td/div/a[3]")
    public  WebElement removeItem1;

    @FindBy(xpath = "//table/tbody/tr[2]/td/div/a[3]")
     public  WebElement removeItem2;

    @FindBy(xpath = "//ol/li[1]/div/div/div[4]/div/div[1]/form/button")
    public WebElement addToCard1;

    @FindBy(xpath = "//ol/li[2]/div/div/div[4]/div/div[1]/form/button")
    public WebElement addToCard2;

    @FindBy(xpath = "//table/tbody/tr[3]/td/strong/span")
   public WebElement summaryTotalPrice;

    @FindBy(xpath = "//div[2]/div/table/tbody/tr[1]/td/span")
    public  WebElement subTotalPrice;

    @FindBy(xpath = "//div[3]/div/div[2]/p[1]")
   public WebElement emptyMessage;

    @FindBy(xpath = "//*[@class='price-wrapper ']")
   public List<WebElement> priceOfItem;



}
