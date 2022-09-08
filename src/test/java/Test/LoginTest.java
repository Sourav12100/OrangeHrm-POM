package Test;

import org.testng.annotations.IParameterizable;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {


    @Test
    public void LoginTest() throws InterruptedException{
        pageFactory.getLoginPage().login();
        pageFactory.getMenu().menu();
        pageFactory.getAdduser().start();
        pageFactory.getAddUserDetails().User();
        pageFactory.getAdminUserRegistration().UserVerification();
        pageFactory.getLeavePage().LeaveVerification();

    }
}

