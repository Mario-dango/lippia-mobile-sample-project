package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void putCorreo(String email){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
    }
    public static void putClave(String clave){
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, clave);
    }

    public static void clickOn(String label){
        MobileActionManager.click(LoginConstants.BUTTON_LOCATOR, label);
    }

    public static void seVisualizaEtiqueta(String Locator){
        MobileActionManager.waitVisibility(LoginConstants.LABEL, Locator);
    }
    public static void pantallaDeInicioCargada( ){
        MobileActionManager.waitVisibility(LoginConstants.LOGIN_LABEL);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR));
    }

}
