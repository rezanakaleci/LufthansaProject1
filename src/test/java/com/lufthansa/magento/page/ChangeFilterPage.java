package com.lufthansa.magento.page;

import com.lufthansa.magento.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class ChangeFilterPage {


    public ChangeFilterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[2]/nav/ul/li[2]/a/span[1]")
    public WebElement WomenDropDown;

    @FindBy(xpath = "//ul/li[2]/ul/li[1]/a/span[2]")
   public WebElement TopsDropDown;


  // @FindBy(xpath = "//div[2]/nav/ul/li[2]/ul/li[1]/ul/li[1]/a/span")
  //  public WebElement JacketMenu;
    @FindBy(xpath = "//div[2]/nav/ul/li[2]/ul/li[1]/ul/li[1]/a/span")
    public WebElement JacketMenu;

   //@FindBy(xpath = "//div[2]/div/div[2]/div/div[4]/div[2]")
    //public WebElement ColorDropDown;
    @FindBy(xpath = "//div[2]/div/div[4]/div[1]")
    public WebElement ColorDropdown;

    @FindBy(xpath = "//div[4]/div[2]/div/div/a[8]/div")
    public WebElement RedColor;

   @FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[4]/div[2]/div/div/a[2]/div")
    public WebElement BlueColor;

   @FindBy(xpath = "//div[2]/div[3]/div[3]/div[1]")
   public WebElement PriceDropDown;

   @FindBy(xpath = "//div[3]/div[2]/div/div[2]/div[3]/div[3]/div[1]")
   public WebElement PriceDropDown2;


   @FindBy(xpath = "//div[2]/div[3]/div[3]/div[2]/ol/li[1]/a")
    public WebElement FirstPrice;

   @FindBy(xpath = "//main/div[3]/div[2]/div/div[2]/div[1]/ol/li/span[2]")
   public WebElement ColorInRed;

   @FindBy(xpath = "//div/div[2]/div[1]/ol/li[1]/a")
    public WebElement PriceRemoveFilter;         ////div[2]/div[1]/ol/li[1]/a

   @FindBy(xpath = "//main/div[3]/div[1]/div[2]/p")
    public WebElement Item5;

   @FindBy(xpath = "//div[3]/div[1]/div[3]/ol/li[1]/div")
    public WebElement FirstItem;

   @FindBy(xpath = "//div[3]/ol/li[1]/div/a/span")
   public  WebElement FirstProduct;

   @FindBy(xpath = "//div[3]/ol/li[2]/div/a/span/span/img")
   public WebElement SecondProduct;

    @FindBy(xpath = "//div[3]/div[1]/div[3]/ol/li[2]/div")
    public WebElement SecondItem;

    @FindBy(xpath = "//div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[2]/a[1]")
    public WebElement AddWishList;

    @FindBy(xpath = "//div[3]/ol/li[2]/div/div/div[4]/div/div[2]/a[1]")
    public WebElement AddWishList2;


    @FindBy(xpath = "//div[2]/main/div[1]/div[2]/div/div")
    public WebElement SuccessfulMessage1;

    @FindBy(xpath = "//main/div[1]/div[2]/div/div")
    public WebElement SuccessfulMessage2;

    @FindBy(xpath = "//div[1]/div[2]/div/div/div/a")
    public WebElement ClickHereLink;

    @FindBy(xpath = "//div[2]/div/div[2]/ul/li[1]/a")
    public WebElement MyAccount;

    @FindBy(xpath = "//header/div[1]/div/ul/li[2]/span/button")
    public WebElement MyAccountButton;

    @FindBy(xpath = "//div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")
    public WebElement MyWishList2ItemDisplayed;

    @FindBy(xpath = "//div[3]/ol/li[1]/div/div/div[3]/div[1]/div/div[1]")
    public WebElement XsSize;

    @FindBy(xpath = "//ol/li[2]/div/div/div[3]/div[1]/div/div[1]")
    public WebElement XsSize2;

    @FindBy(xpath = "//div[2]/main/div[2]/div[2]/div/div")
    public WebElement DoneMessage;

    @FindBy(xpath = "//div[2]/div[2]/div/div/div")
    public WebElement SuccessfulMessage;

    @FindBy(xpath = "//div[1]/h1/span")
    public WebElement ShoppingCartName;


    @FindBy(xpath = "//div[2]/header/div[2]/div[1]/a")
    public WebElement ShoppingBag;

     @FindBy(xpath = "//div[2]/div[2]/div/div/div/a")
     public WebElement ShoppingLink;

    @FindBy(xpath = "//div/div/div/div[2]/div[5]/div/a/span")
    public WebElement ViewAndEditCard;

    @FindBy(xpath = "//table/tbody[1]/tr[2]/td/div/a[3]")
    public  WebElement RemoveItem1;

    @FindBy(xpath = "//table/tbody/tr[2]/td/div/a[3]")
     public  WebElement RemoveItem2;

    @FindBy(xpath = "//div[2]/div[1]/a/span[2]/span[1]")
    public WebElement NumberBox;


    @FindBy(className = "counter")
    public WebElement CorrectNumberOfItems;

    @FindBy(xpath = "//ol/li[1]/div/div/div[4]/div/div[1]/form/button")
    public WebElement AddToCard;

    @FindBy(xpath = "//ol/li[2]/div/div/div[4]/div/div[1]/form/button")
    public WebElement AddToCard2;

    @FindBy(xpath = "//table/tbody/tr[3]/td/strong/span")
   public WebElement SummaryTotalPrice;

    @FindBy(xpath = "//div[2]/div/table/tbody/tr[1]/td/span")
    public  WebElement SubTotalPrice;

    @FindBy(xpath = "//div[3]/div/div[2]/p[1]")
   public WebElement EmptyMessage;

    @FindBy(xpath = "//div[3]/ol/li[1]/div/div/div[2]/span/span/span[2]/span")
   public WebElement PriceOfFirstItem;

    @FindBy(xpath = "//div[3]/ol/li[2]/div/div/div[2]/span/span/span[2]/span")
    public WebElement PriceOfSecondItem;


}
