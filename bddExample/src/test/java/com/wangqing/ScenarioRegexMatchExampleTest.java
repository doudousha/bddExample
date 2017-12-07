package com.wangqing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioRegexMatchExampleTest {

    @Given("^如果我给了你一个测试的hello$")
    public void 如果我给了你一个测试的hello() throws Throwable {
        System.out.println("如果我给了你一个测试的hello");
    }

    @When("^当我执行greet的时候$")
    public void 当我执行greet的时候() throws Throwable {
        System.out.println("当我执行greet的时候");
    }

    @Then("^我应该看到Hello [a-zA-Z]{1,}$")
    public void 我应该看到() throws Throwable {
        System.out.println("我应该看到Hello Cucumber");
    }
}
