package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private Menu menu;

    private AddUser adduser;

    private AddUserDetails adduserdetails;

    public PageFactory(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public PageFactory(Menu menu) {
        this.menu = menu;
    }

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public PageFactory(AddUser adduser) {
        this.driver = driver;

    }

    public PageFactory(AddUserDetails adduserdetails) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public Menu getMenu() {
        if (menu == null) {
            menu = new Menu(driver);
        }
        return menu;
    }

    public AddUser getAdduser() {
        if (adduser == null) {
            adduser = new AddUser(driver);
        }
        return adduser;
    }

    public AddUserDetails getAddUserDetails() {
        if (adduserdetails == null) {
            adduserdetails = new AddUserDetails(driver);
        }
        return adduserdetails;
    }

}
