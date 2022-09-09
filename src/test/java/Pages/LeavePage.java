package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeavePage {
    WebDriver driver;
    WebDriverWait wait;
    By Leave = By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]");
    By apply = By.xpath("//a[contains(text(),'Apply')]");
    By Select = By.xpath("(//div[@class='oxd-select-text-input'])");
    By leaveTypeDropdown = By.xpath("//div[contains(@class, 'oxd-select-text-input') and contains(@tabindex,'0')]");
    By FromDate = By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]");
    By Comment = By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])");
    By ApplyBtn = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])");
    By Callings =By.xpath("(//*[@class='oxd-userdropdown-name'])");
    By Logout = By.xpath("(//a[@class='oxd-userdropdown-link'])[4]");
    public LeavePage (WebDriver driver){
       this.driver = driver;
       wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void LeaveVerification () {
        driver.findElement(Leave).click();
        driver.findElement(apply).click();
        driver.findElement(Select).click();
        wait.until(ExpectedConditions.elementToBeClickable(leaveTypeDropdown));
        driver.findElement(leaveTypeDropdown).click();
        driver.findElement(FromDate).sendKeys("2022-09-08");
        wait.until(ExpectedConditions.elementToBeClickable(Comment));
        driver.findElement(Comment).sendKeys("Leave for 3 days");
        driver.findElement(ApplyBtn).click();
        driver.findElement(Callings).click();
        driver.findElement(Logout).click();
    }
}
