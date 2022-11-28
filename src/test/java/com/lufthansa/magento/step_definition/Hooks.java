package com.lufthansa.magento.step_definition;

import com.lufthansa.magento.page.BasePage;
import com.lufthansa.magento.utilities.ConfigurationReader;
import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


    public class Hooks {
        BasePage basePage=new BasePage();

        @Before
        public void setupScenario(Scenario scenario){
            System.out.println("User navigate to Luma application");
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            basePage.SignIn.click();

        }

        @Before("@login")
        public void setupScenarioForLogin(Scenario scenario){
            if(scenario.isFailed()) {
                System.out.println("User can not log in");
            }else{
                System.out.println("User is on luma WebPage!");
            }

        }

        @After
        public void teardownScenario(Scenario scenario){
            //if the scenario is failed with method turns true boolean value
            if(scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/pmg", scenario.getName());
            }

            Driver.closeDriver();
            }



        // @BeforeStep
        public void setupStep(Scenario scenario){
            if(scenario.isFailed()) {
                System.out.println("Next steps can not be performed!");
            }

            }

        // @AfterStep
        public void afterStep(Scenario scenario){
            if(scenario.isFailed()) {
                System.out.println("Scenarios couldn't be performed!");
            }

        }

    }

