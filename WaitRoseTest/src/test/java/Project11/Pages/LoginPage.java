package Project11.Pages;

import Project11.DriverManager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends DriverManager
{



    @FindBy(xpath="//div[@class='acceptCookieCTA___NwqHh']/button[1]")
    WebElement cookiesbutton;
    @FindBy(xpath = "//a[@class='signIn___36VsE'][1]")
    WebElement signinbutton;


       public void setCookiesbutton()
    {
        cookiesbutton.click();

    }
    public void setSigninbutton()

    {
        signinbutton.click();
    }

    public String getCurrentUrL ()
    {
        return driver.getCurrentUrl();
    }

}

