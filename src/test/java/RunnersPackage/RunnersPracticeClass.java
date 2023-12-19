package RunnersPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="F:\\Cucumber_practice\\FeatureFiles", glue = "StepDefinitionPackage",
 plugin = {"pretty","junit:Reports/ff.xml"}, tags= "@smoke")
public class RunnersPracticeClass {
	
}
