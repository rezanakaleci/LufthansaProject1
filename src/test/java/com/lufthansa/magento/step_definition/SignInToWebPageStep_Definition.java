package com.lufthansa.magento.step_definition;

import com.lufthansa.magento.page.BasePage;
import com.lufthansa.magento.page.CreatingAccountPage;
import com.lufthansa.magento.utilities.BrowserUtils;
import com.lufthansa.magento.utilities.ConfigurationReader;
import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SignInToWebPageStep_Definition {

    BasePage basePage = new BasePage();

    @Given("User Navigate to Web Page")
    public void userNavigateToWebPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @Then("User Click on sign in link")
    public void userClickOnSignInLink() {
        basePage.SignIn.click();

    }

    @Given("User login with the credentials, email {string} and password {string}")
    public void userLoginWithTheCredentialsEmailAndPassword(String Email, String Password) {

        basePage.Email.sendKeys(Email);
        basePage.Password.sendKeys(Password);
        basePage.SigInButton.click();
    }


    @And("User check your username is displayed on right corner of the page.")
    public void useCheckYourUsernameIsDisplayedOnRightCornerOfThePage() {

        BrowserUtils.sleep(5);
        Assert.assertTrue(basePage.WelcomeMessage.isDisplayed());

    }



}






