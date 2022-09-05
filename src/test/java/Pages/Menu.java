package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Menu {
    WebDriver driver;
    By admin= new By.ByLinkText("Admin");
    public Menu(WebDriver driver){
        this.driver=driver;
    }
    public void menu(){
        driver.findElement(admin).click();
    }
}