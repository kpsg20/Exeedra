package Project11.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager
{
       public static WebDriver driver;
        //  public static String browser="chrome";

        public DriverManager()

        {
            PageFactory.initElements(driver,this);
        }

        public void openbrowser(String browser) {
            switch (browser) {
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                default:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

            }
        }

        public void maxBrowser() {
            driver.manage().window().maximize();

        }

        public void navigateto(String url)
        {
            driver.navigate().to(url);
        }


        public void sleep(int ms) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void applyImplicit() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void closebrowser()
        {
            sleep(3000);
            driver.quit();
        }
    }


