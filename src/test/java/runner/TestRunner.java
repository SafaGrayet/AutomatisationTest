package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/AlimentationVariable"}, glue ="Steps" )
public class TestRunner extends AbstractTestNGCucumberTests {



}
