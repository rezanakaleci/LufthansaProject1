package com.lufthansa.magento.step_definition;

import com.lufthansa.magento.page.BasePage;
import com.lufthansa.magento.utilities.ConfigurationReader;
import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


    public class Hooks {

        @Before
        public void setupScenario(Scenario scenario){

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



        // @AfterStep
        public void afterStep(Scenario scenario){

        }

    }

