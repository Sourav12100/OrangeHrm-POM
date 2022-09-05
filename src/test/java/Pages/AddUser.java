package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddUser {

    WebDriver driver;
    By adduser = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public AddUser(WebDriver driver) {
        this.driver = driver;
    }

    public void start() {
        driver.findElement(adduser).click();

    }
}
