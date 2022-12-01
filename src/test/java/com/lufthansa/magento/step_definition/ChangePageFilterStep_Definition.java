package com.lufthansa.magento.step_definition;

import com.lufthansa.magento.page.ChangeFilterPage;
import com.lufthansa.magento.utilities.BrowserUtils;
import com.lufthansa.magento.utilities.ConfigurationReader;
import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ChangePageFilterStep_Definition {

    ChangeFilterPage changeFilterPage = new ChangeFilterPage();
    Actions action = new Actions(Driver.getDriver());


    @When("User on store menu click on Women dropdown.")
    public void onStoreMenuClickOnWomenDropdown() {

        action.moveToElement(changeFilterPage.womenDropDown);

    }

    @Then("User hover over Tops dropdown on the open pop up")
    public void userHoverOverTopsDropdownOnTheOpenPopUp() {

        action.moveToElement(changeFilterPage.topsDropDown).perform();

    }

    @And("User click on Jacket menu option")
    public void userClickOnJacketMenuOption() {
        action.moveToElement(changeFilterPage.jacketMenu).perform();
        BrowserUtils.waitForElementClickable(changeFilterPage.jacketMenu).click();

    }

    @And("User from Shopping Options panel click on Color dropdown")
    public void userFromShoppingOptionsPanelClickOnColorDropdownAndChooseOneOfTheColors() {
        BrowserUtils.waitForElementClickable(changeFilterPage.colorDropdown).click();


    }
    @And("User choose one of the colors")
    public void userChooseOneOfTheColors() {
        changeFilterPage.redColor.click();

    }

    @Then("User check that all the displayed products have the selected color bordered in red.")
    public void userCheckThatAllTheDisplayedProductsHaveTheSelectedColorBorderedInRed() {

        BrowserUtils.waitFor(3);

       // String actualResult= changeFilterPage.redColor.getText();
      String redColorTrue= changeFilterPage.borderInRed.getAttribute("option-label");

     if(changeFilterPage.borderInRed.isSelected()){
         assertEquals(redColorTrue, "Red");
     }
        System.out.println("All displayed products have the selected color in red");


    }

    @And("User click on Price dropdown")
    public void userClickOnPriceDropdownAndSelectTheFirstOptionThatIsDisplayed() {
        BrowserUtils.waitForElementClickable(changeFilterPage.priceDropDown).click();


    }
    @And("User select the first option that is displayed")
    public void userSelectTheFirstOptionThatIsDisplayed() {
        changeFilterPage.firstPrice.click();

    }

    @And("User check that only two product are displayed on the page.")
    public void userCheckThatOnlyTwoProductAreDisplayedOnThePage() {
        assertTrue(changeFilterPage.firstItem.isDisplayed());
        assertTrue(changeFilterPage.secondItem.isDisplayed());
    }

    @Then("User for each product displayed ,check that the price matches the defined criteria.")
    public void userForEachProductDisplayedCheckThatThePriceMatchesTheDefinedCriteria() {


         for (WebElement eachprice : changeFilterPage.priceOfItem) {
            if (Double.parseDouble(eachprice.getText().replace("$","")) > 59.99 && Double.parseDouble(eachprice.getText().replace("$","")) < 50.00) {
                Assert.fail("Prices does not matches the defined criteria");
            }else{
                System.out.println("Price matches the defined criteria");
            }
        }

    }


    @When("User remove price filter")
    public void userRemovePriceFilter() {
        changeFilterPage.priceRemoveFilter.click();

    }

    @And("User Check the items number displayed is increased")
    public void userCheckTheItemsNumberDisplayedIsIncreased() {

        assertTrue(changeFilterPage.item5.isDisplayed());
    }


    @And("User add the two first item in the wish List.")
    public void userAddTheTwoFirstItemInTheWishList() {

        action.moveToElement(changeFilterPage.firstItem).perform();

        BrowserUtils.waitForElementClickable(changeFilterPage.addWishList).click();
        assertTrue(changeFilterPage.successfulMessage1.isDisplayed());

        changeFilterPage.clickHereLink.click();

        action.moveToElement(changeFilterPage.secondProduct).perform();
        BrowserUtils.waitFor(5);
        changeFilterPage.addWishList2.click();

    }

    @And("User check successful message.")
    public void userCheckSuccessfulMessage() {
        assertTrue(changeFilterPage.successfulMessage2.isDisplayed());
    }

    @Then("User click on User Profile, and check the correct number of items is displayed")
    public void userClickOnUserProfileAndCheckTheCorrectNumberOfItemsIsDisplayed() {


        changeFilterPage.myAccountButton.click();

        assertTrue(changeFilterPage.myWishList2ItemDisplayed.isDisplayed());
    }



    @When("User Add all displayed items to the Shopping Cart")
    public void userAddAllDisplayedItemsToTheShoppingCart() {

        action.moveToElement(changeFilterPage.firstItem).perform();
        changeFilterPage.xsSize.click();
        BrowserUtils.waitForElementClickable(changeFilterPage.addToCard1).click();


        action.moveToElement(changeFilterPage.secondItem).perform();
        changeFilterPage.xsSize2.click();
        BrowserUtils.waitFor(5);
        changeFilterPage.addToCard2.click();

    }

    @Then("User Check successful message")
    public void userCheckSuccessfulMessageTextIcon() {
        BrowserUtils.waitFor(5);
        changeFilterPage.doneMessage.isDisplayed();

    }

    @And("User Open the Shopping Cart")
    public void userOpenTheShoppingCart() {
        BrowserUtils.waitFor(5);
        action.moveToElement(changeFilterPage.shoppingLink).perform();
        BrowserUtils.waitForElementClickable(changeFilterPage.shoppingLink).click();
    }

    @And("User verify that we have navigated to Shopping Cart Page")
    public void userVerifyThatWeHaveNavigatedToShoppingCartPage() {

       assertTrue(changeFilterPage.shoppingCartName.isDisplayed());
        System.out.println("We are at Shopping Cart Page");

    }

    @Then("User verify that the prices sum for all items is equal to Order Total price in the Summary section")
    public void userVerifyThatThePricesSumForAllItemsIsEqualToOrderTotalPriceInTheSummarySection() {

        String expectedResult = changeFilterPage.subTotalPrice.getText();
        String actualResult = changeFilterPage.summaryTotalPrice.getText();

        assertEquals(expectedResult, actualResult);
    }

    @When("User delete the first item on shopping cart")
    public void userDeleteTheFirstItemOnShoppingCart() {


        Driver.getDriver().get(ConfigurationReader.getProperty("shoppingCARD"));

        action.moveToElement(changeFilterPage.firstItem).perform();
        changeFilterPage.xsSize.click();
       BrowserUtils.waitForElementClickable(changeFilterPage.addToCard1).click();

        action.moveToElement(changeFilterPage.secondItem).perform();
       changeFilterPage.xsSize2.click();
        BrowserUtils.waitForElementClickable(changeFilterPage.addToCard2).click();

       action.moveToElement(changeFilterPage.shoppingLink).perform();
       BrowserUtils.waitForElementClickable(changeFilterPage.shoppingLink).click();


        BrowserUtils.waitForElementClickable(changeFilterPage.removeItem1).click();
    }

    @Then("User Verify that the number of elements in Shopping Cart table is decreased by one")
    public void userVerifyThatTheNumberOfElementsInShoppingCartTableIsDecreasedByOne() {

       String expectedResult="";
       String actualResult=changeFilterPage.itemInBag.getText();
        assertEquals(expectedResult, actualResult);

        System.out.println("Number of items is decreased by 1");
    }


    @And("User repeat steps one and two until the last item is deleted.")
    public void userRepeatStepsOneAndTwoUntilTheLastItemIsDeleted() {

     BrowserUtils.waitForElementClickable(changeFilterPage.removeItem2).click();

    }

    @And("User verify that Shopping Cart is empty and check message {string} is displayed")
    public void userVerifyThatShoppingCartIsEmptyAndCheckMessageIsDisplayed(String arg0) {

       String expectedResult="You have no items in your shopping cart.";
       String actualResult=changeFilterPage.emptyMessage.getText();

       assertEquals(expectedResult,actualResult);

        assertTrue(changeFilterPage.emptyMessage.isDisplayed());
    }


    @Then("User close the browser")
    public void closeTheBrowser() {

    }





}



