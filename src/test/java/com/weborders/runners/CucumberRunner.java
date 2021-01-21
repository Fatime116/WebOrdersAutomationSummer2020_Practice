package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//RunWith from Junit
@CucumberOptions(// we need to have our settings

        glue="com/weborders/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        publish = true

)
public class CucumberRunner {
}
