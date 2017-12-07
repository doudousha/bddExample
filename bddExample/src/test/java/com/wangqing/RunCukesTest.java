package com.wangqing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resourse/"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"com.wangqing"},
        tags ="@Search"
)
public class RunCukesTest {

}
