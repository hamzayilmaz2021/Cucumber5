package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports.html"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "@smoke",
        dryRun = false // testi çalıştırma sadece herhangi bir step eksik mi ona bak
)

public class Runner {

}