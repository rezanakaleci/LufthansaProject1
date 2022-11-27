package com.lufthansa.magento.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class FailedRunner {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = "com/lufthansa/magento/step_definitions",
            features = "@target/rerun.txt"
    )
    public class FailedTestRunner {

    }
}
