package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Sayee\\IdeaProjects\\Batch6Cucumber\\src\\test\\java\\features\\DropDown.feature"}, glue = {"stepDefination"},

        // plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
        // "junit:target/cucumber-reports/Cucumber.xml"},

       plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //        monochrome = true
     publish = true

)

/*
Cucumber options is an annotation it takes two parameters. one is feature location another is step def location
if we have 100 feature file in a package .. give path only upto package level like
src/test/java/features or if we want to run specific file we give
src/test/java/features/Login.feature

 */




public class RunnerClass {
}
