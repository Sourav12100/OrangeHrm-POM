package Test;

import org.testng.annotations.Test;

public class LeavePageTest extends BaseClass {
  @Test
    public void LeavePageTest() throws InterruptedException{

        pageFactory.getLoginPage().login();
        pageFactory.getLeavePage().LeaveVerification();

    }


  }
