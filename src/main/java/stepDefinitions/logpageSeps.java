package stepDefinitions;
import Pages.loginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class logpageSeps {


    @Given("user is on OrangeHRM login page")
    public void userIsOnOrangeHRMLoginPage() throws IOException, InterruptedException {
        loginPage.sitenavigation();

    }

    @When("user enters OrangeHRM login credentials")
    public void userEntersOrangeHRMLoginCredentials(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class); // Convert DataTable to a list of maps
        for (Map<String, String> row : credentials) {
            String username = row.get("username");
            String password = row.get("password");
            loginPage.loginpage(username, password);
        }
    }


    @Then("login result should be validated")
    public void loginResultShouldBeValidated() {
        loginPage.homePageNavigation();
    }

    @And("page logout should be performed for successful login")
    public void pageLogoutShouldBePerformedForSuccessfulLogin() {
        loginPage.logout();




    }
}
