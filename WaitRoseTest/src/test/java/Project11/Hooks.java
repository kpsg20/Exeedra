package Project11;

import Project11.DriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks

{
    DriverManager driverManager= new DriverManager();

    @Before
    public void setup()
    {
        driverManager.openbrowser("chrome");
        driverManager.navigateto("https://www.waitrose.com");
        driverManager.maxBrowser();
        driverManager.applyImplicit();
        driverManager.sleep(3000);
    }
    @After
    public void close()
    {
        driverManager.closebrowser();
    }



}
