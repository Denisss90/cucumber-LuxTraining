package com.luxoft;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/luxoft/features/",
        glue = "com.luxoft.steps",
        dryRun = false,
//        tags = "@lucy or @outline",
        tags = "@shout and not @lucy",
        monochrome = false,
        //name= {"^Lucy|bull.*"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty.html"}
)

public class RunTest {
}
