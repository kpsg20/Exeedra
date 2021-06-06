package Project11.Step_Def;

import Project11.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sun.rmi.runtime.NewThreadAction;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class LoginStepDef
{
    LoginPage loginPage= new LoginPage();


    @Given("user is on a Home Page")
    public void user_is_on_a_home_page() {

        loginPage.setCookiesbutton();
        String Actual=loginPage.getCurrentUrL();
        assertThat(Actual,is(equalToIgnoringCase("https://www.waitrose.com/")));

    }


    @When("user click on signin link")
    public void user_click_on_signin_link()
    {
        loginPage.setSigninbutton();
    }
    }





