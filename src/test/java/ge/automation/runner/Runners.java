package ge.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
        @CucumberOptions(
                features = "src/test/resources/Feature",
                glue = "ge.automation.stepDefinitions",
                plugin = {"pretty", "html:target/cucumber-reports.html"}
        )
        public class Runners extends AbstractTestNGCucumberTests{

        }