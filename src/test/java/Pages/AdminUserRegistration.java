package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUserRegistration {
   WebDriver driver;

   By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

   By userRole = By.xpath("//*[contains(text(),'Admin')]");

   By employeeName = By.xpath("//input[@placeholder='Type for hints...']");

   By Status = By.xpath("( //*[contains(text(),'Enabled')])");

   public AdminUserRegistration (WebDriver driver) {
      this.driver = driver;
   }
    public void UserVerification(){

      driver.findElement(userName).sendKeys("qeadz ");
      driver.findElement(userRole).click();
      driver.findElement(employeeName).sendKeys("Lisa");
      driver.findElement(Status).click();
    }

}
