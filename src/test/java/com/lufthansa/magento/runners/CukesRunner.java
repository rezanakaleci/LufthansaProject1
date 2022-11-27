package com.lufthansa.magento.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features="src/test/resources/Features",
        glue= "com/lufthansa/magento/step_definition",
        dryRun =false,
        tags = "@smoke"
)
public class CukesRunner {


}
