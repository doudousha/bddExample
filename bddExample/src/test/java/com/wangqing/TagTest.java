package com.wangqing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagTest {

    @Given("^Go to baidu home$")
    public void go_to_baidu_home() throws Throwable {

    }

    @When("^I find baidu logo$")
    public void i_find_baidu_logo() throws Throwable {

    }

    @When("^Type the search text \"([^\"]*)\"$")
    public void type_the_search_text(String arg1) throws Throwable {
    }

    @When("^Click the submit$")
    public void click_the_submit() throws Throwable {
    }

    @Then("^Wait the query result$")
    public void wait_the_query_result() throws Throwable {
    }



    @Given("^Go to google home$")
    public void go_to_google_home() throws Throwable {
    }

    @When("^I find google logo$")
    public void i_find_google_logo() throws Throwable {
    }
}
