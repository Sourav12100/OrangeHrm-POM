package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.RandomAccess;

public class AddUserDetails
{
    WebDriver driver;
    By UserRole = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");

    By adminBtn =By.xpath(("//*[contains(text(),'Admin')]"));

    By dropDown = By.xpath("(//div[@class='oxd-select-text-input'])[2]");

    By Status = By.xpath("//*[contains(text(),'Enabled')]");

    By Password = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");

    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");

    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");


    By confirmPassword =By.xpath("(//input[@type='password'])[2]");

    By Save = By.xpath("(//button[@type='submit'])");


    public AddUserDetails (WebDriver driver){
        this.driver =driver;

    }
    public void User() throws InterruptedException{

        driver.findElement(By.className("oxd-select-text-input")).click();
        driver.findElement(adminBtn).click();
        driver.findElement(dropDown).click();
        driver.findElement(Status).click();
        driver.findElement(Password).sendKeys("Admin123#");
        driver.findElement(employeeName).sendKeys("Lisa");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'Lisa')]")).click();
        driver.findElement(userName).sendKeys("qazws");
        driver.findElement(confirmPassword).sendKeys("Admin123#");
        Thread.sleep(3000);
        driver.findElement(Save).click();
        Thread.sleep(6000);
    }

}
