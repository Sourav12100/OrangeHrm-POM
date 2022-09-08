package Test;

import Pages.AddUser;
import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;

//@BeforeClass
//    public static void setup(){
//        driver=new ChromeDriver();
//        System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        pageFactory=new PageFactory(driver);
//
//    }
    @Parameters("browserName")
    @BeforeClass
    public static void setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
           driver = WebDriverManager.chromedriver().create();
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);
        }

    }
}
