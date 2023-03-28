package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports",
                "rerun:target/failed.txt",
                "timeline:test-output-thread/",

        },
        features = "src/test/resources/UI_Features",
        glue = "stepdefinitions",
        tags = "us001",
        dryRun = false
)
public class runner1 {
}
