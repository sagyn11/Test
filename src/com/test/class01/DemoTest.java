package com.test.class01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {

    @Before
    public void setUp(){
        System.out.println("==============Before=================");
        System.out.println("open website");
        System.out.println("verify login page is displayed");
    }
    @After
    public void closeBrowser(){
        System.out.println("===========After=================");
        System.out.println("Close Browser");
    }

    @Test
    public void verifyUserCanLoginIntoTheApp() {
        System.out.println("=============Test 1=====================");
        System.out.println("enter correct username adn password");
        System.out.println("click on login button");
        System.out.println("verify login successful");
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCred() {
        System.out.println("=============Test 2=====================");
        System.out.println("enter invalid username and password");
        System.out.println("click on login button");
        System.out.println("verify invalid login error message");
    }

    @Test
    public void verifyUserCanLogout() {
        System.out.println("=============Test 3=====================");
        System.out.println("enter correct username adn password");
        System.out.println("click on login button");
        System.out.println("verify login successful");
        System.out.println("click on login button");
        System.out.println("verify login page is displayed");
    }


}
