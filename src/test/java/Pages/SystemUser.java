package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SystemUser {
    WebDriver driver;
    By Add= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
    public SystemUser(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Click()
    {
        driver.findElement(By.className("oxd-input oxd-input--active")).click();
    }
}
