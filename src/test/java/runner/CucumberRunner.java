package runner;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//This is used to execute the feature files.
@RunWith(Cucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "reports/CucumberTestReport.json",
        threadsCountValue = "1",
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "reports/cucumber-usage.json",
        excludeCoverageTags = {"@WIP"},
        includeCoverageTags = {"@passed"},
        outputFolder = "reports/",
        screenShotSize = "75%",
        screenShotLocation = "screenshots/"
)

@CucumberOptions(
        features =  {
                "src/test/resources/features/ColumnVerification.feature",
        },
        strict = true,
        monochrome = true,
        tags =      { "@Smoke or @Regression"},
        plugin =    {
                "pretty", "html:reports/cucumber-html-report",
                "json:reports/CucumberTestReport.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:reports/rerun.txt"},
        glue = {"stepDefinations"}
)
public class CucumberRunner {

}

//From command line
//mvn clean verify -Dcucumber.options="--tags @CheckTest"