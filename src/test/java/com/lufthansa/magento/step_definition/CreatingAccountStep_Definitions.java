package com.lufthansa.magento.step_definition;

import com.github.javafaker.Faker;
import com.lufthansa.magento.page.CreatingAccountPage;
import com.lufthansa.magento.utilities.BrowserUtils;
import com.lufthansa.magento.utilities.ConfigurationReader;
import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class CreatingAccountStep_Definitions {

    CreatingAccountPage creatingAccountPage =new CreatingAccountPage();

    Faker faker= new Faker();
    String name= faker.name().firstName();
    String lastname=faker.name().lastName();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Navigate to {string}")
    public void navigate_to(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("Click Create an Account link")
    public void click_create_an_account_link() {
      creatingAccountPage.creatAccountLink.click();

    }
    @Then("Check tittle of the open page")
    public void check_tittle_of_the_open_page() {
        String expectedInURL= "account/create/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }
    @And("Fill in form fields")
    public void fillInFormFields() {
        String EmailName= name + "12" +"@gmail.com";
        String Password=lastname +"@21?";
        String ConfirmPassword=lastname+ "@21?";

        BrowserUtils.sleep(2);
       creatingAccountPage.FirstName.sendKeys(name);
       creatingAccountPage.LastName.sendKeys(lastname);
        BrowserUtils.sleep(2);
       creatingAccountPage.SigInUpForNewLetter.click();
       creatingAccountPage.EmailBox.sendKeys(EmailName);
       creatingAccountPage.PasswordBox.sendKeys(Password);
       creatingAccountPage.ConfirmPassword.sendKeys(ConfirmPassword);
    }
    @Then("Click Create an Account button")
    public void click_create_an_account_button() {
        BrowserUtils.sleep(2);
        creatingAccountPage.CreatAccountButton.click();

    }
    @Then("Check successful message is displayed on the screen")
    public void check_successful_message_is_displayed_on_the_screen() {
        BrowserUtils.sleep(2);
     Assert.assertTrue(creatingAccountPage.MessageDisplaied.isDisplayed());


    }
    @Then("Click on User profile and Sign out")
    public void click_on_user_profile_and_sign_out() {
        BrowserUtils.waitForElementClickable(creatingAccountPage.UserProfile).click();

        BrowserUtils.waitForElementClickable(creatingAccountPage.SignOut).click();

    }



}
