package Test;

import Pages.AddUser;
import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

    static WebDriver driver;
    protected static PageFactory pageFactory;

@BeforeClass
    public static void setup(){
        driver=new ChromeDriver();
        System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pageFactory=new PageFactory(driver);

    }
    @AfterClass

    public void close(){
        driver.close();
    }
}
