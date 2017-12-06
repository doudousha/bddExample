package com.wangqing;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class ScenarioOutLineExampleTest {

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\用户目录\\下载\\chromedriver_win32\\chromedriver.exe");
        Configuration.timeout = 10000;
        //   Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.pollingInterval = 1000;
        Configuration.browser = "chrome";
    }

    @Given("^我访问 Wikipedia homepage$")
    public void goToWikiPage() {
        open("http://en.wikipedia.org/wiki/Main_Page");
    }
    @When("^我在名为\"([^\"]*)\"的文本框输入\"([^\"]*)\"$")
    public void enterValueOnFieldByName( String fieldName,String value ){
        System.out.println(value+" , " + fieldName);
        $(By.name(fieldName)).setValue(value);
    }
    @When("^我点击了按钮\"([^\"]*)\"$")
    public void clickButonByName(String buttonName){

        $(By.name(buttonName)).click();
    }
    @Then("^页面title包含\"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        assertThat(title(), containsString(title));
    }
}
