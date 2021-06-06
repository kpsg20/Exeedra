package Project11.Pages;

import Project11.DriverManager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager
{
    public static String uname;
    public static String pass;
    static String message;

    @FindBy(id="email")
    WebElement login;
    @FindBy(id="password")
    WebElement password1;
    @FindBy(id="loginSubmit")
    WebElement signin;
    @FindBy(xpath = "//div[@class='message___KBBR8")
    WebElement error_Message;
    @FindBy(xpath = "//a[@class='link___q7m95']")
    WebElement myaccount;
    @FindBy(xpath = "//div[@class='content___2Ciw2']/div/div/div/div[1]")
    WebElement errormessage;
    @FindBy(xpath = "//button[contains(text(),'Sign out')]")
    WebElement signoutbutton;

    public void setLogin(String username)
    {
        uname=username;
        login.sendKeys(username);
    }
    public void setPassword(String password)
    {
        pass=password;
        password1.sendKeys(password);
    }
    public void assertloginfunction(String status)
    {
        if(status.equalsIgnoreCase("valid"))
        {
            message=myaccount.getText();
            Assert.assertTrue(message.contains("MY"));
            signoutbutton.click();



        }
        else
        {
            message=errormessage.getText();
            Assert.assertTrue(message.contains("Please check your email and password"));


        }}
    public void setSignin()
    {
        sleep(2000);
        signin.click();
        sleep(3000);

    }

    public String getCurrentUrL ()
    {
        return driver.getCurrentUrl();
    }
    public void setError_Message()
    {

        String Actual_error=error_Message.getText();

    }

}
