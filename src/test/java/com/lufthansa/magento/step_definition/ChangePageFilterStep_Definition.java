package com.lufthansa.magento.step_definition;

import com.lufthansa.magento.page.BasePage;
import com.lufthansa.magento.page.ChangeFilterPage;
import com.lufthansa.magento.page.CreatingAccountPage;
import com.lufthansa.magento.utilities.BrowserUtils;
import com.lufthansa.magento.utilities.ConfigurationReader;
import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ChangePageFilterStep_Definition {

    ChangeFilterPage changeFilterPage = new ChangeFilterPage();
    Actions action = new Actions(Driver.getDriver());


    @When("On store menu click on Women dropdown.")
    public void onStoreMenuClickOnWomenDropdown() {

      action.moveToElement(changeFilterPage.WomenDropDown);

    }

    @Then("Hover over Tops dropdown on the open pop up and click on Jacket menu option.")
    public void hover_over_tops_dropdown_on_the_open_pop_up_and_click_on_jacket_menu_option() {

        action.moveToElement(changeFilterPage.TopsDropDown).perform();
        action.moveToElement(changeFilterPage.JacketMenu).perform();
        BrowserUtils.waitForElementClickable(changeFilterPage.JacketMenu).click();

    }

    @Then("From Shopping Options panel click on Color dropdown and choose one of the colors.")
    public void from_shopping_options_panel_click_on_color_dropdown_and_choose_one_of_the_colors() {

        BrowserUtils.waitForElementClickable(changeFilterPage.ColorDropdown).click();
        changeFilterPage.RedColor.click();

    }

    @Then("Check that all the displayed products have the selected color bordered in red.")
    public void check_that_all_the_displayed_products_have_the_selected_color_bordered_in_red() {

        String expectedResult = changeFilterPage.FirstItem.getAttribute("border");
        String actualResult = changeFilterPage.SecondItem.getAttribute("border");

        assertEquals(expectedResult, actualResult);

    }

    @And("Click on Price dropdown and select the first option {string} and check that only two product are displayed on the page.")
    public void clickOnPriceDropdownAndSelectTheFirstOptionAndCheckThatOnlyTwoProductAreDisplayedOnThePage(String FirstPrice) {

        BrowserUtils.waitForElementClickable(changeFilterPage.PriceDropDown).click();
        changeFilterPage.FirstPrice.click();

        assertTrue(changeFilterPage.FirstItem.isDisplayed());
        assertTrue(changeFilterPage.SecondItem.isDisplayed());
    }

    @Then("For each product displayed ,check that the price matches the defined criteria.")
    public void for_each_product_displayed_check_that_the_price_matches_the_defined_criteria() {
           double Price1=59.00;    //50.00   //59.99
           double Price2=57.00;        //59.00       //57.00
           if(Price1 > 50.00) {
               assertTrue(changeFilterPage.PriceOfFirstItem.isDisplayed());
           }else if(Price2 < 59.00) {

               assertTrue(changeFilterPage.PriceOfSecondItem.isDisplayed());
           }
        System.out.println("Price matches the defined criteria");
    }

    @And("Remove Price filter")
    public void remove_price_filter(){

        Driver.getDriver().get(ConfigurationReader.getProperty("RemovedFilter"));

    }

    @Then("Check the items number displayed is increased")
    public void check_the_items_number_displayed_is_increased() {

        assertTrue(changeFilterPage.Item5.isDisplayed());
    }


    @Then("Add the two first item in the Wish List.")
    public void add_the_two_first_item_in_the_wish_list() {

        action.moveToElement(changeFilterPage.FirstItem).perform();

        BrowserUtils.waitForElementClickable(changeFilterPage.AddWishList).click();
        assertTrue(changeFilterPage.SuccessfulMessage1.isDisplayed());

        changeFilterPage.ClickHereLink.click();

        action.moveToElement(changeFilterPage.SecondProduct).perform();
        BrowserUtils.waitFor(5);
        changeFilterPage.AddWishList2.click();

    }

    @Then("Check successful message.")
    public void check_successful_message_text_icon() {
        assertTrue(changeFilterPage.SuccessfulMessage2.isDisplayed());
    }

    @Then("Click on User Profile, and check the correct number of items is displayed")
    public void click_on_user_profile_and_check_the_correct_number_of_items_is_displayed() {

        changeFilterPage.MyAccountButton.click();

        assertTrue(changeFilterPage.MyWishList2ItemDisplayed.isDisplayed());
    }


    @When("User Add all displayed items to the Shopping Cart")
    public void userAddAllDisplayedItemsToTheShoppingCart() {

        action.moveToElement(changeFilterPage.FirstItem).perform();
        changeFilterPage.XsSize.click();
        BrowserUtils.waitForElementClickable(changeFilterPage.AddToCard).click();


        action.moveToElement(changeFilterPage.SecondItem).perform();
        changeFilterPage.XsSize2.click();
        BrowserUtils.waitFor(5);
        changeFilterPage.AddToCard2.click();

    }

    @Then("User Check successful message")
    public void userCheckSuccessfulMessageTextIcon() {
        BrowserUtils.waitFor(5);
        changeFilterPage.DoneMessage.isDisplayed();

    }

    @And("User Open the Shopping Cart")
    public void userOpenTheShoppingCart() {
        BrowserUtils.waitFor(5);
        action.moveToElement(changeFilterPage.ShoppingLink).perform();
        BrowserUtils.waitForElementClickable(changeFilterPage.ShoppingLink).click();
    }

    @And("Verify that we have navigated to Shopping Cart Page")
    public void verifyThatWeHaveNavigatedToShoppingCartPage() {

       assertTrue(changeFilterPage.ShoppingCartName.isDisplayed());
        System.out.println("We are at Shopping Cart Page");

    }

    @Then("Verify that the prices sum for all items is equal to Order Total price in the Summary section")
    public void verifyThatThePricesSumForAllItemsIsEqualToOrderTotalPriceInTheSummarySection() {

        String expectedResult = changeFilterPage.SubTotalPrice.getText();
        String actualResult = changeFilterPage.SummaryTotalPrice.getText();

        assertEquals(expectedResult, actualResult);
    }

    @When("Delete the first item on shopping cart")
    public void deleteTheFirstItemOnShoppingCart() {

        Driver.getDriver().get(ConfigurationReader.getProperty("shoppingCARD"));

        action.moveToElement(changeFilterPage.FirstItem).perform();
        changeFilterPage.XsSize.click();
       BrowserUtils.waitForElementClickable(changeFilterPage.AddToCard).click();

        action.moveToElement(changeFilterPage.SecondItem).perform();
       changeFilterPage.XsSize2.click();
        BrowserUtils.waitForElementClickable(changeFilterPage.AddToCard2).click();

       action.moveToElement(changeFilterPage.ShoppingLink).perform();
       BrowserUtils.waitForElementClickable(changeFilterPage.ShoppingLink).click();


        BrowserUtils.waitForElementClickable(changeFilterPage.RemoveItem1).click();
    }


    @Then("Verify that the number of elements in Shopping Cart table is decreased by {string}")
    public void verifyThatTheNumberOfElementsInShoppingCartTableIsDecreasedBy(String numberDecreased) {

       changeFilterPage.NumberBox.isDisplayed();
    }

    @And("Repeat steps one and two until the last item is deleted.")
    public void repeatStepsOneAndTwoUntilTheLastItemIsDeleted() {

     BrowserUtils.waitForElementClickable(changeFilterPage.RemoveItem2).click();

    }

    @And("Verify that Shopping Cart is empty and check message {string} is displayed")
    public void verifyThatShoppingCartIsEmptyAndCheckMessageIsDisplayed(String message) {
       String expectedResult="You have no items in your shopping cart.";
       String actualResult=changeFilterPage.EmptyMessage.getText();
       assertEquals(expectedResult,actualResult);
        assertTrue(changeFilterPage.EmptyMessage.isDisplayed());
    }


    @Then("Close the browser")
    public void closeTheBrowser() {

        Driver.getDriver().close();

    }


    }



