package com.wangqing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterizationExampleTest {
    @Given("^访问系统登录页$")
    public void 访问系统登录页() throws Throwable {

    }

    @Given("^输入用户名\"([^\"]*)\"和密码\"([^\"]*)\"$")
    public void 输入用户名_和密码(String userName, String password) throws Throwable {

        System.out.println("userName: " + userName);
        System.out.println("password: " + password);

    }

    @When("^点击登录$")
    public void 点击登录() throws Throwable {

    }

    @Then("^登录成功$")
    public void 登录成功() throws Throwable {

    }

}
