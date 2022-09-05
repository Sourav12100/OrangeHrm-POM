package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.print.DocFlavor;

public class LoginPage {
    WebDriver driver ;
   By userName = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");

   By password = By.name("password");

   By submit =By.xpath("//button");

   public LoginPage(WebDriver driver) {
       this.driver=driver;
   }
   public void login() throws InterruptedException {
       driver.manage().window().maximize();
       Thread.sleep(5000);
       driver.findElement(userName).sendKeys("Admin");
       driver.findElement(password).sendKeys("admin123");
       driver.findElement(submit).click();

   }
}


