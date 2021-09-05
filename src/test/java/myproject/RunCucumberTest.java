package myproject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
//@CucumberOptions(features="Features",glue={"myproject"})
public class RunCucumberTest {

}
