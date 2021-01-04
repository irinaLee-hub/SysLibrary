package com.sys_Library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "rerun:target/rerun.txt",
        "html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "com/sys_Library/step_definitions",
        dryRun = false,
        tags = ""


)
public class CukesRunner {
}
