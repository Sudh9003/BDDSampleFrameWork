package stepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import exceptions.AutomationFrameworkException;
import helper.TestContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;


public class Hooks {

    TestContext testContext;


    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void beforeScenario(Scenario scenario){


    }

    //To take the screenshot on test failure.
    @After(order = 1)
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            try {
                byte[] data =((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(data,"image/png");

            } catch (Exception e) {
                throw new AutomationFrameworkException(e.getMessage());
            }

        }
       }

    //Close the driver instance.
    @After(order = 0)
    public void AfterSteps() {
        testContext.getWebDriverManager().closeDriver();
    }
}