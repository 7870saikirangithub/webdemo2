package runners;


import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
				features = {"src/test/resources/verify_add_to_cart.feature"},
				glue = "StepDefination"
				)

@Listeners(utility.TestListener.class)

public class TestRunner extends AbstractTestNGCucumberTests{

}

