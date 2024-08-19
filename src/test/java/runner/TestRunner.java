package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/subirArchivo.feature",
glue = "stepDefinition")
public class TestRunner extends AbstractTestNGCucumberTests {

}
