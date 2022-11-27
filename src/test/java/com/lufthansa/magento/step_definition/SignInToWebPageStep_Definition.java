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

    CreatingAccountPage lumaApplicationPage = new CreatingAccountPage();
    BasePage basePage = new BasePage();

    @Then("User Click on Sign In link")
    public void user_click_on_sign_in_link() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.SignIn.click();

    }

    @Given("User login with the credentials, email {string} and {string}")
    public void userLoginWithTheCredentialsEmailAnd(String Email, String Password) {

        basePage.Email.sendKeys(Email);
        basePage.Password.sendKeys(Password);
        basePage.SigInButton.click();

    }


    @And("User check your username is displayed on right corner of the page.")
    public void useCheckYourUsernameIsDisplayedOnRightCornerOfThePage() {
        // String expectedTitle="Welcome, Sergita Kaleci!";
        BrowserUtils.sleep(5);
        Assert.assertTrue(basePage.WelcomeMessage.isDisplayed());

    }
}





