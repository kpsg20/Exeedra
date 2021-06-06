package Project11.Step_Def;

import Project11.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef
{
    HomePage homePage=new HomePage();

    @When("enters  {string} and {string}")
    public void enters_and(String username, String password)
    {
        homePage.setLogin(username);
        homePage.setPassword(password);


    }


    @And("user click on signin button")
    public void user_click_on_signin_button()
    {
        homePage.setSignin();

    }

    @Then("user can check login {string}")
    public void user_can_check_login(String status)
    {
        System.out.println(status);
        homePage.assertloginfunction(status);
    }

}
