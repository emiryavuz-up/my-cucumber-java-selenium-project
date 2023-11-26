package com.demoblaze.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                plugin = {
                  "html:target/cucumber-report.html",
                  "rerun:target/rerun.txt",
                  "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                },
                features = "src/test/resources/features",
                dryRun = false,
                glue = "com/demoblaze/library/step_definitions",
                tags = "@login"

)
public class RunnerClass {
}
