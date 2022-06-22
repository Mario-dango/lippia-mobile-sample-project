package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginConstants.LOGIN_BUTTON_LOCATOR);
    }

    public static void pantallaDeInicioCargada(String Locator){
        MobileActionManager.waitVisibility(LoginConstants.LABEL, Locator);
    }
    public static void isViewLoaded( ){
        MobileActionManager.waitVisibility(LoginConstants.LOGIN_LABEL);
        //MobileActionManager.isVisible(Assert.assertTrue( MobileActionManager.isVisible(LoginConstants.LOGIN_BUTTON_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE););
    }

}
