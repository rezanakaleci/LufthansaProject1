package com.lufthansa.magento.step_definition;

import com.lufthansa.magento.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

    /*
    In the class we will be able to pass pre -& post-conditions to each scenario
    and each step
 */
    public class Hooks {

        @Before
        public void setupScenario(){
            System.out.println("===Setting up browser using cucumber @Before");
        }

        @Before("@login")
        public void setupScenarioForLogin(){
            System.out.println("===This will only apply scenarios with @logins");
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
        public void setupStep(){
            System.out.println("-------------> applying setup using @BeforeStep");
        }

        // @AfterStep
        public void afterStep(){
            System.out.println("------> applying tearDown using @AfterStep");
        }

    }

