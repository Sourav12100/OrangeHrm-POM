package Test;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    @Test

    public void LoginTest() throws InterruptedException{
        pageFactory.getLoginPage().login();
        pageFactory.getMenu().menu();
        pageFactory.getAdduser().start();
        pageFactory.getAddUserDetails().User();
        pageFactory.getAdminUserRegistration();

    }
}

